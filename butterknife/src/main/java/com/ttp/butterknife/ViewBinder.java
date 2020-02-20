package com.ttp.butterknife;

/**
 * @author faqi.tao
 * @time 2020/2/20
 */

/**
 * 绑定接口（所有注解处理器生成的类，需要实现该接口）
 *
 * @param <T>
 */
public interface ViewBinder<T> {

    void bind(T target);
}
