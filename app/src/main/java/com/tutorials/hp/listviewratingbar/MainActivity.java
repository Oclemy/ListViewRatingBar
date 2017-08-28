package com.tutorials.hp.listviewratingbar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import com.tutorials.hp.listviewratingbar.mAdapterView.CustomAdapter;
import com.tutorials.hp.listviewratingbar.mData.SpaceshipsCollection;
/*
- Our MainActivity class.
- Derives from AppCompatActivity which is a Base class for activities that use the support library action bar features.
- Methods: onCreate().
- Inflated From content_main.xml using the setContentView() method.
- The view we use is ListView.
- Reference ListView from our layout specification using findViewById().
- Instantiate adapter and set it to ListView.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lv= (ListView) findViewById(R.id.lv);
        lv.setAdapter(new CustomAdapter(this, SpaceshipsCollection.getSpaceships()));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
