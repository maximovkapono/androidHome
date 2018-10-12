package com.example.anmaksimov.homework

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val mCallbacks = MyActivityLifecycleCallbacks()

    override fun onCreate(savedInstanceState: Bundle?) {
        application.registerActivityLifecycleCallbacks(mCallbacks)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        super.onDestroy()
        application.unregisterActivityLifecycleCallbacks(mCallbacks)
    }



    class MyActivityLifecycleCallbacks: Application.ActivityLifecycleCallbacks {
        override fun onActivityPaused(activity: Activity?) {
            Log.i(activity?.javaClass?.simpleName, "onCreate")
        }

        override fun onActivityResumed(activity: Activity?) {
            Log.i(activity?.javaClass?.simpleName, "onActivityResumed")
        }

        override fun onActivityStarted(activity: Activity?) {
            Log.i(activity?.javaClass?.simpleName, "onActivityStarted")
        }

        override fun onActivityDestroyed(activity: Activity?) {
            Log.i(activity?.javaClass?.simpleName, "onActivityDestroyed")
        }

        override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
            Log.i(activity?.javaClass?.simpleName, "onActivitySaveInstanceState Bundle")
        }

        override fun onActivityStopped(activity: Activity?) {
            Log.i(activity?.javaClass?.simpleName, "onActivityStopped")
        }

        override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
            Log.i(activity?.javaClass?.simpleName, "onActivityCreated Bundle")
        }
    }
}
