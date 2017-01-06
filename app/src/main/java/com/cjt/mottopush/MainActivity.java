package com.cjt.mottopush;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.cjt.mottopush.QuickAdapter.BaseAdapterHelper;
import com.cjt.mottopush.QuickAdapter.QuickAdapter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements GridView.OnItemClickListener{

    private GridView mGridView ;
    private List<Integer> mLists = new ArrayList<>();
    int[] pics = {R.mipmap.a1,R.mipmap.a2,R.mipmap.a3,R.mipmap.a4,R.mipmap.a5,} ;
//    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGridView = (GridView) this.findViewById(R.id.mottoGridView);
        mGridView.setOnItemClickListener(this); // 子项点击事件

//        File  picFile = new File(this.getExternalCacheDir().getPath());
//        Log.e("CJT","this.getExternalCacheDir().getPath();---"+this.getExternalCacheDir().getPath());
//        getAllFiles(picFile);

        for (int i = 0; i < pics.length ; i++) {
            mLists.add(pics[i]);
        }
        mGridView.setAdapter(new QuickAdapter<Integer>(getBaseContext(),R.layout.item_grid_layout, mLists) {
            @Override
            protected void convert(BaseAdapterHelper helper, Integer item) {
                helper.setImageResource(R.id.itemImg,item);
            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

//    // 遍历接收一个文件路径，然后把文件子目录中的所有文件遍历并输出来
//    private void getAllFiles(File root){
//        Log.e("CJT","getAllFiles;---"+root);
//        File files[] = root.listFiles();
//        if(files != null){
//            for (File f : files){
//                if(f.isDirectory()){
//                    getAllFiles(f);
//                }
//                else if(f.toString().endsWith(".jgp")){
//                    Log.e("CJT","getAllFiles;---"+f.toString());
//                }
//            }
//        }
//    }


}
