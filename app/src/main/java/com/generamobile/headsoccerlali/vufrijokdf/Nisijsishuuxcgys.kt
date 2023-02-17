package com.generamobile.headsoccerlali.vufrijokdf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.generamobile.headsoccerlali.R
import com.generamobile.headsoccerlali.databinding.ActivityNisiudygedjisfxcBinding

class Nisijsishuuxcgys : AppCompatActivity() {
    private lateinit var mxmzcjixzjic : ActivityNisiudygedjisfxcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mxmzcjixzjic = ActivityNisiudygedjisfxcBinding.inflate(layoutInflater)
        setContentView(mxmzcjixzjic.root)
        uwwoksijd()
    }


    private fun uwwoksijd() = with(mxmzcjixzjic){
        huczxiczoxksk.setOnClickListener {
            startActivity(Intent(this@Nisijsishuuxcgys,Eqijsuhxjicsdf::class.java)
                .putExtra("img",R.drawable.mr_f_1)
            )
        }

        llxzocokzxjisjia.setOnClickListener {
            startActivity(Intent(this@Nisijsishuuxcgys,Eqijsuhxjicsdf::class.java)
                .putExtra("img",R.drawable.mr_f_2)
            )
        }

        kmcmzxmkcmkzxusauh.setOnClickListener {
            startActivity(Intent(this@Nisijsishuuxcgys,Eqijsuhxjicsdf::class.java)
                .putExtra("img",R.drawable.mr_f_3)
            )
        }

        rokkodsfkooksdfok.setOnClickListener {
            startActivity(Intent(this@Nisijsishuuxcgys,Eqijsuhxjicsdf::class.java)
                .putExtra("img",R.drawable.mr_f_4)
            )
        }

        ncxnvbxcusdhijsd.setOnClickListener {
            startActivity(Intent(this@Nisijsishuuxcgys,Eqijsuhxjicsdf::class.java)
                .putExtra("img",R.drawable.mr_f_5)
            )
        }
        odkkofdkosfko.setOnClickListener {
            startActivity(Intent(this@Nisijsishuuxcgys,Eqijsuhxjicsdf::class.java)
                .putExtra("img",R.drawable.mr_f_6)
            )
        }
    }
}