package com.generamobile.headsoccerlali.isijhuwdhu

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class Yowokwkosjixhucs : Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId("8d0a07af-060f-4534-b407-0961e1f7820b")
        MyTracker.initTracker("09018373724838119102", this)

        val ucixjivhusdhsd = MyTracker.getTrackerConfig()
        ucixjivhusdhsd.isTrackingLaunchEnabled = true
        val mmxcmkvkcxidsijsdj = MyTracker.getInstanceId(this)
        val roeokpwlpwlposd = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        roeokpwlpwlposd.edit().putString("instId", mmxcmkvkcxidsijsdj).apply()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Yowokwkosjixhucs)
            modules(
                listOf(
                    ixjjicsokcshu, palaslpkoqjisjiqsjijihusd
                )
            )
        }
    }
}