package com.kypnt.devopsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KypntDevopsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(KypntDevopsBackendApplication.class, args);
	}

}

public class App1
{

    private final String message = "Hello World from Java Maven Project!";

    public App1() {}

    public static void main(String[] args) {
        System.out.println(new App1().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}

public class App2
{

    private final String message = "Hello World from Java Maven Project!";

    public App2() {}

    public static void main(String[] args) {
        System.out.println(new App2().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}

public class App3
{

    private final String message = "Hello World from Java Maven Project!";

    public App3() {}

    public static void main(String[] args) {
        System.out.println(new App3().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
