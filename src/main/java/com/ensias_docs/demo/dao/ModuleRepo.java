package com.ensias_docs.demo.dao;

import com.ensias_docs.demo.entities.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepo extends JpaRepository<Module, Long> {

}