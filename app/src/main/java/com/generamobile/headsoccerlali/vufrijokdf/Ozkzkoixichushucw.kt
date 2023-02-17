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
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Ozkzkoixichushucw : Fragment() {
    lateinit var sijsdjihuwd: String

    private lateinit var ijokokokjizxc: Context

    val apallpwkooksokdakjixc by activityViewModel<Noosksijjixhubcsy>(named("MainModel"))
    val hdokdskojiijcxv: SharedPreferences by inject(named("SharedPreferences"))


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        apallpwkooksokdakjixc.mmzxcijzjx.observe(viewLifecycleOwner) {
            if (it!=null) {
                sijsdjihuwd = it.cou
                hdokdskojiijcxv.edit().putString("country", sijsdjihuwd).apply()
                findNavController().navigate(R.id.zoxoxiyfuhdf)
            }
        }
    }

    override fun onStart() {
        super.onStart()

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.coockvijdvufd, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        ijokokokjizxc = context
    }


}