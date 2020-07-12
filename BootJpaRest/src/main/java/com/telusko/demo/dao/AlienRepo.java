package com.telusko.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.telusko.demo.model.Alien;
@RepositoryRestResource(collectionResourceRel="aliens",path="aliens")
public interface AlienRepo extends JpaRepository<Alien,Integer>{

	
	
	
}
