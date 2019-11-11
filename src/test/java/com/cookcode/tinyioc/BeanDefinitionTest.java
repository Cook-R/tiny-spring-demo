package com.cookcode.tinyioc;

/**
 * @ClassName tinyspringdemo
 * @Author cookr
 * @Date 2019/11/11 11:49 上午
 * @Version 1.0
 * @Description
 **/


public class BeanDefinitionTest {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        beanFactory.registerBeanDefinition("helloWorld", beanDefinition);

        HelloWorldService helloWorld = (HelloWorldService) beanFactory.getBean("helloWorld");
        helloWorld.helloWorld();

    }





}
