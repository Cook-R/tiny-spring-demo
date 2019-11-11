package com.cookcode.tinyioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName tinyspringdemo
 * @Author cookr
 * @Date 2019/11/11 11:39 上午
 * @Version 1.0
 * @Description
 **/


public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
