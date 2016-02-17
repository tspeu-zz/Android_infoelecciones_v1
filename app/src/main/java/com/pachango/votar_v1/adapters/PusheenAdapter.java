package com.pachango.votar_v1.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.pachango.votar_v1.R;
import com.pachango.votar_v1.models.Pusheen;

/**
 * Created by thespianartist on 07/12/14.
 */
public class PusheenAdapter extends RecyclerView.Adapter<PusheenAdapter.ViewHolder> {

    private ArrayList<Pusheen> pusheenArrayList;
    private int itemLayout;

    public PusheenAdapter(ArrayList<Pusheen> data,  int itemLayout){

        this.pusheenArrayList = data;
        this.itemLayout = itemLayout;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView name;
        private TextView pasTime;

        public ViewHolder(View itemView) {

            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.name);
            pasTime = (TextView) itemView.findViewById(R.id.passtime);

        }
    }

    @Override
    public PusheenAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PusheenAdapter.ViewHolder viewHolder, int position) {

        Pusheen pusheen = pusheenArrayList.get(position);

        viewHolder.name.setText(pusheen.getName());
        viewHolder.pasTime.setText(pusheen.getPasTime());

        if (pusheen.getId()!=null) {

            switch (pusheen.getId()) {

                case 1:
                    viewHolder.image.setImageResource(R.drawable.pp);
                    break;

                case 2:
                    viewHolder.image.setImageResource(R.drawable.psoe);
                    break;

                case 3:
                    viewHolder.image.setImageResource(R.drawable.podemos);
                    break;

                case 4:
                    viewHolder.image.setImageResource(R.drawable.izqu);
                    break;

                case 5:
                    viewHolder.image.setImageResource(R.drawable.ccanaria);
                    break;
                case 6:
                    viewHolder.image.setImageResource(R.drawable.upd);
                    break;
                case 7:
                    viewHolder.image.setImageResource(R.drawable.ciudadans);
                    break;
                case 8:
                    viewHolder.image.setImageResource(R.drawable.ciu);
                    break;
                case 9:
                    viewHolder.image.setImageResource(R.drawable.ezq);
                    break;

            }

        }else{

            viewHolder.image.setImageResource(R.drawable.ic_share_black_24dp);
        }

        viewHolder.itemView.setTag(pusheen);
    }

    @Override
    public int getItemCount() {
        return this.pusheenArrayList.size();
    }


}
