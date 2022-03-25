package com.tuananh;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
	@RequestMapping("/")
	  public String welcome() {
	    return "index spring";
	  }
}
