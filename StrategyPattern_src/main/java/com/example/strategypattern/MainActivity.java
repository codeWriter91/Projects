package com.example.strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2,text3;
    Duck d1,d2,d3,d4,d5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.text1);

        text3 = (TextView) findViewById(R.id.text3);
        d1 = new MallardDuck();
        d2 = new RedheadDuck();
        text1.setText(""+d1.flyable);
        getText2();
        text2.setText(d2.display()+" & I "+d2.performQuack()+" & " + d2.performFly());
//        text3.setText(d1.performFly());
        d1.setFlyable(new FlyWithWings());
        text3.setText(d1.display()+" & I "+d1.performQuack()+" & "+d1.performFly());

    }
    public TextView getText2(){
        text2 = (TextView) findViewById(R.id.text2);
        return text2;
    }
}
