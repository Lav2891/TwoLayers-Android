package com.example.ashwin.lavtwolayouts;

import android.content.Context;
import android.nfc.Tag;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ashwin on 9/26/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<PojoImageAudio> alist;
    private final int outimage = 0, outtext = 1;


    public MyAdapter(Context context, ArrayList<PojoImageAudio> a) {
        this.context = context;
        this.alist = a;
    }

    public Context getContext() {
        return context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        RecyclerView.ViewHolder viewHolder = null;

        switch (viewType) {
            case outimage:
                View contactView1 = inflater.inflate(R.layout.second_main, parent, false);
                viewHolder = new ViewHolder1(contactView1);
                break;
            case outtext:
                View contactView2 = inflater.inflate(R.layout.third_main, parent, false);
                viewHolder = new ViewHolder2(contactView2);
                break;
            default:

                break;
        }
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {
        final PojoImageAudio poimau = alist.get(position);

        final int imagehere = poimau.getImg();
        final String texthere = poimau.getImgname();

        String str = " ";
        str = str + texthere;

       // Log.e("OnBindView",""+viewHolder.getItemViewType());

        switch (viewHolder.getItemViewType()) {

            case outimage:
                ViewHolder1 viewH1 = (ViewHolder1) viewHolder;
                viewH1.imageview.setImageResource(imagehere);
                break;
            case outtext:

                ViewHolder2 viewH2 = (ViewHolder2) viewHolder;
                viewH2.textview.setText("\n" + str);
                break;
            default:

                break;
        }


    }

    @Override
    public int getItemCount() {
        return alist.size();
    }

    @Override
    public int getItemViewType(int position) {
    PojoImageAudio object;
        object = alist.get(position);
        String type = object.getType();

        if (type.equals("IMAGE")){
            return outimage;
        }
       else if (type.equals("TEXT")){
            return outtext;
        }



        return -1;
    }

    public class ViewHolder1 extends RecyclerView.ViewHolder {

        public ImageView imageview;


        public ViewHolder1(View itemView) {
            super(itemView);
            imageview = (ImageView) itemView.findViewById(R.id.iv);

        }


    }

    public class ViewHolder2 extends RecyclerView.ViewHolder {


        public TextView textview;

        public ViewHolder2(View itemView) {
            super(itemView);

            textview = (TextView) itemView.findViewById(R.id.tv);
        }

    }
}
