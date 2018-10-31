package dattien96.vn.homefitness

import android.app.Application
import dattien96.vn.homefitness.di.modules
import org.koin.android.ext.android.startKoin

class HomeFitnessApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, modules)
    }
}
