package io.github.springbootcourse.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdutosapiApplication {

    public static String helloWorld(){
        return "HelloWorld";
    }

    public static void main(String[] args) {
		SpringApplication.run(ProdutosapiApplication.class, args);
	}





}
