//package com.github.lalyos.jfiglet;
//package julian.gamboa.herokuSetembro;

package com.github.aula-maven-repl.herokuSetembro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HerokuSetembroApplication {

	
	@RequestMapping("/")
	public String home() {
	  return "Hello   2022";
	}
  
	public static void main(String[] args) {
	  SpringApplication.run(HerokuSetembroApplication.class, args);
	}

}
