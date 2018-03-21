package com.apress.gerber.vegetariancalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String existedtext="";//已输入的字符
    private boolean num=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_ac=(Button)findViewById(R.id.button_ac);
        Button bt_sign=(Button)findViewById(R.id.button_sign);
        Button bt_mod=(Button)findViewById(R.id.button_mod);
        Button bt_dev=(Button)findViewById(R.id.button_devide);
        Button bt_7=(Button)findViewById(R.id.button_seven);
        Button bt_8=(Button)findViewById(R.id.button_eight);
        Button bt_9=(Button)findViewById(R.id.button_nine);
        Button bt_mul=(Button)findViewById(R.id.button_multiply);
        Button bt_4=(Button)findViewById(R.id.button_four);
        Button bt_5=(Button)findViewById(R.id.button_five);
        Button bt_6=(Button)findViewById(R.id.button_six);
        Button bt_min=(Button)findViewById(R.id.button_minus);
        Button bt_1=(Button)findViewById(R.id.button_one);
        Button bt_2=(Button)findViewById(R.id.button_two);
        Button bt_3=(Button)findViewById(R.id.button_three);
        Button bt_plus=(Button)findViewById(R.id.button_plus);
        Button bt_0=(Button)findViewById(R.id.button_zero);
        Button bt_point=(Button)findViewById(R.id.button_decimal);
        Button bt_equ=(Button)findViewById(R.id.button_equil);
        bt_0.setOnClickListener(this);
        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
        bt_7.setOnClickListener(this);
        bt_8.setOnClickListener(this);
        bt_9.setOnClickListener(this);
        bt_ac.setOnClickListener(this);
        bt_dev.setOnClickListener(this);
        bt_equ.setOnClickListener(this);
        bt_min.setOnClickListener(this);
        bt_mod.setOnClickListener(this);
        bt_mul.setOnClickListener(this);
        bt_plus.setOnClickListener(this);
        bt_point.setOnClickListener(this);
        bt_sign.setOnClickListener(this);
        EditText showtext=(EditText)findViewById(R.id.editText2);
        existedtext=showtext.getText().toString();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_zero:
                existedtext=iscalculated(existedtext,"0");num=true;break;
            case R.id.button_one:
                existedtext=iscalculated(existedtext,"1");num=true;break;
            case R.id.button_two:
                existedtext=iscalculated(existedtext,"2");num=true;break;
            case R.id.button_three:
                existedtext=iscalculated(existedtext,"3");num=true;break;
            case R.id.button_four:
                existedtext=iscalculated(existedtext,"4");num=true;break;
            case R.id.button_five:
                existedtext=iscalculated(existedtext,"5");num=true;break;
            case R.id.button_six:
                existedtext=iscalculated(existedtext,"6");num=true;break;
            case R.id.button_seven:
                existedtext=iscalculated(existedtext,"7");num=true;break;
            case R.id.button_eight:
                existedtext=iscalculated(existedtext,"8");num=true;break;
            case R.id.button_nine:
                existedtext=iscalculated(existedtext,"9");num=true;break;
            case R.id.button_ac:
                if(num){
                existedtext=iscalculated(existedtext,"C");
                num=false;
                }
                else
                    existedtext=iscalculated(existedtext,"AC");
                break;
            case R.id.button_decimal:
                existedtext=iscalculated(existedtext,".");break;
            case R.id.button_devide:
                existedtext=iscalculated(existedtext,"/");break;
            case R.id.button_equil:
                existedtext=iscalculated(existedtext,"=");break;
            case R.id.button_minus:
                existedtext=iscalculated(existedtext,"-");break;
            case R.id.button_mod:
                existedtext=iscalculated(existedtext,"%");break;
            case R.id.button_multiply:
                existedtext=iscalculated(existedtext,"*");break;
            case R.id.button_sign:
                existedtext=iscalculated(existedtext,"+/-");break;
            case R.id.button_plus:
                existedtext=iscalculated(existedtext,"+");break;










        }

    }
    private String iscalculated(String existedtext,String s){

    }
}
