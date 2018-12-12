package com.example.user.hazi_het;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;


public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsAdapter.VH> {

    private Activity Context;
    private List<Animals> Animals;

    public AnimalsAdapter(Activity context, List<Animals> animals) {
        Context = context;
        if (animals == null) {
            throw new IllegalArgumentException("hibacska?");
        }
        Animals = animals;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new VH(itemView, Context);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        Animals allat = Animals.get(position);
        holder.rootView.setTag(allat);
        holder.tvName.setText(allat.getNev());
        holder.tvDesc.setText(allat.getDesc());
       Glide.with(Context).load(allat.getaDrawable()).apply(RequestOptions.centerCropTransform()).into(holder.ivAnimal);
    }

    @Override
    public int getItemCount() {
        return Animals.size();
    }

    public class VH extends RecyclerView.ViewHolder {

        final View rootView;
        final ImageView ivAnimal;
        final TextView tvName;
        final  TextView tvDesc;


        public VH(View itemView, final Context context) {
            super(itemView);
            rootView = itemView;
            ivAnimal = (ImageView) itemView.findViewById(R.id.ivAnimal);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvDesc = (TextView) itemView.findViewById(R.id.tvDesc);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Animals animal = (Animals)v.getTag();
                    if (animal != null) {
                        Intent intent = new Intent(Context, DetalisActivity.class);
                        intent.putExtra("EXTRA_ANIMAL", animal);
                        Context.startActivity(intent);
                    }
                }
            });
        }
    }
}
