package com.odougle.nytbooksapi

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class BaseActivity : AppCompatActivity() {
    protected fun setupToolbar(toolbar: Toolbar, titleIDRes: Int){
        toolbar.title = getString(titleIDRes)
        setSupportActionBar(toolbar)
    }
}