package com.baimohan.springframework.beans;/**
 * 类描述：
 *
 * @ClassName BeansException
 * @Description 有关bean的自定义异常
 * @Author BaiMohan
 * @Date 2021/7/24 17:18
 * @Version 1.0
 */
@SuppressWarnings("all")
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
