package com.baimohan.springframework.test;

import com.baimohan.springframework.beans.factory.config.BeanDefinition;
import com.baimohan.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.baimohan.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * 类描述：
 *
 * @ClassName ApiTest
 * @Description 测试用例
 * @Author BaiMohan
 * @Date 2021/7/24 16:37
 * @Version 1.0
 */
@SuppressWarnings("all")
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 3.第二次获取bean
        UserService userService2 = (UserService) beanFactory.getBean("userService");
        userService2.queryUserInfo();
    }
}
