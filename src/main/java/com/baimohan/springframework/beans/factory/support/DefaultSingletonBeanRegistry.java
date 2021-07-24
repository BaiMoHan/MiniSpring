package com.baimohan.springframework.beans.factory.support;

import com.baimohan.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 类描述：
 *
 * @ClassName DefaultSingletonBeanRegistry
 * @Description 获取单例对象接口的实现
 * @Author BaiMohan
 * @Date 2021/7/24 17:08
 * @Version 1.0
 */
@SuppressWarnings("all")
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String,Object> singletonObjects = new HashMap<>();
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName,Object singletonObject){
        singletonObjects.put(beanName,singletonObject);
    }
}
