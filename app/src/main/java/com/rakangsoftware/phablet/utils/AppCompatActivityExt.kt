package com.rakangsoftware.phablet.utils

import android.content.pm.ActivityInfo
import com.rakangsoftware.phablet.MainActivity
import com.rakangsoftware.phablet.R

fun MainActivity.setupOrientation() {
    if (resources.getBoolean(R.bool.portrait_allowed) && !resources.getBoolean(R.bool.landscape_allowed)) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    } else if (resources.getBoolean(R.bool.landscape_allowed) && !resources.getBoolean(R.bool.portrait_allowed)) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
    }
}