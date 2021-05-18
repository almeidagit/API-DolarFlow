package com.dolar.flow.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dolar.flow.models.Dolar;

public interface DolarRepository extends JpaRepository<Dolar, Date>{
	
	@Query(value = "SELECT * FROM TAB_DOLAR ORDER BY DATA_ID", nativeQuery = true)
	List<Dolar> ListarTudo();

	
	
}
