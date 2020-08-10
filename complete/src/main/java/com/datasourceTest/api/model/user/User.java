package com.datasourceTest.api.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	
	private int id;
	
	private String userName;
	
	/*
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 * public String getUserName() { return userName; } public void
	 * setUserName(String userName) { this.userName = userName; }
	 * 
	 * @Override public String toString() { return "User [id=" + id + ", userName="
	 * + userName + "]"; }
	 */

}
