package com.mar.overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mar.overflow.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
	
	List<Tag> findAll();
}
