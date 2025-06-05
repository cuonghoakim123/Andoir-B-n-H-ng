package com.shopapp.ui.profile

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.shopapp.ShopApplication
import com.shopapp.data.model.User
import com.shopapp.data.repository.UserRepository
import com.shopapp.databinding.ActivityEditProfileBinding
import kotlinx.coroutines.launch

class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding
    private lateinit var userRepository: UserRepository
    private lateinit var currentUser: User

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize repository
        val database = (application as ShopApplication).database
        userRepository = UserRepository(database.userDao())

        // Get user from intent
        currentUser = intent.getParcelableExtra<User>(EXTRA_USER) ?: return

        setupUI()
        setupClickListeners()
    }

    private fun setupUI() {
        binding.apply {
            // Fill current user data
            editFullName.setText(currentUser.fullName)
            editEmail.setText(currentUser.email)
            editPhone.setText(currentUser.phone)
            editAddress.setText(currentUser.address)
        }
    }

    private fun setupClickListeners() {
        binding.apply {
            backButton.setOnClickListener {
                finish()
            }

            saveButton.setOnClickListener {
                saveProfile()
            }
        }
    }

    private fun saveProfile() {
        val fullName = binding.editFullName.text.toString().trim()
        val email = binding.editEmail.text.toString().trim()
        val phone = binding.editPhone.text.toString().trim()
        val address = binding.editAddress.text.toString().trim()

        // Validate input
        if (fullName.isEmpty()) {
            binding.editFullName.error = "Vui lòng nhập họ tên"
            return
        }

        if (email.isEmpty()) {
            binding.editEmail.error = "Vui lòng nhập email"
            return
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.editEmail.error = "Email không hợp lệ"
            return
        }

        lifecycleScope.launch {
            try {
                // Update user profile using repository method
                val result = userRepository.updateUserProfile(
                    userId = currentUser.id,
                    fullName = fullName,
                    phoneNumber = phone,
                    address = address
                )

                result.onSuccess {
                    Toast.makeText(this@EditProfileActivity, "Cập nhật thành công", Toast.LENGTH_SHORT).show()
                    finish()
                }.onFailure { error ->
                    Toast.makeText(this@EditProfileActivity, "Lỗi: ${error.message}", Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception) {
                Toast.makeText(this@EditProfileActivity, "Lỗi: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
