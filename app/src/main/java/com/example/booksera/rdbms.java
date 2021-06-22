package com.example.booksera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class rdbms extends AppCompatActivity {

    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_rdbms );

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        relativeLayout.startAnimation(animation);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();

        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "Tech Yourself C++\n",
                        60000,
                        "https://firebasestorage.googleapis.com/v0/b/upload1-d76d8.appspot.com/o/teach%20yourself%20c%2B%2B.pdf?alt=media&token=b98542cd-015e-493b-89fa-588785af08f3"
                ));

        productList.add(
                new Product(
                        1,
                        "Object Oriented Programming in c++ \n",
                        60000,
                        "https://firebasestorage.googleapis.com/v0/b/upload1-d76d8.appspot.com/o/teach%20yourself%20c%2B%2B.pdf?alt=media&token=b98542cd-015e-493b-89fa-588785af08f3"
                ));

        productList.add(
                new Product(
                        1,
                        "The C++ Programming\n",
                        60000,
                        ""
                ));

        productList.add(
                new Product(
                        1,
                        "Object Oriented Programming(OOP)",
                        60000,
                        "https://firebasestorage.googleapis.com/v0/b/todotask-38ff7.appspot.com/o/Object%20-%20Oriented%20Programming%20in%20C%2B%2B%20by%20Robert%20Lafore%20(4th%20Edition).pdf?alt=media&token=59de6f9b-d602-427b-8759-efcf9df45a36"
                ));

       productList.add(
                new Product(
                        1,
                        "Beginning C++ The Complete Language",
                        60000,
                        ""
                ));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}