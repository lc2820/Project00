package com.example.android.mytext1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Called when the cookie should be eaten.
     */
    public void movies(View view) {

        Toast.makeText(this,"启动应用：热门电影",Toast.LENGTH_SHORT).show();




    }
    public void share(View view){
        Toast.makeText(this,"启动应用：股票雄鹰",Toast.LENGTH_SHORT).show();;
    }
    public void xyz(View view){
        Toast.makeText(this,"启动应用：XYZ阅读器",Toast.LENGTH_SHORT).show();
    }
    public void news(View view){
        Toast.makeText(this,"启动应用：最新闻",Toast.LENGTH_SHORT).show();
    }
    public void design(View view){
        Toast.makeText(this,"启动应用：毕业设计",Toast.LENGTH_SHORT).show();
    }
}
