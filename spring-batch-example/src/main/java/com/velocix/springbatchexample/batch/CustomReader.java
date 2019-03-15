package com.velocix.springbatchexample.batch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

import com.velocix.springbatchexample.model.User;

@Component
public class CustomReader implements ItemReader<User> {

	List<User> users = new ArrayList<>();
	int index = 0;

	public CustomReader() {
		initialize();
	}

	private void initialize() {
		User user1 = new User("username1", "001", 12000, new Date());
		User user2 = new User("username2", "002", 13000, new Date());
		User user3 = new User("username3", "003", 12000, new Date());
		User user4 = new User("username4", "001", null, new Date());
		User user5 = new User("username5", "002", 12000, new Date());
		User user6 = new User("username6", "003", 17000, new Date());
		User user7 = new User("username7", "001", 12000, new Date());
		User user8 = new User("username8", "003", 18999, new Date());
		User user9 = new User("username9", "002", 12000, new Date());
		User user10 = new User("username10", "002", 13000, new Date());
		User user11 = new User("username11", "003", 12000, new Date());
		User user12 = new User("username12", "003", 12000, new Date());
		User user13 = new User("username13", "003", 12000, new Date());
		User user14 = new User("username14", "003", 12000, new Date());
		User user15 = new User("username15", "003", 12000, new Date());
		User user16 = new User("username16", "003", 13000, new Date());
		User user17 = new User("username17", "003", 14000, new Date());
		users = Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11, user12,
				user13, user14, user15, user16, user17);
	}

	@Override
	public User read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		User userObj = null;
		if (index < users.size()) {
			userObj = users.get(index);
			index++;
		}
		return userObj;
	}

}
