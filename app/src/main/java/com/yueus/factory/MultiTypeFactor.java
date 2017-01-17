package com.yueus.factory;

import android.view.View;

import com.yueus.R;
import com.yueus.adapter.BaseViewHolder;
import com.yueus.adapter.MultiTypeViewHolder;

public class MultiTypeFactor implements TypeFactory {
    private static final String TYPE_NORMAL = "999";
    private static final String TYPE_ONE = "1";
    private static final String TYPE_TWO = "2";

    private static final int MULTI_TYPE_RES_ID_ONE = R.layout.item_type_one;
    private static final int MULTI_TYPE_RES_ID_TWO = R.layout.item_type_two;
    private static final int MULTI_TYPE_RES_ID_NORMAL = R.layout.item_type_normal;
    private static final int MULTI_TYPE_RES_ID_UNKNOWN = R.layout.item_type_unknown;

    @Override
    public int parseType(String itemType) {
        if (TYPE_NORMAL.equals(itemType)) {
            return MULTI_TYPE_RES_ID_NORMAL;
        } else if (TYPE_ONE.equals(itemType)) {
            return MULTI_TYPE_RES_ID_ONE;
        } else if (TYPE_TWO.equals(itemType)) {
            return MULTI_TYPE_RES_ID_TWO;
        } else {
            return MULTI_TYPE_RES_ID_UNKNOWN;
        }

    }

    @Override
    public BaseViewHolder createViewHolder(int viewType, View itemView) {
        if (viewType == MULTI_TYPE_RES_ID_ONE) {
            return new MultiTypeViewHolder.OneViewHolder(itemView);
        } else if (viewType == MULTI_TYPE_RES_ID_TWO) {
            return new MultiTypeViewHolder.TwoViewHolder(itemView);
        } else if (viewType == MULTI_TYPE_RES_ID_NORMAL) {
            return new MultiTypeViewHolder.NormalViewHolder(itemView);
        } else {
            return new MultiTypeViewHolder.UnKnownViewHolder(itemView);
        }
    }

}
