package com.ksl.jms.sample.interfac.test;

public class display implements DisplayInterface
{
  public String name;
	public void display1() {
		
		System.out.println("This person name is:" + this.name);
		
	}
}
