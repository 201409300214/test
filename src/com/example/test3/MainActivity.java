package com.example.test3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
//新增修改内容-------
//adding for test1-D
//adding for test2-C
//adding for test3-d
//adding for test 20211230
//test001
<<<<<<< HEAD
//adding for idea test
=======
//adding for featureA test001
//adding for featureA jessica test
>>>>>>> origin/featureA
public class MainActivity extends Activity {
TextView tv;
TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
