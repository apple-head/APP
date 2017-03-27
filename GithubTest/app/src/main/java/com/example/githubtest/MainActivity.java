package com.example.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem action_next) {
        int id= action_next.getItemId();
        if (id == R.id.action_next){
            Intent i1 = new Intent();
            i1.setClass(MainActivity.this,MainActivity2.class);
            startActivity(i1);
        }
        return super.onOptionsItemSelected(action_next);
    }
}
