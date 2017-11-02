package com.example.ashwin.lavtwolayouts;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PojoImageAudio> al = new ArrayList<PojoImageAudio>();

    int img1 = R.drawable.crazy2;
    String imgname1 = " ";
    String type1="IMAGE";

    int img2 = 0;
    String imgname2 = "SECOND IMAGE";
    String type2="TEXT";

    int img3 = R.drawable.crazy2;
    String imgname3 = " ";
    String type3="IMAGE";

    int img4 = 0;
    String imgname4 = "FOURTH IMAGE";
    String type4="TEXT";

    int img5 = R.drawable.crazy2;
    String imgname5 = " ";
    String type5="IMAGE";

    PojoImageAudio pia1 = new PojoImageAudio();
    PojoImageAudio pia2 = new PojoImageAudio();
    PojoImageAudio pia3 = new PojoImageAudio();
    PojoImageAudio pia4 = new PojoImageAudio();
    PojoImageAudio pia5 = new PojoImageAudio();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView rv = (RecyclerView)findViewById(R.id.rview);
        LinearLayoutManager lm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(lm);

        pia1.setImg(img1);
        pia1.setImgname(imgname1);
        pia1.setType(type1);

        pia2.setImg(img2);
        pia2.setImgname(imgname2);
        pia2.setType(type2);

        pia3.setImg(img3);
        pia3.setImgname(imgname3);
        pia3.setType(type3);

        pia4.setImg(img4);
        pia4.setImgname(imgname4);
        pia4.setType(type4);

        pia5.setImg(img5);
        pia5.setImgname(imgname5);
        pia5.setType(type5);

        al.add(pia1);
        al.add(pia2);
        al.add(pia3);
        al.add(pia4);
        al.add(pia5);


        MyAdapter a = new MyAdapter(MainActivity.this, al);
        rv.setAdapter(a);

       /* ArrayList<String> list = new ArrayList<>();

        String s ="kkk";

        list.add(s);
        String g = list.get(0);*/




    }


}
