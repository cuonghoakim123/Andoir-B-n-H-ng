package com.shopapp.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.shopapp.data.model.User
import com.shopapp.databinding.ActivityAuthBinding
import com.shopapp.ui.MainActivity

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var firestore: FirebaseFirestore
    private var isLoginMode = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()
        firestore = FirebaseFirestore.getInstance()

        setupUI()
        setupClickListeners()
    }

    private fun setupUI() {
        updateUI()
    }

    private fun updateUI() {
        if (isLoginMode) {
            binding.titleText.text = "Đăng nhập"
            binding.authButton.text = "Đăng nhập"
            binding.switchModeText.text = "Chưa có tài khoản? Đăng ký"
            binding.fullNameLayout.visibility = android.view.View.GONE
            binding.phoneLayout.visibility = android.view.View.GONE
        } else {
            binding.titleText.text = "Đăng ký"
            binding.authButton.text = "Đăng ký"
            binding.switchModeText.text = "Đã có tài khoản? Đăng nhập"
            binding.fullNameLayout.visibility = android.view.View.VISIBLE
            binding.phoneLayout.visibility = android.view.View.VISIBLE
        }
    }

    private fun setupClickListeners() {
        binding.authButton.setOnClickListener {
            if (isLoginMode) {
                login()
            } else {
                register()
            }
        }

        binding.switchModeText.setOnClickListener {
            isLoginMode = !isLoginMode
            updateUI()
            clearFields()
        }
    }

    private fun login() {
        val email = binding.emailEditText.text.toString().trim()
        val password = binding.passwordEditText.text.toString().trim()

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show()
            return
        }

        // Tạm thời bỏ qua Firebase, đăng nhập thành công luôn
        binding.authButton.isEnabled = false

        // Simulate loading
        binding.authButton.postDelayed({
            binding.authButton.isEnabled = true
            Toast.makeText(this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 1000)

        /* Firebase login - tạm thời comment
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                binding.authButton.isEnabled = true
                if (task.isSuccessful) {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(this, "Đăng nhập thất bại: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
        */
    }

    private fun register() {
        val email = binding.emailEditText.text.toString().trim()
        val password = binding.passwordEditText.text.toString().trim()
        val fullName = binding.fullNameEditText.text.toString().trim()
        val phone = binding.phoneEditText.text.toString().trim()

        if (email.isEmpty() || password.isEmpty() || fullName.isEmpty() || phone.isEmpty()) {
            Toast.makeText(this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show()
            return
        }

        if (password.length < 6) {
            Toast.makeText(this, "Mật khẩu phải có ít nhất 6 ký tự", Toast.LENGTH_SHORT).show()
            return
        }

        // Tạm thời bỏ qua Firebase, đăng ký thành công luôn
        binding.authButton.isEnabled = false

        // Simulate loading
        binding.authButton.postDelayed({
            binding.authButton.isEnabled = true
            Toast.makeText(this, "Đăng ký thành công! Chào mừng $fullName", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 1500)

        /* Firebase register - tạm thời comment
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val user = User(
                        id = auth.currentUser?.uid ?: "",
                        email = email,
                        fullName = fullName,
                        phone = phone
                    )

                    firestore.collection("users")
                        .document(user.id)
                        .set(user)
                        .addOnCompleteListener { userTask ->
                            binding.authButton.isEnabled = true
                            if (userTask.isSuccessful) {
                                startActivity(Intent(this, MainActivity::class.java))
                                finish()
                            } else {
                                Toast.makeText(this, "Lỗi lưu thông tin người dùng", Toast.LENGTH_SHORT).show()
                            }
                        }
                } else {
                    binding.authButton.isEnabled = true
                    Toast.makeText(this, "Đăng ký thất bại: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
        */
    }

    private fun clearFields() {
        binding.emailEditText.text?.clear()
        binding.passwordEditText.text?.clear()
        binding.fullNameEditText.text?.clear()
        binding.phoneEditText.text?.clear()
    }
}
