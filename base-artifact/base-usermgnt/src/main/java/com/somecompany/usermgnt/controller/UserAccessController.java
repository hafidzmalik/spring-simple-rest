package com.somecompany.usermgnt.controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.somecompany.usermgnt.dto.FeatureGetResponse;
import com.somecompany.usermgnt.dto.FeaturePostRequest;

@RestController
@RequestMapping(path = "/useraccess")
public class UserAccessController {

	@GetMapping(value = "/feature", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public FeatureGetResponse retrieveFeature(@RequestParam(name = "email") String email, 
			@RequestParam(name = "featureName") String featureName) {
		FeatureGetResponse response = new FeatureGetResponse();
		// if end point = received value
		response.setCanAccess(true);
		
		return response; 
	}
	
	@PostMapping(value = "/feature", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> postFeature(@RequestBody FeaturePostRequest request) {
		
		// if database response OK
		return ResponseEntity.ok().build();
		
		// else 
		// return ResponseEntity.notFound().build();
	}
}
