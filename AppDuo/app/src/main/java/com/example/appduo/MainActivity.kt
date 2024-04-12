package com.example.appduo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random
import java.security.Security
import java.util.prefs.AbstractPreferences

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var securytyPreferences: SecurityPreferences
    private var filter: Int = MotivationConstants.PHRASEFILTER.GERAL
    private val mock: Mock()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }



