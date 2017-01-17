package com.yueus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yueus.adapter.MultiTypeAdapter;
import com.yueus.bean.TestBean;
import com.yueus.factory.TypeTable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MultiTypeAdapter mAdapter;
    private List<TypeTable> modles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        modles = new ArrayList<>();
        TypeTable ob;
        for (int i = 0; i < 50; i++) {
            if (i <= 3) {
                ob = new TestBean.OneTest();
                modles.add(ob);
            } else if (i <= 5) {
                ob = new TestBean.TwoTest();
                modles.add(ob);
            } else {
                ob = new TestBean.NormalTest();
                modles.add(ob);
            }

            mAdapter = new MultiTypeAdapter(modles);
            mRecyclerView.setAdapter(mAdapter);

        }

    }
}
