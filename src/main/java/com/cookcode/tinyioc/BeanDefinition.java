package com.cookcode.tinyioc;

/**
 * @ClassName tinyspringdemo
 * @Author cookr
 * @Date 2019/11/11 11:40 上午
 * @Version 1.0
 * @Description
 **/


public class BeanDefinition {
    private Object bean;

    public Object getBean() {
        return bean;
    }

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
}
