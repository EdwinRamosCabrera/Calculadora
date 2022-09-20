package edu.usmp.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.usmp.myapp.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, String> {
    
}
