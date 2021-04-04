package com.sukhralia.dji_swift

import android.app.Application
import android.content.Context
import com.secneo.sdk.Helper

class DjiSwiftAplication : Application() {

    override fun attachBaseContext(paramContext: Context?) {
        super.attachBaseContext(paramContext)
        Helper.install(this@DjiSwiftAplication)
    }

}