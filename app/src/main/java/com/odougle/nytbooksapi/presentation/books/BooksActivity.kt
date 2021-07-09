package com.odougle.nytbooksapi.presentation.books

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.odougle.nytbooksapi.R
import com.odougle.nytbooksapi.presentation.base.BaseActivity
import com.odougle.nytbooksapi.data.model.Book
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
                with(recycler_books_list){
                    layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true)
                    adapter = BooksAdapter(books)
                }

            }
        })

        viewModel.getBooks()

    }

    fun getFakeListBooks(): List<Book>{
        return listOf(
            Book(
                "Title 1",
                "Author 1",
                "bla"
            ),
            Book(
                "Title 2",
                "Author 2",
                "bla"
            ),
            Book(
                "Title 3",
                "Author 3",
                "bla"
            ),
            Book(
                "Title 4",
                "Author 4",
                "bla"
            )
            )
    }
}