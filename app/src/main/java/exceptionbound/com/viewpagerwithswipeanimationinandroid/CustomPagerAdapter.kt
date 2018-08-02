package exceptionbound.com.viewpagerwithswipeanimationinandroid

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by Boss on 12/17/2016.
 */

class CustomPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        val modelObject = ModelObject.values()[position]
        // Creating a new instance of our Fragment with this Model Object.
        return AllButtonsFragment.newInstance(modelObject)
    }

    override fun getCount() = ModelObject.values().size
}
