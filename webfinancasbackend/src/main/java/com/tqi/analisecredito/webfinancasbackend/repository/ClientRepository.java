package com.tqi.analisecredito.webfinancasbackend.repository;

import com.tqi.analisecredito.webfinancasbackend.model.ClienteFisicaBD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClienteFisicaBD, Long>{
	

}
