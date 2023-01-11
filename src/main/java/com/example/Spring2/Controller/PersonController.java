package com.example.Spring2.Controller;

import com.example.Spring2.Module.Person;
import com.example.Spring2.Service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


@GetMapping("/person")
public String index() {
    return "hello raj how are you";

}
}



