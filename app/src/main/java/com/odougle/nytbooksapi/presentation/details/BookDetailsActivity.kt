package com.odougle.nytbooksapi.presentation.details

import android.content.Context
import android.content.Intent
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

    companion object{
        private const val EXTRA_TITLE = "EXTRA_TITLE"
        private const val EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION"

        fun getStartIntent(
            context: Context,
            title: String,
            description: String
        ): Intent {
            return Intent(
                context,
                BookDetailsActivity::class.java
            ).apply {
                putExtra(EXTRA_TITLE,title)
                putExtra(EXTRA_DESCRIPTION,description)
            }
        }
    }
}