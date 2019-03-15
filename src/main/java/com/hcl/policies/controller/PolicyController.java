package com.hcl.policies.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.policies.model.Polices;
import com.hcl.policies.service.HCLPolicyService;

@RestController
@CrossOrigin
@RequestMapping("/insurance")
public class PolicyController {
	 @Autowired
	 HCLPolicyService hclPolisyservice;
	 @GetMapping(path="/policies")
	 public List<Polices> policies(){
		 Optional<Map<String,String>> optional = Optional.empty();
		 return  hclPolisyservice.getPolicies(optional);
		 
	 }
	
	/*
	 * @GetMapping(path="/policyDetails", produces = "application/json") public
	 * Policydetails getPolicyDetails(int id){
	 * 
	 * return hclPolicyservice.getPolicyDetails(id);
	 * 
	 * }
	 * 
	 * @GetMapping(path="/policyAnalytics", produces = "application/json") public
	 * Policies policyAnalytics(){ return hclPolicyservice.getPolicies();
	 * 
	 * }
	 * 
	 * 
	 */

}
