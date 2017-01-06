package com.cjt.mottopush;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by CaoJiangtao on 2017/1/5.
 */

public class DetialDialog extends Dialog {

    public DetialDialog(Context context) {
        super(context, R.style.MyDialogStyle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dialog);
    }
}
