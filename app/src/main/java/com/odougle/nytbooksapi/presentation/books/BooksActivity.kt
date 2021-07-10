package com.odougle.nytbooksapi.presentation.books

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.odougle.nytbooksapi.R
import com.odougle.nytbooksapi.presentation.base.BaseActivity
import com.odougle.nytbooksapi.presentation.details.BookDetailsActivity
import kotlinx.android.synthetic.main.activity_books.*
import kotlinx.android.synthetic.main.include_toolbar.*

class BooksActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        //set toolbar
        setupToolbar(toolbarmain, R.string.books_title)

        //set viewModel
        val viewModel: BooksViewModel = ViewModelProvider(this).get(BooksViewModel::class.java)

        //set recyclerview
        viewModel.booksLiveData.observe(this, {
            it?.let { books ->
                with(recycler_books_list) {
                    layoutManager =
                        LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true)
                    adapter = BooksAdapter(books) { book ->
                        val intent = BookDetailsActivity.getStartIntent(
                            this@BooksActivity,
                            book.title,
                            book.description
                        )
                        this@BooksActivity.startActivity(intent)
                    }
                }
            }
        })

        //set viewflipper to show up one child
        viewModel.viewFlipperLiveData.observe(this, Observer {
            it?.let { viewFlipper ->
                viewFlipperBooks.displayedChild = viewFlipper.first
                viewFlipper.second?.let { errorMessageResID ->
                    textViewError.text = getString(errorMessageResID)
                }
            }
        })

        viewModel.getBooks()

    }

}