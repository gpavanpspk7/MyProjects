package com.myApp.rest.webServices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.persistence.criteria.Predicate;

@Configuration
public class UserDaoService {

	private static List<User>users=new ArrayList<>();
	
	private static int userCount=0;
	static {
		users.add(new User(++userCount,"pavan",LocalDate.now().minusYears(25)));
		users.add(new User(++userCount,"kalyan",LocalDate.now().minusYears(30)));
		users.add(new User(++userCount,"Gotivada",LocalDate.now().minusYears(35)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id) {
		User user = null;
		for (User usr : users) {
			if (usr.getId() == (id)) {
				user = usr;
			}
		}
	//return users.stream().filter(user ->user.getId()== id).findFirst();
		return user;
	}

	public User createUser(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public User deleteById(int id) {
		User user = null;
		for (User usr : users) {
			if (usr.getId() == (id)) {
				user=usr;
				users.remove(usr);
			}
		}
	//return users.stream().filter(user ->user.getId()== id).findFirst();
		return user;
	}
	
}
