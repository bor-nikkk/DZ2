package com.bornikkk.mydz2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val MY_LOG_TAG = "MYLOGTAG"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(MY_LOG_TAG, "Ты видел деву на скале")
        Log.d(MY_LOG_TAG, "В одежде белой над волнами")
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
        super.onStart()
        Log.d(MY_LOG_TAG, "Когда, бушуя в бурной мгле,")
        Log.d(MY_LOG_TAG, "Играло море с берегами,")
    }

    override fun  onResume(){
        super.onResume()
        Log.d(MY_LOG_TAG, "Когда луч молний озарял")
        Log.d(MY_LOG_TAG, "Ее всечасно блеском алым")
    }
    override fun onPause(){
        super.onPause()
        Log.d(MY_LOG_TAG, "И ветер бился и летал")
        Log.d(MY_LOG_TAG, "С ее летучим покрывалом?")
    }

    override fun  onStop(){
        super.onStop()
        Log.d(MY_LOG_TAG, "Прекрасно море в бурной мгле")
        Log.d(MY_LOG_TAG, "И небо в блесках без лазури;")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_LOG_TAG, "Но верь мне: дева на скале")
        Log.d(MY_LOG_TAG, "Прекрасней волн, небес и бури.")
    }


}
/*
Ты видел деву на скале
В одежде белой над волнами
Когда, бушуя в бурной мгле,
Играло море с берегами,
Когда луч молний озарял
Ее всечасно блеском алым
И ветер бился и летал
С ее летучим покрывалом?
Прекрасно море в бурной мгле
И небо в блесках без лазури;
Но верь мне: дева на скале
Прекрасней волн, небес и бури.
 */