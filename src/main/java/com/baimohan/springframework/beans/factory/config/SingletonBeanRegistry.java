package com.baimohan.springframework.beans.factory.config;

/**
 * 类描述：
 *
 * @ClassName SingletonBeanRegistry
 * @Description 获取一个单例对象的接口
 * @Author BaiMohan
 * @Date 2021/7/24 17:05
 * @Version 1.0
 */
@SuppressWarnings("all")
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
