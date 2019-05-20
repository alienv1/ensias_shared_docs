package com.ensias_docs.demo.web;

import com.ensias_docs.demo.dao.ElementModuleRepo;
import com.ensias_docs.demo.dao.FiliereRepo;
import com.ensias_docs.demo.entities.ElementModule;
import com.ensias_docs.demo.entities.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
}
