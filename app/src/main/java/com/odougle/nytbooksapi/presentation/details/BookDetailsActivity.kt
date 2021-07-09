package com.odougle.nytbooksapi.presentation.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odougle.nytbooksapi.R
import com.odougle.nytbooksapi.presentation.base.BaseActivity
import kotlinx.android.synthetic.main.include_toolbar.*

class BookDetailsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        //set toolbar
        setupToolbar(toolbarmain,R.string.books_details_title)
    }
}