package com.example.HelloConstraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mcount=0;
    private TextView mShowCount;
    private TextView ZeroButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.Show_count);
        ZeroButton = (TextView) findViewById(R.id.Zero_show);
    }

    public void show_toast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showCount(View view) {
        ++mcount;
        if (mShowCount != null){
            ZeroButton.setBackgroundResource(R.color.colorHex);
        }
            mShowCount.setText(Integer.toString(mcount));
        if (mcount % 2 ==0 ) {
            view.setBackgroundResource(R.color.colorPrimaryDark);
        }else{
            view.setBackgroundResource(R.color.colorAccent);
        }


    }

    public void reset(View view) {
        ZeroButton.setBackgroundResource(R.color.colorPrimaryDark);
        mcount=0;
        mShowCount.setText(Integer.toString(mcount));

    }
}
