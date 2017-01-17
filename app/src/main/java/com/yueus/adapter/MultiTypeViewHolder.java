package com.yueus.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yueus.R;
import com.yueus.bean.TestBean;
import com.yueus.factory.TypeTable;

/**
 * Created by admin on 2017/1/16.
 *
 * @description:
 */

public class MultiTypeViewHolder {

    /**
     * item one
     *
     * @author admin
     */
    public static class OneViewHolder extends BaseViewHolder {

        public OneViewHolder(View itemView) {
            super(itemView);

        }

        @Override
        public void setUpView(TypeTable mode, int position, MultiTypeAdapter adapter) {
            TestBean.OneTest oneTest = (TestBean.OneTest) mode;
            ImageView icon = (ImageView) getView(R.id.item_one_icon);
            TextView nickname = (TextView) getView(R.id.item_one_nickname);
            nickname.setText(oneTest.os+"  position="+position);

        }

    }

    /**
     * item two
     *
     * @author admin
     */
    public static class TwoViewHolder extends BaseViewHolder {

        public TwoViewHolder(View itemView) {
            super(itemView);

        }

        @Override
        public void setUpView(TypeTable mode, int position, MultiTypeAdapter adapter) {
            TestBean.TwoTest twoTest = (TestBean.TwoTest) mode;
            ImageView ic = (ImageView) getView(R.id.item_two_icon);
            TextView nickname = (TextView) getView(R.id.item_two_nickname);
            ic.setImageResource(R.mipmap.green_robot);
            nickname.setText(twoTest.tws+"  position="+position);
        }

    }

    /**
     * item normal
     *
     * @author admin
     */

    public static class NormalViewHolder extends BaseViewHolder {

        public NormalViewHolder(View itemView) {
            super(itemView);

        }

        @Override
        public void setUpView(TypeTable mode, int position, MultiTypeAdapter adapter) {

            TestBean.NormalTest normalTest = (TestBean.NormalTest) mode;
            TextView nicke = (TextView) getView(R.id.item_normal_tv);
            nicke.setText(normalTest.introduction+"  position="+position);
        }

    }

    /**
     * item unknown
     *
     * @author admin
     */
    public static class UnKnownViewHolder extends BaseViewHolder {
        public UnKnownViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void setUpView(TypeTable mode, int position, MultiTypeAdapter adapter) {
        }
    }
}
