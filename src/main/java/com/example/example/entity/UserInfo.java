package com.example.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author LH
 * @Description:
 * @Date 2022/11/9
 * @Version 1.0
 **/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private String id;
    private String username;
    private String address;

    public void df(){
        
    }

//    @Override
//    public int compareTo(UserInfo o) {
//        if (Integer.parseInt(o.getAddress())>Integer.parseInt(address)){
//            return 1;
//        }else if (Integer.parseInt(o.getAddress())<Integer.parseInt(address)){
//            return -1;
//        }
//        return 0;
//    }
}
