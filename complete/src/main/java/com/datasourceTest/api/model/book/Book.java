package com.datasourceTest.api.model.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	private int id;
	private String name;
	/*
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; }
	 * 
	 * @Override public String toString() { return "Book [id=" + id + ", name=" +
	 * name + "]"; }
	 */
	
	

}
