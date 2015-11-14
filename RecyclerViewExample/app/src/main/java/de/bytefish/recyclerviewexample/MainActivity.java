package de.bytefish.recyclerviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private SimpleCardViewAdapter mAdapter;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mAdapter = new SimpleCardViewAdapter(Arrays.asList(
                new CardViewData("Sample Title Item 0", "Description of Item 0", R.drawable.image_0),
                new CardViewData("Sample Title Item 1", "Description of Item 1", R.drawable.image_1),
                new CardViewData("Sample Title Item 2", "Description of Item 2", R.drawable.image_2),
                new CardViewData("Sample Title Item 3", "Description of Item 3", R.drawable.image_3),
                new CardViewData("Sample Title Item 4", "Description of Item 4", R.drawable.image_4)));

        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
