package com.example.natashaford.bookcollection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by natashaford on 05/07/2017.
 */

public class BookListAdapter extends ArrayAdapter<Book> {
    public BookListAdapter(Context context, ArrayList<Book> books){
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.book_list_activity, parent, false);
        }
        Book currentBook = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentBook.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentBook.getTitle().toString());

        TextView author = (TextView) listItemView.findViewById(R.id.author);
        author.setText(currentBook.getAuthor().toString());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentBook.getYear().toString());

        ImageView image = (ImageView)listItemView.findViewById(R.id.image);
        image.setImageResource(currentBook.getImage());

        listItemView.setTag(currentBook);

        return listItemView;
    }
}
