package com.user.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.api.output.UserInfo;

@Service
public class UserService {

	public List<UserInfo> getUserInfo() {

		List<UserInfo> userInfoList = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {

			UserInfo u = new UserInfo();
			u.setUserId(i);
			u.setUserName("USer Name " + i);
			u.setSalary(i * 100.00);
			userInfoList.add(u);
		}

		return userInfoList;
	}

}
