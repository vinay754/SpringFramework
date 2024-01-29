package com.vinay.Telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	//create Spring Container 
       ApplicationContext conext = new ClassPathXmlApplicationContext("com/vinay/Telusko/Configmetadata.xml"); 
       Order order =(Order) conext.getBean("order");
       System.out.println("Productid:"+order.getProductid());
       System.out.println("ProductName:"+order.getProductname());
       System.out.println("Orderdate:"+order.getOrderdate());
       System.out.println("CustomerName:"+order.getCustomer().getName());
       System.out.println("ContactNo:"+order.getCustomer().getContact());
       System.out.println("Address:"+order.getCustomer().getAddress());
       
       
		/*
		 * Customerc customerc=(Customerc) conext.getBean("cusc");
		 * System.out.println("Customer Details:" + customerc.toString()) ;
		 */
    }
}
