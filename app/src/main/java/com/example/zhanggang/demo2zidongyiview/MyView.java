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
 * 类作用：自定义View
 * 时  间：2017/8/29 - 20:59.
 * 创建人：张刚
 */

public class MyView extends RelativeLayout {


    public MyView(Context context) {
        super(context, null);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        //加载布局
        LayoutInflater.from(context).inflate(R.layout.myview, this);
        //初始化控件
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textview);
        //返回键点击事件
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "点击返回", Toast.LENGTH_SHORT).show();
            }
        });
        //加载自定义的布局属性
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyView);
        String string = typedArray.getString(R.styleable.MyView_titletext);
        int color = typedArray.getColor(R.styleable.MyView_titletextcolor, 0);
        //赋值
        textView.setText(string);
        textView.setTextColor(color);
        typedArray.recycle();
    }


}
