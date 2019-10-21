package com.ctrip.thirdpartyapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.ctrip.standard.AppInterface;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Zhenhua on 2018/3/3.
 * @email zhshan@ctrip.com ^.^
 */

public class BaseActivity extends Activity implements AppInterface {

    protected Activity that;

    public BaseActivity() {
        this.that = this;
    }

    @Override
    public void attach(@NotNull Activity activity) {
        //上下文注入进来了
        this.that = activity;
    }

    @Override
    public ClassLoader getClassLoader() {
        if (that == this) {
            return super.getClassLoader();
        } else {
            return that.getClassLoader();
        }
    }

    @NonNull
    @Override
    public LayoutInflater getLayoutInflater() {
        if (that == this) {
            return super.getLayoutInflater();
        } else {
            return that.getLayoutInflater();
        }
    }


    @Override
    public WindowManager getWindowManager() {
        if (that == this) {
            return super.getWindowManager();
        } else {
            return that.getWindowManager();
        }
    }

    @Override
    public Window getWindow() {
        if (that == this) {
            return super.getWindow();
        } else {
            return that.getWindow();
        }
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (that == this) {
            super.onCreate(savedInstanceState);
        }
    }

    public void onStart() {
        if (that == this) {
            super.onStart();
        }
    }

    public void onResume() {
        if (that == this) {
            super.onResume();
        }
    }

    public void onPause() {
        if (that == this) {
            super.onPause();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if (that == this) {
            super.onSaveInstanceState(outState);
        }
    }

    public void onStop() {
        if (that == this) {
            super.onStop();
        }
    }

    public void onDestroy() {
        if (that == this) {
            super.onDestroy();
        }
    }

    /**
     * super.setContentView(layoutResID)最终调用的是系统给我们注入的上下文
     */
    @Override
    public void setContentView(int layoutResID) {
        if (that == this) {
            super.setContentView(layoutResID);
        } else {
            that.setContentView(layoutResID);
        }
    }

    @Override
    public <T extends View> T findViewById(int id) {
        if (that == this) {
            return super.findViewById(id);
        } else {
            return that.findViewById(id);
        }
    }

    @Override
    public void startActivity(Intent intent) {
        if (that == this) {
            super.startActivity(intent);
        } else {
            that.startActivity(intent);
        }
    }
}
