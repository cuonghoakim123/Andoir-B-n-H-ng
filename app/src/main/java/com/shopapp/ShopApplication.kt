package com.shopapp

import android.app.Application
import com.shopapp.data.database.AppDatabase
import com.shopapp.data.database.DatabaseSeeder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShopApplication : Application() {
    
    val database by lazy { AppDatabase.getDatabase(this) }
    
    override fun onCreate() {
        super.onCreate()

        android.util.Log.d("ShopApplication", "Application starting...")

        // Initialize database with sample data
        CoroutineScope(Dispatchers.IO).launch {
            android.util.Log.d("ShopApplication", "Starting database seeding...")
            val seeder = DatabaseSeeder(database)
            seeder.seedDatabase()

            // Verify user was created
            val demoUser = database.userDao().getUserById("user_demo")
            if (demoUser != null) {
                android.util.Log.d("ShopApplication", "Demo user verified: ${demoUser.fullName}")
            } else {
                android.util.Log.e("ShopApplication", "Demo user NOT found after seeding!")
            }
        }
    }
}
