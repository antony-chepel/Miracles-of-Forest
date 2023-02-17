package com.generamobile.headsoccerlali.isijhuwdhu

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.headsoccerlali.R
import com.generamobile.headsoccerlali.vufrijokdf.Noosksijjixhubcsy
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Mkosoksijxuhcs : Fragment() {
    private lateinit var lslaodoasiasdhu: Context

    val usoskdkosjijx by activityViewModel<Noosksijjixhubcsy>(named("MainModel"))

    lateinit var rokeko: String

    val nnncxjvisdjisdji: SharedPreferences by inject(named("SharedPreferences"))


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val fokrkokooksdkof = nnncxjvisdjisdji.getString("apps", null)
        val psaodolasdlk = nnncxjvisdjisdji.getString("appCamp", null)

        if (fokrkokooksdkof=="1" && psaodolasdlk == null) {
            usoskdkosjijx.dokkoxkookckokosko(lslaodoasiasdhu)
            usoskdkosjijx.mkxzciozxjijsa.observe(viewLifecycleOwner) {
                if (it != null) {
                    rokeko = it.toString()
                    nnncxjvisdjisdji.edit().putString("appCamp", rokeko).apply()
                    findNavController().navigate(R.id.clxlxlckdsijf)
                }
            }
        } else {
            findNavController().navigate(R.id.clxlxlckdsijf)
        }
    }


    override fun onStart() {
        super.onStart()

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        lslaodoasiasdhu = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.kkxcojsiajihuc, container, false)
    }


}