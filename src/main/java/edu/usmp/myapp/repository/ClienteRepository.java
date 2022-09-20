package edu.usmp.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.usmp.myapp.model.Cliente;
import edu.usmp.myapp.model.Usuario;



@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
   
    @Query(value = "SELECT o FROM Cliente o WHERE o.user=?1")
    Cliente findByUsuario(Usuario user);

}
