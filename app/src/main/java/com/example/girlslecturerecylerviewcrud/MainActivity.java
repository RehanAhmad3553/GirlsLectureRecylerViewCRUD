package com.example.girlslecturerecylerviewcrud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<MyMovieData> List = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);




        LinearLayoutManager obj =  new LinearLayoutManager(this);
        //LinearLayoutManager obj =  new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);

        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);

        // StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);




        recyclerView.setLayoutManager(obj);



        MyMovieData[] myMovieData = new MyMovieData[]{

              
                new MyMovieData("Good Deeds","2012 film",R.drawable.good_deeds),
                new MyMovieData("Hulk","2003 film",R.drawable.hulk),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),
                new MyMovieData("Avatar","2009 film",R.drawable.avatar),

        };


        List.add(new MyMovieData("Venom","2018 film",R.drawable.venom));
        List.add( new MyMovieData("Jumanji","2019 film",R.drawable.jumanji));
        List.add(new MyMovieData("Venom","2018 film",R.drawable.venom));
        List.add(new MyMovieData("Venom","2018 film",R.drawable.venom));
        List.add(new MyMovieData("Venom","2018 film",R.drawable.venom));
        List.add(new MyMovieData("Venom","2018 film",R.drawable.venom));








        recyclerView.setAdapter(new MyMovieAdapter(myMovieData,MainActivity.this));






























    }
}
