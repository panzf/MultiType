package com.yueus.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

import com.yueus.factory.TypeTable;

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    private SparseArray<View> views;
    private View mItemView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        mItemView = itemView;
        views = new SparseArray<>();
    }

    public View getView(int resID) {
        View v = views.get(resID);
        if (v == null) {
            v = mItemView.findViewById(resID);
            views.put(resID, v);

        }
        return v;
    }

    public abstract void setUpView(TypeTable mode, int position, MultiTypeAdapter adapter);

}
