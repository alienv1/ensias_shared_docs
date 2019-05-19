package com.ensias_docs.demo;

import com.ensias_docs.demo.dao.FiliereRepo;
import com.ensias_docs.demo.entities.Filiere;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.ensias_docs.demo.dao")
public class EnsiasDocsApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(EnsiasDocsApplication.class, args);
        FiliereRepo filiereRepository = ctx.getBean(FiliereRepo.class);
        //filiereRepository.save(new Filiere("GL", "Génie Logiciel", "description du Génie Logiciel"));
        //filiereRepository.save(new Filiere("eMBI", "e-Management et Business Intelligence", "description du e-Management et Business Intelligence"));
        //filiereRepository.save(new Filiere("IeL", "Ingénierie e-Logistique", "description du Ingénierie e-Logistique"));
        //filiereRepository.save(new Filiere("ISEM", "Ingénierie des Systèmes Embarqués, Mobiles", "description du Ingénierie des Systèmes Embarqués, Mobiles"));
        //filiereRepository.save(new Filiere("IWIM", "Ingénierie du Web et Informatique Mobile", "description du Ingénierie du Web et Informatique Mobile"));
        //filiereRepository.save(new Filiere("SSI", "Sécurité des Systèmes d'Information", "description du Sécurité des Systèmes d'Information"));
        filiereRepository.findAll().forEach(p->System.out.println(p.getNom()));
    }
}
