package com.example.junar.it_festival;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.LinearLayout;

/**
 * Created by Junar on 2017-08-04.
 */

public class CheckableLinearLayout extends LinearLayout implements Checkable {

    public CheckableLinearLayout(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    public void setChecked(boolean checked) {
        CheckBox cb = (CheckBox) findViewById(R.id.checkBox1);

        if(cb.isChecked()!=checked){
            cb.setChecked(checked);
        }
    }

    @Override
    public boolean isChecked() {
        CheckBox cb = (CheckBox) findViewById(R.id.checkBox1);

        return cb.isChecked();
    }

    @Override
    public void toggle() {
        CheckBox cb=(CheckBox) findViewById(R.id.checkBox1);

        setChecked(cb.isChecked() ? false : true);
    }
}
