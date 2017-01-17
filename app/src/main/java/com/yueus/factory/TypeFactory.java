package com.yueus.factory;

import android.view.View;

import com.yueus.adapter.BaseViewHolder;

public interface TypeFactory {

    int parseType(String itemType);

    BaseViewHolder createViewHolder(int viewType, View itemView);
}
