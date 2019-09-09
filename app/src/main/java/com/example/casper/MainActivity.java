package com.example.casper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewHelloWorld=findViewById(R.id.textViewHelloWorld);
        textViewHelloWorld.setText("你好，编程实现的hello world！");

        //直接设置字符串资源ID
        textViewHelloWorld.setText(this.getString(R.string.hello_world));

        //通过资源名获得字符串
        Context context=this.getApplicationContext();
        String resName="hello_word";
        int helloWorldId=context.getResources().getIdentifier(resName,"string", context.getPackageName());
        textViewHelloWorld.setText(this.getString(helloWorldId));
    }
}
