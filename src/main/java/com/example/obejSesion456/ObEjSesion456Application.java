package com.example.obejSesion456;

import com.example.obejSesion456.entities.Laptop;
import com.example.obejSesion456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObEjSesion456Application {

	public static void main(String[] args) {


		SpringApplication.run(ObEjSesion456Application.class, args);

		ApplicationContext context = SpringApplication.run(ObEjSesion456Application.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		// CRUD

        // crear laptops

        Laptop l1 = new Laptop(null,"medion","i5",750.3);
        Laptop l2 = new Laptop(null,"hp","i7",1250.3);

        // almacenar un laptop


		System.out.println("Numero de libros en base de datos : " + repository.findAll().size());
		repository.save(l1);
		repository.save(l2);
	}

}
