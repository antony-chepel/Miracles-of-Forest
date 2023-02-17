package com.generamobile.headsoccerlali.vufrijokdf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.generamobile.headsoccerlali.databinding.ActivityUoisishhxuzgycsBinding
import kotlin.random.Random

class Uoisishhxuzgycs : AppCompatActivity() {
    private lateinit var usijxokzcuis : ActivityUoisishhxuzgycsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        usijxokzcuis = ActivityUoisishhxuzgycsBinding.inflate(layoutInflater)
        setContentView(usijxokzcuis.root)
        wpwpkosakod()
    }



    private fun wpwpkosakod() = with(usijxokzcuis){
        val palslppasloksd = intent.getStringExtra("win_total_mir_fst")
        val doskfoksdfko = listOf(
            50,
            100,
            200,
            250,
            300,
            400,
            500,
            700,
            800,
            900,
            1000,
            2000,
            5000
        )
        val jcxjvijsdudsko = doskfoksdfko[Random.nextInt(13)]

        if(palslppasloksd == "win_mys"){
            tokkosdfkokodf.text= "Good job,you win!"
            kfodkocxvkook.text = "Your forest scores is - $jcxjvijsdudsko"
        }else{
            tokkosdfkokodf.text= "Unfrotrunately,bad luck now"
            kfodkocxvkook.visibility= View.GONE
        }

        sdokskkowko.setOnClickListener {
            startActivity(Intent(this@Uoisishhxuzgycs,Nisijsishuuxcgys::class.java))
        }
    }
}