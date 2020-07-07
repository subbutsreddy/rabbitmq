package com.org.profinch.model;

import lombok.Data;

import java.io.Serializable;

/*
 * created by yogi
 * */

@Data
public class Employee implements Serializable {
	private String id;
	private String empName;
	private String empId;

}
