package com.ttp.butterknife;

import android.view.View;

/**
 * @author faqi.tao
 * @time 2020/2/20
 */
public abstract class ProxyOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        //调用抽象方法
        doClick(v);
    }

    protected abstract void doClick(View v);
}
