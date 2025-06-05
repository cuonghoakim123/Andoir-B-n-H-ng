package com.shopapp.payment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 !2\u00020\u0001:\u0004!\"#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0006\u0010\u0013\u001a\u00020\u0014Jn\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/shopapp/payment/MoMoPaymentService;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createPayment", "", "orderId", "", "amount", "", "orderInfo", "callback", "Lcom/shopapp/payment/MoMoPaymentService$PaymentCallback;", "(Ljava/lang/String;JLjava/lang/String;Lcom/shopapp/payment/MoMoPaymentService$PaymentCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRealMoMoPayment", "hmacSHA256", "data", "key", "isMoMoInstalled", "", "verifyPaymentResult", "partnerCode", "requestId", "orderType", "transId", "resultCode", "", "message", "payType", "responseTime", "extraData", "signature", "Companion", "PaymentCallback", "PaymentRequest", "PaymentResponse", "app_release"})
public final class MoMoPaymentService {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "MoMoPaymentService";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PARTNER_CODE = "MOMO";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ACCESS_KEY = "F8BBA842ECF85";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SECRET_KEY = "K951B6PE1waDMi640xX08PD3vg6EkVlz";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ENDPOINT = "https://test-payment.momo.vn/v2/gateway/api/create";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String REDIRECT_URL = "https://webhook.site/b3088a6a-2d17-4f8d-a383-71389a6c600b";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String IPN_URL = "https://webhook.site/b3088a6a-2d17-4f8d-a383-71389a6c600b";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String REQUEST_TYPE = "payWithATM";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ORDER_INFO = "pay with MoMo";
    @org.jetbrains.annotations.NotNull()
    public static final com.shopapp.payment.MoMoPaymentService.Companion Companion = null;
    
    public MoMoPaymentService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createPayment(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String orderInfo, @org.jetbrains.annotations.NotNull()
    com.shopapp.payment.MoMoPaymentService.PaymentCallback callback, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Real MoMo API integration (commented out for demo)
     */
    private final java.lang.Object createRealMoMoPayment(java.lang.String orderId, long amount, java.lang.String orderInfo, com.shopapp.payment.MoMoPaymentService.PaymentCallback callback, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.String hmacSHA256(java.lang.String data, java.lang.String key) {
        return null;
    }
    
    /**
     * Check if MoMo app is installed
     */
    public final boolean isMoMoInstalled() {
        return false;
    }
    
    /**
     * Verify payment result from MoMo callback
     */
    public final boolean verifyPaymentResult(@org.jetbrains.annotations.NotNull()
    java.lang.String partnerCode, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String requestId, long amount, @org.jetbrains.annotations.NotNull()
    java.lang.String orderInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String orderType, long transId, int resultCode, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String payType, long responseTime, @org.jetbrains.annotations.NotNull()
    java.lang.String extraData, @org.jetbrains.annotations.NotNull()
    java.lang.String signature) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/shopapp/payment/MoMoPaymentService$Companion;", "", "()V", "ACCESS_KEY", "", "ENDPOINT", "IPN_URL", "ORDER_INFO", "PARTNER_CODE", "REDIRECT_URL", "REQUEST_TYPE", "SECRET_KEY", "TAG", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/shopapp/payment/MoMoPaymentService$PaymentCallback;", "", "onError", "", "error", "", "onSuccess", "paymentUrl", "deeplink", "app_release"})
    public static abstract interface PaymentCallback {
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String deeplink);
        
        public abstract void onError(@org.jetbrains.annotations.NotNull()
        java.lang.String error);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u008b\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u000203H\u00d6\u0001J\t\u00104\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015\u00a8\u00065"}, d2 = {"Lcom/shopapp/payment/MoMoPaymentService$PaymentRequest;", "", "partnerCode", "", "partnerName", "storeId", "requestId", "amount", "", "orderId", "orderInfo", "redirectUrl", "ipnUrl", "lang", "extraData", "requestType", "signature", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()J", "getExtraData", "()Ljava/lang/String;", "getIpnUrl", "getLang", "getOrderId", "getOrderInfo", "getPartnerCode", "getPartnerName", "getRedirectUrl", "getRequestId", "getRequestType", "getSignature", "getStoreId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
    public static final class PaymentRequest {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String partnerCode = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String partnerName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String storeId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String requestId = null;
        private final long amount = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String orderId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String orderInfo = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String redirectUrl = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ipnUrl = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lang = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String extraData = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String requestType = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String signature = null;
        
        public PaymentRequest(@org.jetbrains.annotations.NotNull()
        java.lang.String partnerCode, @org.jetbrains.annotations.NotNull()
        java.lang.String partnerName, @org.jetbrains.annotations.NotNull()
        java.lang.String storeId, @org.jetbrains.annotations.NotNull()
        java.lang.String requestId, long amount, @org.jetbrains.annotations.NotNull()
        java.lang.String orderId, @org.jetbrains.annotations.NotNull()
        java.lang.String orderInfo, @org.jetbrains.annotations.NotNull()
        java.lang.String redirectUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String ipnUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String lang, @org.jetbrains.annotations.NotNull()
        java.lang.String extraData, @org.jetbrains.annotations.NotNull()
        java.lang.String requestType, @org.jetbrains.annotations.NotNull()
        java.lang.String signature) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPartnerCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPartnerName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStoreId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRequestId() {
            return null;
        }
        
        public final long getAmount() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrderId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrderInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRedirectUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIpnUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLang() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getExtraData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRequestType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSignature() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        public final long component5() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopapp.payment.MoMoPaymentService.PaymentRequest copy(@org.jetbrains.annotations.NotNull()
        java.lang.String partnerCode, @org.jetbrains.annotations.NotNull()
        java.lang.String partnerName, @org.jetbrains.annotations.NotNull()
        java.lang.String storeId, @org.jetbrains.annotations.NotNull()
        java.lang.String requestId, long amount, @org.jetbrains.annotations.NotNull()
        java.lang.String orderId, @org.jetbrains.annotations.NotNull()
        java.lang.String orderInfo, @org.jetbrains.annotations.NotNull()
        java.lang.String redirectUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String ipnUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String lang, @org.jetbrains.annotations.NotNull()
        java.lang.String extraData, @org.jetbrains.annotations.NotNull()
        java.lang.String requestType, @org.jetbrains.annotations.NotNull()
        java.lang.String signature) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0086\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u000bH\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001b\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00060"}, d2 = {"Lcom/shopapp/payment/MoMoPaymentService$PaymentResponse;", "", "partnerCode", "", "orderId", "requestId", "amount", "", "responseTime", "message", "resultCode", "", "payUrl", "deeplink", "qrCodeUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDeeplink", "()Ljava/lang/String;", "getMessage", "getOrderId", "getPartnerCode", "getPayUrl", "getQrCodeUrl", "getRequestId", "getResponseTime", "getResultCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopapp/payment/MoMoPaymentService$PaymentResponse;", "equals", "", "other", "hashCode", "toString", "app_release"})
    public static final class PaymentResponse {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String partnerCode = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String orderId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String requestId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long amount = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long responseTime = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String message = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer resultCode = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payUrl = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String deeplink = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String qrCodeUrl = null;
        
        public PaymentResponse(@org.jetbrains.annotations.Nullable()
        java.lang.String partnerCode, @org.jetbrains.annotations.Nullable()
        java.lang.String orderId, @org.jetbrains.annotations.Nullable()
        java.lang.String requestId, @org.jetbrains.annotations.Nullable()
        java.lang.Long amount, @org.jetbrains.annotations.Nullable()
        java.lang.Long responseTime, @org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Integer resultCode, @org.jetbrains.annotations.Nullable()
        java.lang.String payUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String deeplink, @org.jetbrains.annotations.Nullable()
        java.lang.String qrCodeUrl) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPartnerCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrderId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRequestId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getResponseTime() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getResultCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeeplink() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getQrCodeUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopapp.payment.MoMoPaymentService.PaymentResponse copy(@org.jetbrains.annotations.Nullable()
        java.lang.String partnerCode, @org.jetbrains.annotations.Nullable()
        java.lang.String orderId, @org.jetbrains.annotations.Nullable()
        java.lang.String requestId, @org.jetbrains.annotations.Nullable()
        java.lang.Long amount, @org.jetbrains.annotations.Nullable()
        java.lang.Long responseTime, @org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Integer resultCode, @org.jetbrains.annotations.Nullable()
        java.lang.String payUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String deeplink, @org.jetbrains.annotations.Nullable()
        java.lang.String qrCodeUrl) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}