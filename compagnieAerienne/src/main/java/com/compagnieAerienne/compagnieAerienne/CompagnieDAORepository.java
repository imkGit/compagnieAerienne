package com.compagnieAerienne.compagnieAerienne;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CompagnieDAORepository  extends CrudRepository<AirCompagnie, Long>{
	public  List<AirCompagnie> findByNomCompagnie(String name);
}
