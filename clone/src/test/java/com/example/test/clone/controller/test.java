package com.example.test.clone.controller;

import com.example.test.parent.vo.User;
import org.junit.Test;

/**
 * @Desc
 * @Author ChenFei
 * @Date 2020/8/12 17:13
 */
public class test {
    @Test
    public void test(){
        User u = new User("1", "zhangsan");
        System.out.println(u.toString());
    }
}
