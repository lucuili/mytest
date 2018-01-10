package cn.itcast.service;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();
	@Override
	public void save() {
		System.out.println("业务层:用户保存");
		//userDao.save();
	}

}
