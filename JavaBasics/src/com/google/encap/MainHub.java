package com.google.encap;

public class MainHub {
	public static void main(String[] args) {
      MyEncapusaltion encapusaltion = new MyEncapusaltion();
      encapusaltion.setName("pawan");
      encapusaltion.setRollNo(100);
      encapusaltion.setStandard("Tenth standard");
      
      
      encapusaltion.setRollNo(1000000);
      
      System.out.println(encapusaltion.getName());
      System.out.println(encapusaltion.getRollNo());
      System.out.println(encapusaltion.getStandard());
	}
}
