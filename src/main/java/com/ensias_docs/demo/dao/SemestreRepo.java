package com.ensias_docs.demo.dao;

import com.ensias_docs.demo.entities.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreRepo extends JpaRepository<Semestre, Long> {

}