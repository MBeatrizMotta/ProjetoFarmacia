package com.farmaria.farmaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.farmaria.farmaria.mondel.AtributosModel;

@Repository
public interface AtributosRepository extends JpaRepository<AtributosModel, Long>{
	public List<AtributosModel> findAllByCategoriaContainingIgnoreCase(@Param("categoria") String categoria);
	public List<AtributosModel> findAllByMarcaContainingIgnoreCase(@Param("marca") String marca);

}
