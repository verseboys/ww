package com.wellhome.cloudgroup.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找到RecyclerView对应
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        //列数设置
        ExpandedGridLayoutManager layoutManager = new ExpandedGridLayoutManager(this, 3);
        mRecyclerView.setLayoutManager(layoutManager);
        layoutManager.setAutoMeasureEnabled(false);
        //表格线框
        GridLayoutItemDecoration itemDecoration = new GridLayoutItemDecoration( 3);
        itemDecoration.setDivideParams(10, 10);
        mRecyclerView.addItemDecoration(itemDecoration);
        //相当于getcount()(list的数量)
        mRecyclerView.setAdapter(new BaseVerticalAdapter(20));
        mRecyclerView.setNestedScrollingEnabled(false);
//        recyclerview获取焦点自动滚动
        mRecyclerView.setFocusable(false);
    }
}
