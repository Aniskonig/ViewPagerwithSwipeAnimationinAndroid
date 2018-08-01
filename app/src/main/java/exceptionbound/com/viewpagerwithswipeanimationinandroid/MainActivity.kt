package exceptionbound.com.viewpagerwithswipeanimationinandroid

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById(R.id.view_pager) as ViewPager
        viewPager.adapter = CustomPagerAdapter(this)
    }
}
