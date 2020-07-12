package com.telusko.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telusko.demo.model.Alien;
@Repository
public interface AlienDao extends JpaRepository<Alien,Integer>{

	//public List<Alien> findByLang(String lang);
	
	public List<Alien> findByIdGreaterThan(int id);
	
	@Query("from Alien where lang=?1 order by name")
	public List<Alien> findByLangSorted(String lang);

	 public List<Alien> findByLang(String string);


	
	
	
}
