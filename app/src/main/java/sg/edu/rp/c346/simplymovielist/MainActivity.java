package sg.edu.rp.c346.simplymovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;

    ArrayList<String> alMovieList;

    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.ListViewMovie);

        alMovieList = new ArrayList<>();
        alMovieList.add("Avenger Infinity war Release dat : 2018.04");
        alMovieList.add("Jusice League Release Date : 2017.11");

        aaMovie = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alMovieList);

        lvMovie.setAdapter(aaMovie);
    }
}
