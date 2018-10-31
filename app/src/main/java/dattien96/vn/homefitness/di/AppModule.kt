package dattien96.vn.homefitness.di

import android.content.res.Resources
import com.framgia.newyorktime.rx.AppSchedulerProvider
import com.framgia.newyorktime.rx.SchedulerProvider
import dattien96.vn.homefitness.HomeFitnessApp
import org.koin.dsl.module.module

val appModule = module(override = true) {
    single { createResources(get()) }
    single { createSchedulerProvider() }
}

fun createResources(application: HomeFitnessApp): Resources = application.resources

fun createSchedulerProvider(): SchedulerProvider = AppSchedulerProvider()

val modules = listOf(
    appModule,
    repositoryModule,
    viewModelModule,
    netWorkModule,
    localModule
)
