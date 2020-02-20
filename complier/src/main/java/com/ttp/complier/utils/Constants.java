package com.ttp.complier.utils;

/**
 * 常量类
 */
public class Constants {

    // 注解处理器中支持的注解类型
    public static final String BINDVIEW_ANNOTATION_TYPES = "com.ttp.annotation.BindView";
    public static final String ONCLICK_ANNOTATION_TYPES = "com.ttp.annotation.OnClick";

    // 布局、控件绑定实现接口
    public static final String VIEWBINDER = "com.ttp.butterknife.ViewBinder";

    public static final String CLICKLISTENER = "com.ttp.butterknife.ProxyOnClickListener";

    public static final String VIEW = "android.view.View";

    // bind方法名
    public static final String BIND_METHOD_NAME = "bind";

    // bind方法的参数名target
    public static final String TARGET_PARAMETER_NAME = "target";
}
