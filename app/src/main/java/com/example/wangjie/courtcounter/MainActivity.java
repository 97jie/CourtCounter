package com.example.wangjie.courtcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button btn_reset;
    private Button btn_1A;
    private Button btn_2A;
    private Button btn_3A;
    private Button btn_3B;
    private Button btn_2B;
    private Button btn_1B;
    private TextView tv_scoreA;
    private TextView tv_scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_reset=findViewById(R.id.btn_reset);
        btn_1A=findViewById(R.id.btn_1A);
        btn_2A=findViewById(R.id.btn_2A);
        btn_3A=findViewById(R.id.btn_3A);
        btn_1B=findViewById(R.id.btn_1B);
        btn_2B=findViewById(R.id.btn_2B);
        btn_3B=findViewById(R.id.btn_3B);
        tv_scoreB=findViewById(R.id.tv_scoreB);
        tv_scoreA=findViewById(R.id.tv_scoreA);

    }

    public void reset(View v ){
        tv_scoreA.setText(0+"");
        tv_scoreB.setText(0+"");
        tv_scoreB.setText(0+"");
    }

    public void onClickA(View v){
        if(v==btn_1A){
            addA(1);
        }else if(v==btn_2A){
            addA(2);
        }else{
            addA(3);
        }
    }
    public void onClickB(View v){
        if(v==btn_1B){
            addB(1);
        }else if(v==btn_2B){
            addB(2);
        }else{
            addB(3);
        }
    }
    private void addA(int p){
        String oldP=tv_scoreA.getText().toString();
        int newP=Integer.parseInt(oldP)+p;
        tv_scoreA.setText(newP+"");
    }
    private void addB(int p){
        String oldP=tv_scoreB.getText().toString();
        int newP=Integer.parseInt(oldP)+p;
        tv_scoreB.setText(newP+"");
    }
}
