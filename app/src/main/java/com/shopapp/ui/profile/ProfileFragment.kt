package com.shopapp.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.shopapp.ShopApplication
import com.shopapp.data.model.User
import com.shopapp.data.repository.UserRepository
import com.shopapp.databinding.FragmentProfileBinding
import com.shopapp.ui.auth.AuthActivity
import kotlinx.coroutines.launch

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    private lateinit var userRepository: UserRepository
    private var currentUser: User? = null
    private val currentUserId = "user_demo" // In real app, get from session

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize repository
        val database = (requireActivity().application as ShopApplication).database
        userRepository = UserRepository(database.userDao())

        setupClickListeners()
        loadUserProfile()

        // Test: Force create demo user if not exists
        testCreateDemoUser()
    }

    private fun setupClickListeners() {
        binding.editProfileCard.setOnClickListener {
            currentUser?.let { user ->
                val intent = Intent(requireContext(), EditProfileActivity::class.java)
                intent.putExtra(EditProfileActivity.EXTRA_USER, user)
                startActivity(intent)
            }
        }

        binding.myOrdersCard.setOnClickListener {
            val intent = Intent(requireContext(), MyOrdersActivity::class.java)
            startActivity(intent)
        }

        binding.loginCard.setOnClickListener {
            // Navigate to login/register
            startActivity(Intent(requireContext(), AuthActivity::class.java))
        }

        binding.logoutCard.setOnClickListener {
            logout()
        }
    }

    private fun loadUserProfile() {
        lifecycleScope.launch {
            try {
                // Add small delay to ensure database seeding is complete
                kotlinx.coroutines.delay(1000)

                android.util.Log.d("ProfileFragment", "Loading user with ID: $currentUserId")
                val userEntity = userRepository.getUserById(currentUserId)
                android.util.Log.d("ProfileFragment", "User found: $userEntity")

                if (userEntity != null) {
                    // Convert UserEntity to User
                    val user = User(
                        id = userEntity.userId,
                        email = userEntity.email,
                        fullName = userEntity.fullName,
                        phone = userEntity.phoneNumber ?: "",
                        address = userEntity.address ?: ""
                    )
                    currentUser = user
                    android.util.Log.d("ProfileFragment", "Showing logged in UI for: ${user.fullName}")
                    updateUI(user, isLoggedIn = true)
                } else {
                    // User not found, show login state
                    android.util.Log.d("ProfileFragment", "User not found, showing login state")
                    updateUI(null, isLoggedIn = false)
                }
            } catch (e: Exception) {
                // Error loading user, show login state
                android.util.Log.e("ProfileFragment", "Error loading user: ${e.message}", e)
                updateUI(null, isLoggedIn = false)
            }
        }
    }

    private fun updateUI(user: User?, isLoggedIn: Boolean) {
        binding.apply {
            if (isLoggedIn && user != null) {
                // Show logged in state
                userName.text = user.fullName.ifEmpty { "Người dùng" }
                userEmail.text = user.email
                userPhone.text = user.phone.ifEmpty { "Chưa cập nhật" }
                userAddress.text = user.address.ifEmpty { "Chưa cập nhật" }

                // Show logged in options
                editProfileCard.visibility = View.VISIBLE
                myOrdersCard.visibility = View.VISIBLE
                logoutCard.visibility = View.VISIBLE

                // Hide login option
                loginCard.visibility = View.GONE

            } else {
                // Show login state
                userName.text = "Khách"
                userEmail.text = "Vui lòng đăng nhập"
                userPhone.text = "Chưa cập nhật"
                userAddress.text = "Chưa cập nhật"

                // Hide logged in options
                editProfileCard.visibility = View.GONE
                myOrdersCard.visibility = View.GONE
                logoutCard.visibility = View.GONE

                // Show login option
                loginCard.visibility = View.VISIBLE
            }
        }
    }

    private fun logout() {
        // Clear user session (in real app, clear SharedPreferences or session)
        currentUser = null

        // Update UI to show login state
        updateUI(null, isLoggedIn = false)

        // Optionally navigate to login
        // startActivity(Intent(requireContext(), AuthActivity::class.java))
    }

    override fun onResume() {
        super.onResume()
        // Reload user profile when returning from edit profile
        loadUserProfile()
    }

    private fun testCreateDemoUser() {
        lifecycleScope.launch {
            try {
                android.util.Log.d("ProfileFragment", "Testing demo user creation...")

                // Check if user exists
                val existingUser = userRepository.getUserById("user_demo")
                if (existingUser == null) {
                    android.util.Log.d("ProfileFragment", "Demo user not found, creating...")

                    // Create demo user directly using UserDao
                    val database = (requireActivity().application as ShopApplication).database
                    val demoUser = com.shopapp.data.database.entity.UserEntity(
                        userId = "user_demo",
                        email = "cuonghotran17022004@gmail.com",
                        passwordHash = "demo_password_hash",
                        fullName = "Nguyễn Cường",
                        phoneNumber = "0356012250",
                        address = "Hà Nội, Việt Nam",
                        avatarUrl = null,
                        isVerified = true,
                        createdAt = System.currentTimeMillis(),
                        updatedAt = System.currentTimeMillis()
                    )

                    database.userDao().insertUser(demoUser)
                    android.util.Log.d("ProfileFragment", "Demo user created successfully!")

                    // Reload profile
                    loadUserProfile()
                } else {
                    android.util.Log.d("ProfileFragment", "Demo user already exists: ${existingUser.fullName}")
                }
            } catch (e: Exception) {
                android.util.Log.e("ProfileFragment", "Error in testCreateDemoUser: ${e.message}", e)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
