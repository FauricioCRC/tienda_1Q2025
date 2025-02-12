/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */

package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tienda.service.impl.CategoriaService;

/**
 *
 * @author fauri
 */
@Controller
@RequestMapping("/categoria") //prefijo que se le va a poner a todos los mapping de ese controlador
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping("/listado")
    public String page(Model model) {
        var categorias = categoriaService.getCategorias(false);
        
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalCategorias", categorias.size());
        return "/categoria/listado";
    }

}
