package com.ensias_docs.demo.dao;

import com.ensias_docs.demo.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnseignantRepo extends JpaRepository<Enseignant, Long> {

}