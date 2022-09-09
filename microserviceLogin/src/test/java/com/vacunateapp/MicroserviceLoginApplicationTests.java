package com.vacunateapp;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.vacunateapp.userModel.Usuario;
import com.vacunateapp.userRepo.UserRepo;


@RunWith(SpringRunner.class)
@SpringBootTest
class MicroserviceLoginApplicationTests {
	
	@Autowired
	private UserRepo repo;
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void crearUser() {
		Usuario us = new Usuario();
		us.setId(1);
		us.setNombre("Dan");
		us.setClave(encoder.encode("123"));
		Usuario retorno = repo.save(us);

		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
