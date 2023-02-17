package com.generamobile.headsoccerlali.vufrijokdf

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.headsoccerlali.R
import com.mvffg.btwolib.decrypt
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec


class Oisjshuxgycs : Fragment() {

    val hbvbhcxjixcv = SecretKeySpec("6w9z\$C&F)H@McQfTjWnZr4u7x!A%D*G-".toByteArray(), "AES")
    lateinit var rokekokosokad: String
    val ncxnnvjxcusdhushdv: SharedPreferences by inject(named("SharedPreferences"))
    val aoooskskdjiwjiijxnujcz = IvParameterSpec(ByteArray(16))
    private lateinit var llzxlcokijiashuhu: Context
    val fokrkookelpdasflp = "AES/CBC/PKCS5Padding"
    lateinit var apaposllskoxczjizxicj: String
    lateinit var uchuxvhuxcijdsji: String
    val hchuzxijjizxuhshuahu by activityViewModel<Noosksijjixhubcsy>(named("MainModel"))



    override fun onStart() {
        super.onStart()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.psosolsdokxjicjiixz, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hchuzxijjizxuhshuahu.mmmzxckzxkijzxuhsayaysgyas.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                ncxnnvjxcusdhushdv.edit().putString("mainId", main).apply()
            }
        }

        hchuzxijjizxuhshuahu.llzxockzxji.observe(viewLifecycleOwner) {
            if (it != null) {
                apaposllskoxczjizxicj = it.mirac_forest_gdishudf
                rokekokosokad = it.mirac_forest_apowijdhs
                uchuxvhuxcijdsji = it.mirac_forest_vydisjf
                val okokasdjixhuc = decrypt(fokrkookelpdasflp, apaposllskoxczjizxicj, hbvbhcxjixcv, aoooskskdjiwjiijxnujcz)
                val roekoek = decrypt(fokrkookelpdasflp, uchuxvhuxcijdsji, hbvbhcxjixcv, aoooskskdjiwjiijxnujcz)

                ncxnnvjxcusdhushdv.edit().putString("countryDev", okokasdjixhuc).apply()
                ncxnnvjxcusdhushdv.edit().putString("apps", rokekokosokad).apply()
                ncxnnvjxcusdhushdv.edit().putString("wv", roekoek).apply()

                findNavController().navigate(R.id.adpppdokcjivx)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        llzxlcokijiashuhu = context
    }
}