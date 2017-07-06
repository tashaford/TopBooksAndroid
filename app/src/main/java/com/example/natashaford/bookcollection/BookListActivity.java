package com.example.natashaford.bookcollection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

import java.util.ArrayList;

public class BookListActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_list);

        BookList bookList = new BookList();
        ArrayList<Book> list = bookList.getList();

        BookListAdapter booksAdapter = new BookListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(booksAdapter);
    }

    public void getBook(View listItem){
        Book book = (Book) listItem.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append("You clicked: ");
        sb.append(book.getTitle());

        Snackbar snackbar = Snackbar.make(listItem, sb.toString(), Snackbar.LENGTH_LONG);
        snackbar.setAction("Say Hello", this);
        snackbar.show();
    }

    @Override
    public void onClick(View v){
        Toast.makeText(this, "Hello from Snackbar!", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.action_author){
            Intent intent = new Intent(this, AboutActivity.class);
            this.startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
