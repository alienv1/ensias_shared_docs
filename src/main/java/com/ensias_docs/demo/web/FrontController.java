package com.ensias_docs.demo.web;

import com.ensias_docs.demo.dao.ElementModuleRepo;
import com.ensias_docs.demo.dao.FiliereRepo;
import com.ensias_docs.demo.dao.ModuleRepo;
import com.ensias_docs.demo.entities.ElementModule;
import com.ensias_docs.demo.entities.Filiere;
import com.ensias_docs.demo.entities.Module;
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
    @Autowired
    private FiliereRepo filiereRepo;
    @Autowired
    private ModuleRepo moduleRepo;


    @RequestMapping(value = "/home")
    public String element(Model model) {
        List<ElementModule> elementModules = elementModuleRepo.findAll();
        model.addAttribute("elements", elementModules);
        return "element";
    }

    @RequestMapping(value = "/index.html")
    public String index(Model model) {
        List<Filiere> filieres = filiereRepo.findAll();
        model.addAttribute("filieres", filieres);
        return "index";
    }

    @RequestMapping(value = "/contact.html")
    public String contact(Model model) {
        return "contact";
    }
    @RequestMapping(value = "/about.html")
    public String about(Model model) {
        return "about";
    }
    @RequestMapping(value = "/forum.html")
    public String forum(Model model) {
        return "forum";
    }
    @RequestMapping(value = "/events.html")
    public String events(Model model) {
        return "events";
    }
    @RequestMapping(value = "/teachers.html")
    public String teachers(Model model) {
        return "teachers";
    }

    @RequestMapping(value = "/filieres.html")
    public String filiere(Model model, @RequestParam(name = "filiere", defaultValue = "1") Long id
            , @RequestParam(name = "ann", defaultValue = "1") int ann) {
        Optional<Filiere> filiere = filiereRepo.findById(id);
        model.addAttribute("filiere", filiere.get());
        int[] sem = new int[2];
        if (ann == 2) {
            sem[0] = 3;
            sem[1] = 4;
        } else if (ann == 3) {
            sem[0] = 5;
            sem[1] = 6;
        } else {
            sem[0] = 1;
            sem[1] = 2;
        }
        model.addAttribute("sem", sem);
        return "filieres";
    }


    @RequestMapping(value = "/elements.html")
    public String element(Model model,
                          @RequestParam(name = "module", defaultValue = "1") Long id_module,
                          @RequestParam(name = "filiere", defaultValue = "1") Long id_filiere,
                          @RequestParam(name = "element", defaultValue = "-1") Long id_elem
    ) {
        Module module = moduleRepo.findById(id_module).get();
        Filiere filiere = filiereRepo.findById(id_filiere).get();
        model.addAttribute("module", module);
        model.addAttribute("filiere", filiere);
        ElementModule elementModule;
        if (id_elem == -1) {
            elementModule = module.getElementModules().iterator().next();
        } else {
            elementModule = elementModuleRepo.findById(id_elem).get();
        }
        model.addAttribute("elem", id_elem);
        model.addAttribute("element", elementModule);
        return "elements";
    }
}
