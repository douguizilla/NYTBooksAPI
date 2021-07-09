package com.odougle.nytbooksapi.books

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.odougle.nytbooksapi.data.Book

class BooksAdapter(
    val books: List<Book>
): RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = books.count()

    class BooksViewHolder(view: View): RecyclerView.ViewHolder(view){

    }
}