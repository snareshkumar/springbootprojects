package com.velocix.springbatchexample.batch;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.velocix.springbatchexample.mapper.UserMapper;
import com.velocix.springbatchexample.model.User;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void write(List<? extends User> users) throws Exception {

        users.stream().forEach(s->{
        	try {
        	System.out.println("Before Inserting :::"+s.getName());
        	userMapper.insert(s);
        	System.out.println("After insertion:::"+s.getName());
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        });
        
        System.out.println("Insertion Completed Successfully:::");
    }
}
