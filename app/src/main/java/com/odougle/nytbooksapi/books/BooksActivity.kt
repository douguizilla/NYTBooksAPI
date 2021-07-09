package com.odougle.nytbooksapi.books

import android.os.Bundle
import com.odougle.nytbooksapi.R
import com.odougle.nytbooksapi.base.BaseActivity
import kotlinx.android.synthetic.main.include_toolbar.*

class BooksActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        //set toolbar
        setupToolbar(toolbarmain, R.string.books_title)


    }
}