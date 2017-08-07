package com.example.junar.it_festival;

import android.graphics.drawable.Drawable;

/**
 * Created by Junar on 2017-08-04.
 */

//ListView 아이템 데이터 클래스 정의.

public class ListViewItem {
    private Drawable icon;
    private String text;

    public void setIcon(Drawable icon){
        this.icon=icon;
    }

    public void setText(String text){
        this.text = text;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public String getText(){
        return this.text;
    }
}
