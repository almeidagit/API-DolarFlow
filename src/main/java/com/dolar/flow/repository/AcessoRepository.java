package com.dolar.flow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dolar.flow.models.Acessos;

public interface AcessoRepository extends JpaRepository<Acessos, String>{
	
	@Query(value = "SELECT * FROM TAB_DOLAR_ACESSOS ORDER BY ID_ACCESS", nativeQuery = true)
	List<Acessos> ListarAcessos();

}
