package com.ensias_docs.demo.web;

import com.ensias_docs.demo.dao.FiliereRepo;
import com.ensias_docs.demo.entities.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FrontController {
    @Autowired
    private FiliereRepo filiereRepo;

    @RequestMapping(value = "/home")
    public String filiere(Model model){
        List<Filiere> filieres = filiereRepo.findAll();
        model.addAttribute("filieres", filieres);
        return "filieres";
    }
}
