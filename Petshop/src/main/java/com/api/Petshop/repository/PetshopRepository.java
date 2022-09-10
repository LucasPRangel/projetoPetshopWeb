package com.api.Petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.api.Petshop.petshop.Petshop;

@Repository
public interface PetshopRepository extends JpaRepository<Petshop, String>{
	@Query("Select pts Petshop pts where pts.cnpj = :cnpj Or pts.nome = :nome")
	private List<Petshop> findByCnpjOrNome(@Param("cnpj") String cnpj, @Param("nome") String nome) {
		return null;
	}
}
