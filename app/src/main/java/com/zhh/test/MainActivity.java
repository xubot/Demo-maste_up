package com.zhh.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zhh.test.update.UpdateVersionController;

/**
 * Created by zhh on 2017/1/18.
 * 个人
 * csdn网站：http://blog.csdn.net/zhh_csdn_ard
 * devstore网站：http://www.devstore.cn/user_home/zhanghai_ardapp.html
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private UpdateVersionController controller = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //得到更新的控件
        findViewById(R.id.normal_update).setOnClickListener(this);
        //创建出更新版本的对象
        if (null == controller) {
            controller = UpdateVersionController.getInstance(this);
        }
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.normal_update:
                controller.normalCheckUpdateInfo();
                break;
        }
    }

}
