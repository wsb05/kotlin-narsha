package kr.hs.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        printf("hello world")

        var a = 10
        val b = 20

//        printf((a+b)+"")

    }

    fun printf(str : String){
        Log.d("test",str)
    }

}
