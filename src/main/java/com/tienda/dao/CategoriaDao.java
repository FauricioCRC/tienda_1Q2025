/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.tienda.dao;
import org.springframework.data.jpa.rpository.JpaRespository;
import com.tienda.domain.Categoria;

/**
 *
 * @author fauri
 */
public interface CategoriaDao extends JpaRepository<Categoria, Long> {
     
}
