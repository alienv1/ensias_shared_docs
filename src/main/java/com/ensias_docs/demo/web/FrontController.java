package com.ensias_docs.demo.web;

import com.ensias_docs.demo.dao.ElementModuleRepo;
import com.ensias_docs.demo.dao.FiliereRepo;
import com.ensias_docs.demo.entities.ElementModule;
import com.ensias_docs.demo.entities.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class FrontController {
    @Autowired
    private ElementModuleRepo elementModuleRepo;

    @RequestMapping(value = "/home")
    public String element(Model model){
        List<ElementModule> elementModules = elementModuleRepo.findAll();
        model.addAttribute("elements", elementModules);
        return "element";
    }

    @Autowired
    private FiliereRepo filiereRepo;
    @RequestMapping(value = "/index.html")
    public String index(Model model){
        List<Filiere> filieres = filiereRepo.findAll();
        model.addAttribute("filieres", filieres);
        return "index";
    }

    @RequestMapping(value = "/filieres.html")
    public String filiere(Model model,@RequestParam(name = "id", defaultValue = "1") Long id){
        Optional<Filiere> filiere = filiereRepo.findById(id);
        model.addAttribute("filiere", filiere.get());
        return "filieres";
    }


    @RequestMapping(value = "/elements.html")
    public String element(Model model,@RequestParam(name = "id", defaultValue = "1") Long id){
        Optional<ElementModule> elementModule = elementModuleRepo.findById(id);
        model.addAttribute("filiere", elementModule.get());
        return "elements";
    }
}
