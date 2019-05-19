package com.ensias_docs.demo.dao;

import com.ensias_docs.demo.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DocumentRepo extends JpaRepository<Document, Long> {

}