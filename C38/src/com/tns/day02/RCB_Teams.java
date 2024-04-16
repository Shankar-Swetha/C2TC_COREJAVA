package com.tns.day02;

public class RCB_Teams {

 private String name;
 private int age;
 private int jersyNo;

//get String name
 public String getName() {
	return name;
 }
 //set String name
 public void setName(String name) {
	this.name = name;
 }

//get int age
 public int getAge() {
	return age;
 }
 //set int age
 public void setAge(int age) {
	this.age = age;
 }

//get int jersyNo
 public int getJersyNo() {
	return jersyNo;
 }
 //set int jersyNo
 public void setJersyNo(int jersyNo) {
	this.jersyNo = jersyNo;
 }
 public static void main(String[] args) {
	RCB_Teams obj=new RCB_Teams();
	obj.setName("Virat Kholi");
	obj.setAge(35);
	obj.setJersyNo(18);

	System.out.println(obj.getName());
	System.out.println(obj.getAge());
	System.out.println(obj.getJersyNo());

 }
}


