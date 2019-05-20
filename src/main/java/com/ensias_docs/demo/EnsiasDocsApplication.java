package com.ensias_docs.demo;

import com.ensias_docs.demo.dao.ElementModuleRepo;
import com.ensias_docs.demo.dao.FiliereRepo;
import com.ensias_docs.demo.dao.ModuleRepo;
import com.ensias_docs.demo.entities.ElementModule;
import com.ensias_docs.demo.entities.Filiere;
import com.ensias_docs.demo.entities.Module;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.ensias_docs.demo.dao")
public class EnsiasDocsApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(EnsiasDocsApplication.class, args);
        /*FiliereRepo filiereRepository = ctx.getBean(FiliereRepo.class);
        filiereRepository.save(new Filiere("GL", "Génie Logiciel", "description du Génie Logiciel"));
        filiereRepository.save(new Filiere("eMBI", "e-Management et Business Intelligence", "description du e-Management et Business Intelligence"));
        filiereRepository.save(new Filiere("IeL", "Ingénierie e-Logistique", "description du Ingénierie e-Logistique"));
        filiereRepository.save(new Filiere("ISEM", "Ingénierie des Systèmes Embarqués, Mobiles", "description du Ingénierie des Systèmes Embarqués, Mobiles"));
        filiereRepository.save(new Filiere("IWIM", "Ingénierie du Web et Informatique Mobile", "description du Ingénierie du Web et Informatique Mobile"));
        filiereRepository.save(new Filiere("SSI", "Sécurité des Systèmes d'Information", "description du Sécurité des Systèmes d'Information"));
        filiereRepository.findAll().forEach(p->System.out.println(p.getNom()));

        ModuleRepo moduleRepo = ctx.getBean(ModuleRepo.class);
        Module module = new Module("M1.1","Algorithmique & Programmation",56);
        moduleRepo.save(module);
        Module module1 = new Module("M1.2","Structures de données ",60);
        moduleRepo.save(module1);
        Module module2 = new Module("M1.3","Electronique numérique & circuits logiques",57);
        moduleRepo.save(module2);
        Module module3 = new Module("M1.4","Architecture des ordinateurs",56);
        moduleRepo.save(module3);
        moduleRepo.save(new Module("M1.5","Eléments de Recherche opérationnelle",59));
        moduleRepo.save(new Module("M1.6","Probabilité et Simulation",52));
        moduleRepo.save(new Module("M1.7","Gestion, Economie et Finance 1 ",58));
        moduleRepo.save(new Module("M1.8","Langue et communication 1",52));

        ElementModuleRepo elementModuleRepo = ctx.getBean(ElementModuleRepo.class);
        elementModuleRepo.save(new ElementModule("M1.1.1", "Algorithmique", "description", module));
        elementModuleRepo.save(new ElementModule("M1.1.2", "Programmation C", "description", module));*/
    }
}
