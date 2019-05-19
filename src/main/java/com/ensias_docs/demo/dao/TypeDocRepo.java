package com.ensias_docs.demo.dao;

import com.ensias_docs.demo.entities.TypeDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TypeDocRepo extends JpaRepository<TypeDoc, Long> {

}