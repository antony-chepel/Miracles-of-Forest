package com.generamobile.headsoccerlali.vufrijokdf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import androidx.core.content.ContextCompat
import com.generamobile.headsoccerlali.R
import com.generamobile.headsoccerlali.databinding.ActivityEqijsuhxjicsdfBinding
import kotlin.random.Random

class Eqijsuhxjicsdf : AppCompatActivity() {

    private lateinit var jkxjzncjsacashchba : ActivityEqijsuhxjicsdfBinding
    val pzxockokozjiiasj = listOf(
        R.drawable.mr_f_1,
        R.drawable.mr_f_2,
        R.drawable.mr_f_3,
        R.drawable.mr_f_4,
        R.drawable.mr_f_5,
        R.drawable.mr_f_6,
    )

    private var uhasdijasijadsji: CountDownTimer? = null

    val uxjizcosakokoacs = listOf(
        "Extra Bonus to Win : x2",
        "Extra Bonus to Win : x5",
        "Extra Bonus to Win : x10",
        "Extra Bonus to Win : x15",
        "Extra Bonus to Win : x50",
        "Extra Bonus to Win : x100",

        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jkxjzncjsacashchba = ActivityEqijsuhxjicsdfBinding.inflate(layoutInflater)
        setContentView(jkxjzncjsacashchba.root)
        jkxjzncjsacashchba.hcijxjiij.setOnClickListener {
            gyzxcijxijjijiasjaisc()
        }
    }


    private fun gyzxcijxijjijiasjaisc() = with(jkxjzncjsacashchba){

        var llxzokcijjaygwgydgbyggydsa = 0
        uhasdijasijadsji?.cancel()
        uhasdijasijadsji = object : CountDownTimer(3000,100){
            override fun onTick(millisUntilFinished: Long) {
                llxzokcijjaygwgydgbyggydsa++
                hcijxjiij.isClickable = false
                hcijxjiij.alpha = 0.5f
                if(llxzokcijjaygwgydgbyggydsa>5)llxzokcijjaygwgydgbyggydsa = 0
                osakdiwjjijisad.setImageResource(pzxockokozjiiasj[llxzokcijjaygwgydgbyggydsa])
                 mmxzckiozxijsaija.text = uxjizcosakokoacs[llxzokcijjaygwgydgbyggydsa]

            }

            override fun onFinish() {
                tsafdwhu()
                hcijxjiij.isClickable = true
                hcijxjiij.alpha = 1.0f

            }

        }.start()

    }

    override fun onDestroy() {
        super.onDestroy()
        uhasdijasijadsji?.cancel()
    }


    private fun tsafdwhu() = with(jkxjzncjsacashchba){
         val oxzcpzxksaijji = intent.getIntExtra("img",R.drawable.mr_f_1)
        val ysaduasijdas = pzxockokozjiiasj[Random.nextInt(6)]
        osakdiwjjijisad.setImageResource(ysaduasijdas)
        val zxijcjiczxjizxc = uxjizcosakokoacs[Random.nextInt(6)]
        mmxzckiozxijsaija.text = zxijcjiczxjizxc
        if(osakdiwjjijisad.drawable.constantState == ContextCompat.getDrawable(this@Eqijsuhxjicsdf, oxzcpzxksaijji)?.constantState){
            Handler().postDelayed({
                startActivity(Intent(this@Eqijsuhxjicsdf,Uoisishhxuzgycs::class.java)
                    .putExtra("win_total_mir_fst","win_mys")
                )
            },1000)
        } else {
            Handler().postDelayed({
                startActivity(Intent(this@Eqijsuhxjicsdf,Uoisishhxuzgycs::class.java)
                    .putExtra("win_total_mir_fst","loose_mys")
                )
            },1000)
        }
    }



}