package com.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.User;


@Repository
public class UserDao {
	
	@Autowired
	SessionFactory sf;
	
	public User searchUserById(int uid) {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		User u = session.get(User.class, uid);
		return u;
	}
	
	public int updateUser(User user) {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		User u = session.get(User.class, user.getUid());
		if(u == null) {
			return 0;
		}else {
			tran.begin();
				u.setUname(user.getUname());
				u.setEmail(user.getEmail());
				u.setAge(user.getAge());
				u.setPicture(user.getPicture());
				session.update(u);
			tran.commit();
			return 1;
		}
	}

}
