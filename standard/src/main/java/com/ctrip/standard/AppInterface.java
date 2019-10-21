package com.ctrip.standard;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Zhenhua on 2018/3/7.
 * @email zhshan@ctrip.com ^.^
 */

public interface AppInterface {

    /**
     * 需要宿主app注入给插件app上下文
     */
    void attach(Activity activity);

    void onCreate(Bundle savedInstanceState);

    void onStart();

    void onResume();

    void onPause();

    void onSaveInstanceState(Bundle outState);

    void onStop();

    void onDestroy();
}
