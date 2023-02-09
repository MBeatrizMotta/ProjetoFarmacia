package com.farmaria.farmaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.farmaria.farmaria.mondel.ProdutosModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutosModel, Long>{
	public List <ProdutosModel> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);


}
