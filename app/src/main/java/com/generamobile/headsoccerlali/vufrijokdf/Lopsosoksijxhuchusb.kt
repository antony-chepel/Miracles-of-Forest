package com.generamobile.headsoccerlali.vufrijokdf
import com.mvffg.btwolib.BTwoLib
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class Lopsosoksijxhuchusb : AppCompatActivity() {

    lateinit var hhcvuxicvj: BTwoLib
    val ooospdlaokdas: SharedPreferences by inject(named("SharedPreferences"))



    private fun jjjcvxijjicuhsdv(): String {
        val eokkosadko = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val pxzcpozxkkozxjis = ooospdlaokdas.getString("link", null)
        eokkosadko.edit().putString("SAVED_URL", pxzcpozxkkozxjis).apply()
        return eokkosadko.getString("SAVED_URL", pxzcpozxkkozxjis).toString()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hhcvuxicvj = BTwoLib(this@Lopsosoksijxhuchusb)
        setContentView(hhcvuxicvj)
        hhcvuxicvj.profiter(jjjcvxijjicuhsdv())
    }


    override fun onBackPressed() {
        if (!hhcvuxicvj.onBackPressed()) {
            return
        }
        super.onBackPressed()
    }
    override fun onActivityResult(soadkko: Int, pxzckzxoko: Int, ysusdhs: Intent?) {
        super.onActivityResult(soadkko, pxzckzxoko, ysusdhs)
        if (ysusdhs != null) {
            hhcvuxicvj.onActivityResult(soadkko, pxzckzxoko, ysusdhs)
        }
    }

}