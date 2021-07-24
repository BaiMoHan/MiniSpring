package com.baimohan.springframework.beans.factory.config;

/**
 * 类描述：
 *
 * @ClassName BeanDefinition
 * @Description 定义Bean的实例化信息， Object修改为Class
 * @Author BaiMohan
 * @Date 2021/7/24 17:01
 * @Version 1.1
 */
@SuppressWarnings("all")
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
