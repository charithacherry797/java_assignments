package com.capgemini.hibernate.test;
import com.capgemini.hibernate.*;
import com.capgemini.hibernate.dao.*;
import com.capgemini.hibernate.dao.impl.*;

 class Main {
     public static void main(String[] args){
       PersonDAO dao=new PersonDAOImpl();
       dao.addNew(new Person(101,"cherry"));
       System.out.println("WOW!!!!!");
}
}