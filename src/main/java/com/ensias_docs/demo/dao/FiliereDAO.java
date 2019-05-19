package com.ensias_docs.demo.dao;

import com.ensias_docs.demo.entities.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FiliereDAO {

	@Autowired
	private FiliereRepo filiereRepo;

	public FiliereDAO() {
	}
	
	public void save(Filiere filiere){
		filiereRepo.save(filiere);
	}
	
	/*public List<Filiere> find(String name){
		return filiereRepo.findByName(name);
	}*/
}