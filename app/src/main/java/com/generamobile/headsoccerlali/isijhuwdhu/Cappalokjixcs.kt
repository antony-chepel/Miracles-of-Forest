package com.generamobile.headsoccerlali.isijhuwdhu

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.generamobile.headsoccerlali.vufrijokdf.Noosksijjixhubcsy
import com.squareup.moshi.Moshi
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val ixjjicsokcshu = module {
    single<Uiowowkkoijshdxc>(named("HostInter")) {
        get<Retrofit>(named("RetroDev"))
            .create(Uiowowkkoijshdxc::class.java)
    }

    single <Nowwiujisdisa> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Nowwiujisdisa::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    single<Retrofit>(named("RetroDev")) {
        Retrofit.Builder()
            .baseUrl("http://miraclesofforest.xyz/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    factory(named("DevRep")) {
        Tieoekkojiasdji(get(named("HostInter")))
    }
    factory (named("CountryRep")) {
        Vodkdkodjijijizxicz(get(named("ApiInter")))
    }

    single {
        jnxzjncjnsusgygs()
    }
    single(named("SharedPreferences")) {
        nxnzijcsuhscyg(androidApplication())
    }

}
fun nxnzijcsuhscyg(ixiokcsjijisc: Application): SharedPreferences {
    return ixiokcsjijisc.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun jnxzjncjnsusgygs(): Moshi {
    return Moshi.Builder().build()
}

val palaslpkoqjisjiqsjijihusd = module {
    viewModel (named("MainModel")){
        Noosksijjixhubcsy(get(named("CountryRep")), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
}