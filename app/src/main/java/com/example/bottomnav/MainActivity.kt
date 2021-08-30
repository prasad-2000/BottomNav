package com.example.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView = findViewById<BottomNavigationView>(R.id.nav)

        navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.firstFragments -> {
                    fragg(first_fragment())
                }
                R.id.secondFragment->{
                    fragg(second_fragment())
                }
                R.id.thirdFragment->{
                    fragg(third_fragment())
                }

            }
            true
        }
    }
    fun fragg(a:Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.navHost,a)
            addToBackStack(null)
            commit()
        }
    }

}