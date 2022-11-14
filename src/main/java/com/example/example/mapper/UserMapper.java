package com.example.example.mapper;

import com.example.example.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserInfo> showAll();

    int  insertUser (UserInfo userInfo);

}
