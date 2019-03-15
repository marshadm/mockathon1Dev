package com.hcl.policies.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.policies.dao.PolicyRepository;
import com.hcl.policies.model.Polices;

@Service
public class HCLPolicyServiceImpl implements HCLPolicyService{

	@Autowired
	PolicyRepository policyRepository;
	@Override
	public List<Polices> getPolicies(Optional<Map<String,String>> sortMap) {
		return policyRepository.findAll();
	}

}
