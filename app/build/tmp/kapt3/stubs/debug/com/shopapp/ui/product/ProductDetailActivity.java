package com.shopapp.ui.product;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/shopapp/ui/product/ProductDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/shopapp/databinding/ActivityProductDetailBinding;", "cartRepository", "Lcom/shopapp/data/repository/CartRepository;", "currentUserId", "", "product", "Lcom/shopapp/data/model/Product;", "quantity", "", "addToCart", "", "buyNow", "formatPrice", "price", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupClickListeners", "setupUI", "updateTotalPrice", "Companion", "app_debug"})
public final class ProductDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.shopapp.databinding.ActivityProductDetailBinding binding;
    private com.shopapp.data.model.Product product;
    private com.shopapp.data.repository.CartRepository cartRepository;
    private int quantity = 1;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currentUserId = "user_demo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PRODUCT = "extra_product";
    @org.jetbrains.annotations.NotNull()
    public static final com.shopapp.ui.product.ProductDetailActivity.Companion Companion = null;
    
    public ProductDetailActivity() {
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
    
    private final void updateTotalPrice() {
    }
    
    private final void addToCart() {
    }
    
    private final void buyNow() {
    }
    
    private final java.lang.String formatPrice(double price) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/shopapp/ui/product/ProductDetailActivity$Companion;", "", "()V", "EXTRA_PRODUCT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}