package com.yash.customermvcdemo.model;

public class Customer {
int id;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}



}
