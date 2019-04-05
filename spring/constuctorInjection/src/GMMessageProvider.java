package com.capgemini.spring.provider;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
 @Component("GM")
     public class GMMessageProvider implements MessageProvider {

     public String getMessage() {
     return "Good Morning";
 }
}
