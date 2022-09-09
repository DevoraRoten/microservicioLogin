package com.vacunateapp.userRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vacunateapp.userModel.Usuario;

@Repository
public interface UserRepo extends JpaRepository<Usuario, Long>{
	 Usuario findByNombre(String nombre);
}
