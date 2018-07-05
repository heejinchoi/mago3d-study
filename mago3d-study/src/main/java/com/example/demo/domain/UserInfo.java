package com.example.demo.domain;

import lombok.Data;

@Data
public class UserInfo {
	private String user_id;
	private String password;
	private String salt;
	private String name;
	private String country;
	private String insert_date;
	private String update_date;

}
