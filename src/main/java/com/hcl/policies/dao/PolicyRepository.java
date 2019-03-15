package com.hcl.policies.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.policies.model.Polices;

@Repository
public interface PolicyRepository extends JpaRepository<Polices, Integer> {
	
	public List<Polices> findAll();
}
