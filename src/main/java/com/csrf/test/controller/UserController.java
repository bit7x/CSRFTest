package com.csrf.test.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {

	@GetMapping("/somepath")
	@ResponseBody
	public ResponseEntity<?> home() {
		Map<String,String> responseMap = new HashMap<>();
		responseMap.put("name", "Test Name");
		responseMap.put("value", "Check CSRF token in Headers");
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
