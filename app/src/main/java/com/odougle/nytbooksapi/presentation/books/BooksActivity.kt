package com.odougle.nytbooksapi.presentation.books

import android.os.Bundle
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

        //set recyclerview
        with(recycler_books_list){
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = BooksAdapter(getFakeListBooks())
        }


    }

    fun getFakeListBooks(): List<Book>{
        return listOf(
            Book(
                "Title 1",
                "Author 1"
            ),
            Book(
                "Title 2",
                "Author 2"
            ),
            Book(
                "Title 3",
                "Author 3"
            ),
            Book(
                "Title 4",
                "Author 4"
            )
            )
    }
}