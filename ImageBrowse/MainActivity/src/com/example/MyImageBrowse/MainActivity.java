package com.example.MyImageBrowse;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;

public class MainActivity extends Activity {

	protected static final android.content.DialogInterface.OnClickListener DialogInterface = null;
	public TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        FrameLayout framelay = new FrameLayout(this);
        framelay.setBackgroundColor(Color.rgb(255, 255, 255));
        setContentView(framelay);
        
        TextView txt1 = new TextView(this);
        txt1.setText("�ڴ����п�����ʾUI����");
        txt1.setTextSize(24);
        txt1.setTextColor(Color.rgb(255, 255, 0)); 
        framelay.addView(txt1);
        
        txt2 = new TextView(this);
        txt2.setText("�������Ϸ");
        txt2.setTextSize(TypedValue.COMPLEX_UNIT_PX, 40);
        txt2.setTextColor(Color.rgb(255, 255, 0));
        txt2.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
      
        txt2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {				
				new AlertDialog.Builder(MainActivity.this).setTitle("ϵͳ��ʾ")
				.setMessage("��Ľ�������Ϸ")
				.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Log.i("3.4", "������Ϸ");						
					}
				}).setNegativeButton("�˳�", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Log.i("3.4", "�˳���Ϸ");
						finish();
					}
				}).show();				
			}        	
        });        
        framelay.addView(txt2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
