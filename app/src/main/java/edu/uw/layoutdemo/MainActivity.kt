package edu.uw.layoutdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //        setContentView(R.layout.activity_relative);
        //        setContentView(R.layout.input_control_layout);

        //val button: Button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            //val stub = findViewById<View>(R.id.stub) as ViewStub
            if (stub != null) {
                val inflated = stub.inflate()
            }
        }
    }
}
