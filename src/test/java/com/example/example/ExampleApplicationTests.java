package com.example.example;

import com.example.example.entity.UserInfo;
import com.example.example.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
class ExampleApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {

        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("lihao");
        userInfo.setAddress("北京");
        userInfo.setId("1");

        int i = userMapper.insertUser(userInfo);
        System.out.println("i = " + i);
    }


    @Test
    void showALl() {
        System.out.println("-----------------------");
        userMapper.showAll().forEach(System.out::println);
        System.out.println("-----------------------");

    }

    @Test
    public void test01() {



        List<UserInfo> list = new ArrayList<>();
        list.add(new UserInfo("Jerry", "上海", "2"));
        list.add(new UserInfo("lihao", "北京", "1"));
        list.add(new UserInfo("Toone", "广州", "3"));

//        Collections.sort(list, new Comparator<UserInfo>() {
//            @Override
//            public int compare(UserInfo o1, UserInfo o2) {
//                if (Integer.parseInt(o1.getAddress()) > Integer.parseInt(o2.getAddress())) {
//                    return 1;
//                } else if (Integer.parseInt(o1.getAddress()) < Integer.parseInt(o2.getAddress())) {
//                    return -1;
//                }
//                return 0;
//            }
//        });

//        list.sort((o1, o2) -> {
//            if (Integer.parseInt(o1.getAddress())>Integer.parseInt(o2.getAddress())) {
//                return 1;
//            }else if (Integer.parseInt(o1.getAddress())<Integer.parseInt(o2.getAddress())){
//                return -1;
//            }
//            return 0;
//        });
//        list.forEach(System.out::println);

        list.stream().sorted(Comparator.comparing(UserInfo::getAddress)).collect(Collectors.toList()).forEach(System.out::println);
    }



    @Test
    public void test02(){

    }



























































}
