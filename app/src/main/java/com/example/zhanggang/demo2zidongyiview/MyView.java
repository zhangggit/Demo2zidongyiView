package com.example.zhanggang.demo2zidongyiview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 类作用：
 * 时  间：2017/8/29 - 20:59.
 * 创建人：张刚
 */

public class MyView extends RelativeLayout {


    public MyView(Context context) {
        super(context,null);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.myview,this);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textview);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "点击返回", Toast.LENGTH_SHORT).show();
            }
        });
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyView);
        String string = typedArray.getString(R.styleable.MyView_titletext);
        int color = typedArray.getColor(R.styleable.MyView_titletextcolor,0);
        textView.setText(string);
        textView.setTextColor(color);
        typedArray.recycle();
    }


}
