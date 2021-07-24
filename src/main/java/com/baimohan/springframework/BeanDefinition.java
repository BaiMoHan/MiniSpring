package com.baimohan.springframework;

/**
 * 类描述：
 *
 * @ClassName BeanDefinition
 * @Description 定义Bean的实例化信息，当前实现为 Object
 * @Author BaiMohan
 * @Date 2021/7/24 16:18
 * @Version 1.0
 */
@SuppressWarnings("all")
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
