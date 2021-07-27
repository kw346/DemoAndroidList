package sg.edu.rp.c346.id20022735.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> alAnver;
    //ArrayAdapter<AndroidVersion> aaAnver;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lstv);

        alAnver = new ArrayList<>();
        alAnver.add(new AndroidVersion("Pie", "9.0"));
        alAnver.add(new AndroidVersion("Oreo", "8.0-8.1"));
        alAnver.add(new AndroidVersion("Nougat", "7.0-7.1.2"));
        alAnver.add(new AndroidVersion("Marshmallow", "6.0-6.0.1"));
        alAnver.add(new AndroidVersion("Lollipop", "5.0-5.1.1"));
        alAnver.add(new AndroidVersion("KitKat", "4.4-4.4.4"));
        alAnver.add(new AndroidVersion("Jelly Bean", "4.1-4.3.1"));


        //aaAnver = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alAnver);
        //lv.setAdapter(aaAnver);
        adapter = new CustomAdapter(this, R.layout.row,alAnver);
        lv.setAdapter(adapter);
    }
}