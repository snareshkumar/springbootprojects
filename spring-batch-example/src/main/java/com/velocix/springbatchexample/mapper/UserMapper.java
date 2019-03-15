package com.velocix.springbatchexample.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectKey;

import com.velocix.springbatchexample.model.User;

@Mapper
public interface UserMapper {

	
	@Insert("insert into users(name,dept,salary) values(#{name},#{dept},#{salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(User users);
}
