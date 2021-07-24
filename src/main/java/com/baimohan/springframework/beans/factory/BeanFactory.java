package com.baimohan.springframework.beans.factory;

import com.baimohan.springframework.beans.BeansException;
import com.baimohan.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 类描述：
 *
 * @ClassName BeanFactory
 * @Description Bean对象的工厂
 * @Author BaiMohan
 * @Date 2021/7/24 17:27
 * @Version 1.2
 */
@SuppressWarnings("all")
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
