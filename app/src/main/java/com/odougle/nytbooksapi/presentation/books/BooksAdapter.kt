package com.odougle.nytbooksapi.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.odougle.nytbooksapi.R
import com.odougle.nytbooksapi.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter(
    val books: List<Book>
): RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bindView(books[position])
    }

    override fun getItemCount() = books.count()

    class BooksViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val title = view.textTitle
        private val author = view.textAuthor

        fun bindView(book: Book){
            title.text = book.title
            author.text = book.author
        }
    }
}