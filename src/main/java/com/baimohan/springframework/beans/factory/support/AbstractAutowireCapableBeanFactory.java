package com.baimohan.springframework.beans.factory.support;

import com.baimohan.springframework.beans.BeansException;
import com.baimohan.springframework.beans.factory.config.BeanDefinition;

/**
 * 类描述：
 *
 * @ClassName AbstractAutowireCapableBeanFactory
 * @Description Bean的实例化
 * @Author BaiMohan
 * @Date 2021/7/24 18:46
 * @Version 1.0
 */
@SuppressWarnings("all")
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        addSingleton(beanName, bean);
        return bean;
    }
}
