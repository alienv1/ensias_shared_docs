package com.ensias_docs.demo.dao;

import com.ensias_docs.demo.entities.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FiliereRepo extends JpaRepository<Filiere, Long> {

}