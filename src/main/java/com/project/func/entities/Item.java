package com.project.func.entities;

import java.io.Serializable;

public class Item  implements Serializable{
	
private static final long serialVersionUID = 1L;

private String name ;
private String code ;
private String date;
private Dimension dimension;

public Item() {
	
}


public Item(String name, String code, String date, Dimension dimension) {
	
	this.name = name;
	this.code = code;
	this.date = date;
	this.dimension = dimension;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getCode() {
	return code;
}



public void setCode(String code) {
	this.code = code;
}



public String getDate() {
	return date;
}



public void setString(String date) {
	this.date = date;
}



public Dimension getDimension() {
	return dimension;
}



public void setDimension(Dimension dimension) {
	this.dimension = dimension;
}


}


