package com.geektech.bigdickbro

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.geektech.bigdickbro.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_authorization)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}