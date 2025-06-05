package com.shopapp.payment

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import java.security.MessageDigest
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

class MoMoPaymentService(private val context: Context) {
    
    companion object {
        private const val TAG = "MoMoPaymentService"
        
        // MoMo Test Environment
        private const val PARTNER_CODE = "MOMO"
        private const val ACCESS_KEY = "F8BBA842ECF85"
        private const val SECRET_KEY = "K951B6PE1waDMi640xX08PD3vg6EkVlz"
        private const val ENDPOINT = "https://test-payment.momo.vn/v2/gateway/api/create"
        private const val REDIRECT_URL = "https://webhook.site/b3088a6a-2d17-4f8d-a383-71389a6c600b"
        private const val IPN_URL = "https://webhook.site/b3088a6a-2d17-4f8d-a383-71389a6c600b"
        
        // Request types
        private const val REQUEST_TYPE = "payWithATM"
        private const val ORDER_INFO = "pay with MoMo"
    }
    
    data class PaymentRequest(
        val partnerCode: String,
        val partnerName: String,
        val storeId: String,
        val requestId: String,
        val amount: Long,
        val orderId: String,
        val orderInfo: String,
        val redirectUrl: String,
        val ipnUrl: String,
        val lang: String,
        val extraData: String,
        val requestType: String,
        val signature: String
    )
    
    data class PaymentResponse(
        val partnerCode: String?,
        val orderId: String?,
        val requestId: String?,
        val amount: Long?,
        val responseTime: Long?,
        val message: String?,
        val resultCode: Int?,
        val payUrl: String?,
        val deeplink: String?,
        val qrCodeUrl: String?
    )
    
    interface PaymentCallback {
        fun onSuccess(paymentUrl: String, deeplink: String?)
        fun onError(error: String)
    }
    
    suspend fun createPayment(
        orderId: String,
        amount: Long,
        orderInfo: String = ORDER_INFO,
        callback: PaymentCallback
    ) {
        withContext(Dispatchers.IO) {
            try {
                // Simulate API call delay
                delay(2000)

                // For demo purposes, create a mock payment URL
                val mockPaymentUrl = "https://test-payment.momo.vn/pay?orderId=$orderId&amount=$amount"
                val mockDeeplink = "momo://payment?orderId=$orderId"

                withContext(Dispatchers.Main) {
                    // Simulate 90% success rate
                    if (Math.random() > 0.1) {
                        callback.onSuccess(mockPaymentUrl, mockDeeplink)
                    } else {
                        callback.onError("Simulation: Payment creation failed")
                    }
                }

            } catch (e: Exception) {
                Log.e(TAG, "Payment creation error", e)
                withContext(Dispatchers.Main) {
                    callback.onError("Error: ${e.message}")
                }
            }
        }
    }

    /**
     * Real MoMo API integration (commented out for demo)
     */
    private suspend fun createRealMoMoPayment(
        orderId: String,
        amount: Long,
        orderInfo: String,
        callback: PaymentCallback
    ) {
        // This would be the real implementation
        /*
        withContext(Dispatchers.IO) {
            try {
                val requestId = UUID.randomUUID().toString()
                val extraData = ""

                // Create signature
                val rawSignature = "accessKey=$ACCESS_KEY&amount=$amount&extraData=$extraData&ipnUrl=$IPN_URL&orderId=$orderId&orderInfo=$orderInfo&partnerCode=$PARTNER_CODE&redirectUrl=$REDIRECT_URL&requestId=$requestId&requestType=$REQUEST_TYPE"
                val signature = hmacSHA256(rawSignature, SECRET_KEY)

                val paymentRequest = PaymentRequest(
                    partnerCode = PARTNER_CODE,
                    partnerName = "Test",
                    storeId = PARTNER_CODE,
                    requestId = requestId,
                    amount = amount,
                    orderId = orderId,
                    orderInfo = orderInfo,
                    redirectUrl = REDIRECT_URL,
                    ipnUrl = IPN_URL,
                    lang = "vi",
                    extraData = extraData,
                    requestType = REQUEST_TYPE,
                    signature = signature
                )

                val gson = Gson()
                val jsonBody = gson.toJson(paymentRequest)

                val client = OkHttpClient()
                val mediaType = "application/json; charset=utf-8".toMediaType()
                val requestBody = jsonBody.toRequestBody(mediaType)

                val request = Request.Builder()
                    .url(ENDPOINT)
                    .post(requestBody)
                    .addHeader("Content-Type", "application/json")
                    .build()

                client.newCall(request).execute().use { response ->
                    if (response.isSuccessful) {
                        val responseBody = response.body?.string()
                        Log.d(TAG, "MoMo Response: $responseBody")

                        val paymentResponse = gson.fromJson(responseBody, PaymentResponse::class.java)

                        withContext(Dispatchers.Main) {
                            if (paymentResponse.resultCode == 0 && !paymentResponse.payUrl.isNullOrEmpty()) {
                                callback.onSuccess(paymentResponse.payUrl, paymentResponse.deeplink)
                            } else {
                                callback.onError("Payment creation failed: ${paymentResponse.message}")
                            }
                        }
                    } else {
                        withContext(Dispatchers.Main) {
                            callback.onError("HTTP Error: ${response.code}")
                        }
                    }
                }

            } catch (e: Exception) {
                Log.e(TAG, "Payment creation error", e)
                withContext(Dispatchers.Main) {
                    callback.onError("Error: ${e.message}")
                }
            }
        }
        */
    }
    
    private fun hmacSHA256(data: String, key: String): String {
        try {
            val secretKeySpec = SecretKeySpec(key.toByteArray(), "HmacSHA256")
            val mac = Mac.getInstance("HmacSHA256")
            mac.init(secretKeySpec)
            val hash = mac.doFinal(data.toByteArray())
            return hash.joinToString("") { "%02x".format(it) }
        } catch (e: Exception) {
            throw RuntimeException("Failed to calculate HMAC", e)
        }
    }
    
    /**
     * Check if MoMo app is installed
     */
    fun isMoMoInstalled(): Boolean {
        return try {
            context.packageManager.getPackageInfo("com.mservice.moca.production", 0)
            true
        } catch (e: Exception) {
            false
        }
    }
    
    /**
     * Verify payment result from MoMo callback
     */
    fun verifyPaymentResult(
        partnerCode: String,
        orderId: String,
        requestId: String,
        amount: Long,
        orderInfo: String,
        orderType: String,
        transId: Long,
        resultCode: Int,
        message: String,
        payType: String,
        responseTime: Long,
        extraData: String,
        signature: String
    ): Boolean {
        val rawSignature = "accessKey=$ACCESS_KEY&amount=$amount&extraData=$extraData&message=$message&orderId=$orderId&orderInfo=$orderInfo&orderType=$orderType&partnerCode=$partnerCode&payType=$payType&requestId=$requestId&responseTime=$responseTime&resultCode=$resultCode&transId=$transId"
        val expectedSignature = hmacSHA256(rawSignature, SECRET_KEY)
        return signature == expectedSignature
    }
}
