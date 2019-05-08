package com.capgemini.hibernate;

import javax.persistence.*;
@Entity
public class Person {
          @Id
        private int personId;
        private String personName;
           public Person(){
           }
         public  Person(int id ,String name){
           personId=id; 
           personName=name;
          }
          public String toString(){
                 return  "personId : "+personId+"\npersonName:"+personName;
                 }
}