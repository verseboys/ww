package com.wellhome.cloudgroup.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Author: lishang
 * Data: 16/5/23 下午6:53
 * Des:
 * version:
 */
public class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView mTextView ;
    TextView mTextView1 ;
    public ItemViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.id_num);
        mTextView1 = (TextView) itemView.findViewById(R.id.id_num);
    }

    public void renderView(String item) {
        mTextView.setText(item);
        mTextView1.setText(item);
    }
}
