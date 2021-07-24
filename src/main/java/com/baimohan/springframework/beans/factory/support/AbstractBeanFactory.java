package com.baimohan.springframework.beans.factory.support;


import com.baimohan.springframework.beans.BeansException;
import com.baimohan.springframework.beans.factory.BeanFactory;
import com.baimohan.springframework.beans.factory.config.BeanDefinition;

/**
 * 类描述：
 *
 * @ClassName AbstractBeanFactory
 * @Description bean工厂模板方法抽象类
 * @Author BaiMohan
 * @Date 2021/7/24 17:13
 * @Version 1.0
 */
@SuppressWarnings("all")
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
