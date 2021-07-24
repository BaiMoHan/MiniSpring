package com.baimohan.springframework.beans.factory.support;

import com.baimohan.springframework.beans.factory.config.BeanDefinition;

/**
 * 接口描述:
 *
 * @ClassName BeanDefinitionRegistry
 * @Description 注册BeanDefinition的接口
 * @Author baimohan
 * @Date 2021/7/24 18:53
 * @Version 1.0
 */
@SuppressWarnings("all")
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
