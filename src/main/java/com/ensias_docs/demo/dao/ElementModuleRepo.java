package com.ensias_docs.demo.dao;

import com.ensias_docs.demo.entities.ElementModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementModuleRepo extends JpaRepository<ElementModule, String> {

}