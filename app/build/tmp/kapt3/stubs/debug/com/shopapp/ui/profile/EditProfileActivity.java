package com.shopapp.ui.profile;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/shopapp/ui/profile/EditProfileActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/shopapp/databinding/ActivityEditProfileBinding;", "currentUser", "Lcom/shopapp/data/model/User;", "userRepository", "Lcom/shopapp/data/repository/UserRepository;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "saveProfile", "setupClickListeners", "setupUI", "Companion", "app_debug"})
public final class EditProfileActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.shopapp.databinding.ActivityEditProfileBinding binding;
    private com.shopapp.data.repository.UserRepository userRepository;
    private com.shopapp.data.model.User currentUser;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_USER = "extra_user";
    @org.jetbrains.annotations.NotNull()
    public static final com.shopapp.ui.profile.EditProfileActivity.Companion Companion = null;
    
    public EditProfileActivity() {
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
    
    private final void saveProfile() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/shopapp/ui/profile/EditProfileActivity$Companion;", "", "()V", "EXTRA_USER", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}