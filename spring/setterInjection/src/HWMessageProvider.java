package com.capgemini.spring.provider;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
@Component("HW")
      public class HWMessageProvider implements MessageProvider {
      public String getMessage() {
      return "Hello World";
      }
}
