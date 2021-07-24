package com.baimohan.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 类描述：
 *
 * @ClassName BeanFactory
 * @Description Bean对象的工厂
 * @Author BaiMohan
 * @Date 2021/7/24 16:21
 * @Version 1.0
 */
@SuppressWarnings("all")
public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();


    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
