package br.com.sibela.fabnotworking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        SimpleStringAdapter adapter = new SimpleStringAdapter(getStringList());
        recyclerView.setAdapter(adapter);
    }

    private List<String> getStringList() {

        List<String> strings = new ArrayList<>();

        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");
        strings.add("Android development");

        return strings;
    }
}