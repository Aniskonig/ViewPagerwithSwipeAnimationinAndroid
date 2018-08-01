package exceptionbound.com.viewpagerwithswipeanimationinandroid

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.view_pink.*

class AllButtons  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_pink)

        Home.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
    }
}

