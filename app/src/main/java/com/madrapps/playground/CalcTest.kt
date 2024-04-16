package com.madrapps.playground

import androidx.lifecycle.ViewModel

class CalcTest : ViewModel() {

    fun validate(userId: String): Boolean {
        return userId == "admin"
    }

    fun verifyAccess(userId: String): Boolean {
        return userId == "super-admin"
    }
}
