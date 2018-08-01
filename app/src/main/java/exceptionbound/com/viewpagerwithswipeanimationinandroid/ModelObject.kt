package exceptionbound.com.viewpagerwithswipeanimationinandroid

/**
 * Created by Boss on 12/17/2016.
 */

enum class ModelObject private constructor(val titleResId: Int, val layoutResId: Int) {

    PINK(R.color.pink_color, R.layout.view_pink),
    DEEP_ORANGE(R.color.deep_orange_color, R.layout.view_deep_orange),
    ORANGE(R.color.orange_color, R.layout.view_orange)

}
