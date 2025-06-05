package com.shopapp.ui.payment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J&\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\bH\u0002J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/shopapp/ui/payment/PaymentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "amount", "", "binding", "Lcom/shopapp/databinding/ActivityPaymentBinding;", "customerName", "", "customerPhone", "momoPaymentService", "Lcom/shopapp/payment/MoMoPaymentService;", "orderInfo", "selectedMethod", "formatPrice", "price", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "processBankTransfer", "processMoMoPayment", "processPayment", "processVNPayPayment", "processZaloPayPayment", "setupClickListeners", "setupUI", "showPaymentDialog", "method", "message", "onProceed", "Lkotlin/Function0;", "showPaymentResult", "isSuccess", "", "simulatePaymentProcess", "Companion", "app_release"})
public final class PaymentActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.shopapp.databinding.ActivityPaymentBinding binding;
    private com.shopapp.payment.MoMoPaymentService momoPaymentService;
    private double amount = 0.0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String orderInfo = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String customerName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String customerPhone = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedMethod = "momo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_AMOUNT = "extra_amount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ORDER_INFO = "extra_order_info";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_CUSTOMER_NAME = "extra_customer_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_CUSTOMER_PHONE = "extra_customer_phone";
    @org.jetbrains.annotations.NotNull()
    public static final com.shopapp.ui.payment.PaymentActivity.Companion Companion = null;
    
    public PaymentActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI() {
    }
    
    private final void setupClickListeners() {
    }
    
    private final void processPayment() {
    }
    
    private final void processMoMoPayment() {
    }
    
    private final void processZaloPayPayment() {
    }
    
    private final void processVNPayPayment() {
    }
    
    private final void processBankTransfer() {
    }
    
    private final void showPaymentDialog(java.lang.String method, java.lang.String message, kotlin.jvm.functions.Function0<kotlin.Unit> onProceed) {
    }
    
    private final void simulatePaymentProcess(java.lang.String method) {
    }
    
    private final void showPaymentResult(boolean isSuccess, java.lang.String method) {
    }
    
    private final java.lang.String formatPrice(double price) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/shopapp/ui/payment/PaymentActivity$Companion;", "", "()V", "EXTRA_AMOUNT", "", "EXTRA_CUSTOMER_NAME", "EXTRA_CUSTOMER_PHONE", "EXTRA_ORDER_INFO", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}