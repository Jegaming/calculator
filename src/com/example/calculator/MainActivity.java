package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {
	
	private Button zero,one,two,three,four,five,six,seven,eight,nine; 
	private Button plu,min,mul,div,result,point,clear,back;
	private TextView tvResult;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置成全屏横屏  
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
         
        Globe.tvResult = (TextView)findViewById(R.id.tvResult);
        plu = (Button)findViewById(R.id.signButton1);
        min = (Button)findViewById(R.id.signButton2);
        mul = (Button)findViewById(R.id.signButton3);
        div = (Button)findViewById(R.id.signButton4);
        point = (Button)findViewById(R.id.signButton5);
        result = (Button)findViewById(R.id.signButton6);
        clear = (Button)findViewById(R.id.signButton7);
        back = (Button)findViewById(R.id.signButton8);
        zero = (Button)findViewById(R.id.numButton1);
        one = (Button)findViewById(R.id.numButton2);
        two = (Button)findViewById(R.id.numButton3);
        three = (Button)findViewById(R.id.numButton4);
        four = (Button)findViewById(R.id.numButton5);
        five = (Button)findViewById(R.id.numButton6);
        six = (Button)findViewById(R.id.numButton7);
        seven = (Button)findViewById(R.id.numButton8);
        eight = (Button)findViewById(R.id.numButton9);
        nine = (Button)findViewById(R.id.numButton10);
        
        plu .setOnClickListener(new myClickListener());
        min .setOnClickListener(new myClickListener());
        mul .setOnClickListener(new myClickListener());
        div .setOnClickListener(new myClickListener());
        point .setOnClickListener(new myClickListener());
        result .setOnClickListener(new myClickListener());
        clear .setOnClickListener(new myClickListener());
        back .setOnClickListener(new myClickListener());
        zero .setOnClickListener(new myClickListener());
        one .setOnClickListener(new myClickListener());
        two .setOnClickListener(new myClickListener());
        three .setOnClickListener(new myClickListener());
        four .setOnClickListener(new myClickListener());
        five .setOnClickListener(new myClickListener());
        six .setOnClickListener(new myClickListener());
        seven .setOnClickListener(new myClickListener());
        eight .setOnClickListener(new myClickListener());
        nine .setOnClickListener(new myClickListener());
        }
        
        
    
    
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
