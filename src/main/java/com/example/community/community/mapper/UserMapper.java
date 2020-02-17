package com.example.community.community.mapper;

import com.example.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface UserMapper {
    @Insert("insert into USER (name,account_id,token,gmt_Create,gmt_Modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
