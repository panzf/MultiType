package com.yueus.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yueus.factory.MultiTypeFactor;
import com.yueus.factory.TypeFactory;
import com.yueus.factory.TypeTable;

import java.util.List;

public class MultiTypeAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private TypeFactory typeFactory;
    private List<TypeTable> models;

    public MultiTypeAdapter(List<TypeTable> models) {
        this.models = models;
        typeFactory = new MultiTypeFactor();
    }

    @Override
    public int getItemCount() {
        if (models == null) {
            return 0;
        } else {
            return models.size();
        }
        
    }

    @Override
    public int getItemViewType(int position) {
        // TODO Auto-generated method stub
        return models.get(position).type(typeFactory);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setUpView(models.get(position), position, this);
    }


    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return typeFactory.createViewHolder(viewType, itemView);

    }
}
