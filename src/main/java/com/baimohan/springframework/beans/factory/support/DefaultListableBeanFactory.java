package com.baimohan.springframework.beans.factory.support;

import com.baimohan.springframework.beans.BeansException;
import com.baimohan.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * 类描述：
 *
 * @ClassName DefaultListableBeanFactory
 * @Description 核心类
 * @Author BaiMohan
 * @Date 2021/7/24 18:51
 * @Version 1.0
 */
@SuppressWarnings("all")
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

}
