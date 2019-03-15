package com.hcl.policies.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hcl.policies.model.Polices;

@Service
public interface HCLPolicyService {

	public List<Polices> getPolicies(Optional<Map<String,String>> sortMap);
	
	
}
