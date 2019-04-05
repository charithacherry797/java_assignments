package com.capgemini.spring.provider;
import org.springframework.beans.factory.annotation.*;

      public class HWMessageProvider implements MessageProvider {
      @Override
      public String getMessage() {
      return "Hello World";
      }
}
