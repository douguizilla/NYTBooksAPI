package com.odougle.nytbooksapi.presentation.base

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

open class BaseActivity : AppCompatActivity() {
    protected fun setupToolbar(toolbar: Toolbar, titleIDRes: Int){
        toolbar.title = getString(titleIDRes)
        setSupportActionBar(toolbar)
    }
}