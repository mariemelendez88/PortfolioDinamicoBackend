package com.portfolio.backend.repository;

import com.portfolio.backend.entity.Experiencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencias extends JpaRepository<Experiencias, Long>  {
	
}
