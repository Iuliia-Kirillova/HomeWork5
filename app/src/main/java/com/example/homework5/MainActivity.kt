package com.example.homework5

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val TAG = "STATE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "У лукоморья дуб зеленый;");
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Златая цепь на дубе том:")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "И днем и ночью кот ученый")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Всё ходит по цепи кругом;")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Идёт направо — песнь заводит,")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Налево — сказку говорит...")
    }



}