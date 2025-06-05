package com.shopapp.ui.cart;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0012H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\u001a\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\fH\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u0012H\u0002J\b\u0010$\u001a\u00020\u0012H\u0002J\u0018\u0010%\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\f2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/shopapp/ui/cart/CartFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/shopapp/databinding/FragmentCartBinding;", "binding", "getBinding", "()Lcom/shopapp/databinding/FragmentCartBinding;", "cartAdapter", "Lcom/shopapp/ui/cart/CartAdapter;", "cartItems", "", "Lcom/shopapp/data/model/CartItem;", "cartRepository", "Lcom/shopapp/data/repository/CartRepository;", "currentUserId", "", "addDemoItemsToCart", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCartItems", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "removeItem", "cartItem", "setupClickListeners", "setupRecyclerView", "updateEmptyState", "updateQuantity", "newQuantity", "", "updateTotalPrice", "app_release"})
public final class CartFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.shopapp.databinding.FragmentCartBinding _binding;
    private com.shopapp.ui.cart.CartAdapter cartAdapter;
    private com.shopapp.data.repository.CartRepository cartRepository;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.shopapp.data.model.CartItem> cartItems = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currentUserId = "user_demo";
    
    public CartFragment() {
        super();
    }
    
    private final com.shopapp.databinding.FragmentCartBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupClickListeners() {
    }
    
    private final void loadCartItems() {
    }
    
    private final java.lang.Object addDemoItemsToCart(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void updateQuantity(com.shopapp.data.model.CartItem cartItem, int newQuantity) {
    }
    
    private final void removeItem(com.shopapp.data.model.CartItem cartItem) {
    }
    
    private final void updateTotalPrice() {
    }
    
    private final void updateEmptyState() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}