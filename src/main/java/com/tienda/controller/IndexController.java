
package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author fauri
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) { //le pusimos index pero puede ser cualquier nombre
        //model.addAttribute("attribute", "value");
        return "index";
    }

    @RequestMapping("/contacto")
    public String contacto(Model model) { //le pusimos index pero puede ser cualquier nombre
        //model.addAttribute("attribute", "value");
        return "contacto";
    }
}
