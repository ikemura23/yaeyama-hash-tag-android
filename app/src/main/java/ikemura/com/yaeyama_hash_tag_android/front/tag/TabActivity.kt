package ikemura.com.yaeyama_hash_tag_android.front.tag

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.app.AppCompatDelegate
import ikemura.com.yaeyama_hash_tag_android.R


class TabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Vector Drawable
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

        setContentView(R.layout.tab_activity)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        //Fragment
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.tab_container, TabFragment.newInstance(intent.extras))
                .commit()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}