package com.ttp.butterknife;

import android.app.Activity;

/**
 * @author faqi.tao
 * @time 2020/2/20
 */
public class ButterKnife {
    public static void bindView(Activity activity) {
        // 拼接类名
        String className = activity.getClass().getSimpleName() + "$ViewBinder";

        try {
            // 加载上述拼接类（可能apt生成失败，这里会抛出ClassNotFountException异常）
            Class<?> viewBinderClass = Class.forName(className);
            //接口 ==  接口的实现类实例
            ViewBinder viewBinder = (ViewBinder) viewBinderClass.newInstance();

            //调用接口方法
            viewBinder.bind(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
