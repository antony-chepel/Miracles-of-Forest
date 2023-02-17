package com.generamobile.headsoccerlali.vufrijokdf

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.generamobile.headsoccerlali.isijhuwdhu.Iowpwkosdasdij
import com.generamobile.headsoccerlali.isijhuwdhu.Vodkdkodjijijizxicz
import com.generamobile.headsoccerlali.isijhuwdhu.Tieoekkojiasdji
import com.generamobile.headsoccerlali.isijhuwdhu.Frplpelpeoaskdjixzjic
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Noosksijjixhubcsy (private val iiokckzxkojiasji: Vodkdkodjijijizxicz, private val fkorokrokjidsijf: Tieoekkojiasdji, private val aoaosksajiisjidj: SharedPreferences, val nnxcixvjuhdsgysdgy: Application): ViewModel(){

    init {
        viewModelScope.launch (Dispatchers.IO){
            uiiwiwwookasijdij()
        }
        viewModelScope.launch (Dispatchers.Main){
            rokekoijasidj()
        }
    }

    private val eplelpeplelpkosdako = MutableLiveData<String>()
    val mkxzciozxjijsa: LiveData<String>
        get() = eplelpeplelpkosdako

    private val tokrokdjisfji = MutableLiveData<Iowpwkosdasdij>()
    val mmzxcijzjx: LiveData<Iowpwkosdasdij>
        get() = tokrokdjisfji

    private val hhusadijwjiij = MutableLiveData<String>()
    val pzxoczxkojizxzxuh: LiveData<String>
        get() = hhusadijwjiij


    private val ysaudhhuas = MutableLiveData<String?>()
    val mmmzxckzxkijzxuhsayaysgyas: LiveData<String?>
        get() = ysaudhhuas

    private val repllpapsdl = MutableLiveData<Frplpelpeoaskdjixzjic>()
    val llzxockzxji: LiveData<Frplpelpeoaskdjixzjic>
        get() = repllpapsdl

    suspend fun vokkogjijicxjiv() {
        try {
            repllpapsdl.postValue(fkorokrokjidsijf.wwowowoksjiadjiasd().body())
        } catch (e:java.lang.Exception) {
        }
    }


    fun uiiwiwwookasijdij() {
        val nncnxnvjidsjokdksijvd = AdvertisingIdClient(nnxcixvjuhdsgysdgy)
        nncnxnvjidsjokdksijvd.start()
        val wokowkosijdijas = nncnxnvjidsjokdksijvd.info.id.toString()
        ysaudhhuas.postValue(wokowkosijdijas)
    }



    fun dokkoxkookckokosko(kkcxvijxc: Context) {
        AppsFlyerLib.getInstance()
            .init("UB9dF4PkYmwUV7F5CDBmS", fkreplelplpasdkoasdok, nnxcixvjuhdsgysdgy)
        AppsFlyerLib.getInstance().start(kkcxvijxc)
    }


    fun ukokokotrkokookokfd(vokckov: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            vokckov
        ) { sidjaijasdji: AppLinkData? ->
            sidjaijasdji?.let {
                val nnxzcnizxjjizxji = sidjaijasdji.targetUri?.host.toString()
                aoaosksajiisjidj.edit().putString("deepSt", nnxzcnizxjjizxji).apply()
            }
        }
    }

    private val fkreplelplpasdkoasdok  = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(fokdkocxkovcoxk: MutableMap<String, Any>?) {
            val gokkokovcbijvji = fokdkocxkovcoxk?.get("campaign").toString()
            eplelpeplelpkosdako.postValue(gokkokovcbijvji)
        }
        override fun onConversionDataFail(error: String?) {
        }
        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }
        override fun onAttributionFailure(error: String?) {
        }
    }


    suspend fun rokekoijasidj() {
        tokrokdjisfji.postValue(iiokckzxkojiasji.fokrkookdsjiisdfj().body())
        vokkogjijicxjiv()
    }


}