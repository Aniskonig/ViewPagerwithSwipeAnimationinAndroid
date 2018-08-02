package exceptionbound.com.viewpagerwithswipeanimationinandroid

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AllButtonsFragment : Fragment() {

    companion object {
        private const val EXTRA_COLOR = "EXTRA_COLOR"
        private const val EXTRA_LAYOUT = "EXTRA_LAYOUT"

        fun newInstance(modelObject: ModelObject): Fragment {
            val fragment = AllButtonsFragment()

            // Creating a Bundle with the various values we want to pass, such as the color and layout.
            val bundle = Bundle()
            bundle.putInt(EXTRA_COLOR, modelObject.titleResId)
            bundle.putInt(EXTRA_LAYOUT, modelObject.layoutResId)
            fragment.arguments = bundle

            return fragment
        }
    }

    // Getting the layout from the arguments to inflate the View.
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val layout = arguments?.getInt(EXTRA_LAYOUT)
                ?: throw IllegalStateException("arguments does not contain a layout.")
        return inflater.inflate(layout, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val color = arguments?.getInt(EXTRA_COLOR)
        // TODO: Do whatever with your colour.

        // Using findViewById since this isn't on every layout.
        view?.findViewById<View>(R.id.Home)?.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

