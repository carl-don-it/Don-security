/**
 * 
 */
package com.imooc.security;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;

/**
 * @author zhailiang
 *
 */
//@Component 不使用隐式登陆
public class DemoConnectionSignUp implements ConnectionSignUp {

	/* (non-Javadoc)
	 * @see org.springframework.social.connect.ConnectionSignUp#execute(org.springframework.social.connect.Connection)
	 */
	@Override
	public String execute(Connection<?> connection) {
		// 根据connection信息自己后台注册Demo项目用户并返回用户id; 这里没有实现业务
		return connection.getDisplayName();
	}

}