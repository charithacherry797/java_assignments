package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
@Component
public class MessageRenderer {
       private MessageProvider provider;
       @Autowired
       
       public void MessageProvider(MessageProvider provider){
           this.provider=provider;
       }
       public void render(){
      System.out.println(provider.getMessage());
}
}