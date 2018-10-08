package com.johnquimbaya.marvel_cleaarchitecture.Home.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.johnquimbaya.marvel_cleaarchitecture.Home.Model.SuperHero;
import com.johnquimbaya.marvel_cleaarchitecture.Home.View.HomeListView;
import com.johnquimbaya.marvel_cleaarchitecture.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.MyViewHolder> {

    private List<SuperHero>superHeroArrayList;
    private HomeListView homeListViewActivity;
    Context context;

    public HomeListAdapter(List<SuperHero> superHeroArrayList, HomeListView homeListViewActivity) {
        this.superHeroArrayList = superHeroArrayList;
        this.homeListViewActivity = homeListViewActivity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item_cardview,parent,false);
        MyViewHolder myViewHolder= new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeListAdapter.MyViewHolder holder, final int position) {
        final SuperHero superHeros=superHeroArrayList.get(position);
        //holder.textViewName.setText(superHeros.getName());

    }

    @Override
    public int getItemCount() {
        return superHeroArrayList.size();
    }

    static public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewCard;
        private TextView textViewName;

        public MyViewHolder(View itemView) {
            super(itemView);
            textViewName=itemView.findViewById(R.id.heroDetailNameTextView);
            imageViewCard=itemView.findViewById(R.id.heroPictureImageView);

        }

        public void bind(Context context,final SuperHero superHero){


        }


    }

}
