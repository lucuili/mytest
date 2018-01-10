package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("持久层:用户保存");
	}
	
}
