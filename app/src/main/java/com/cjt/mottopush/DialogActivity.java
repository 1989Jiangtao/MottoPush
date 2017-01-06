package com.cjt.mottopush;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import com.squareup.picasso.Picasso;

import java.io.File;

/**
 * Created by CaoJiangtao on 2017/1/5.
 * Dialog形式的Activity
 */

public class DialogActivity extends Activity{

    private ImageView mMottoImg;
    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        mMottoImg = (ImageView) findViewById(R.id.mottoImg);

        mIntent = getIntent();
        String path = mIntent.getStringExtra(MyPushReceiver.PUSH_IMAGE_PATH_KEY);
        if (path != null) {
            File file = new File(path);
            Picasso.with(this).load(file).into(mMottoImg);
        }

        mMottoImg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                finish();
                return true;
            }
        });
    }

}
