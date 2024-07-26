package th.mfu;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class HelloController {

    @GetMapping("/greet")
    String hello() {
        return "Hello World!";
    }

// @GetMapping("/hi/{name2}")
//     String hi(String name){
// return "HI "+name;
//     }
String[] validNames = {"nacha","john","maria"};

    @GetMapping("/hi/{name}")
   ResponseEntity <String> hi(@PathVariable String name){
// return new ResponseEntity<String>("Hi "+ name, HttpStatus.ok); //(แบบที่1)
// return ResponseEntity.ok("Hi "+name); 

for (String validNames : validNames){            
    if(validNames.equals(name))
    return ResponseEntity.ok("Hi"+name);
}
return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

   
}
