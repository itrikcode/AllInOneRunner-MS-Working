package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.TestBean;
import com.example.demo.storage.CommonStorage;

import jakarta.annotation.PostConstruct;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
 

@RestController
public class EntityController {

	@GetMapping("/get")
	public String getMethodName() {
		return "Hell in side Enitiy Controller";
	}
	
	//Map<String,Object> map = new HashMap<>();
	
	@Autowired
	CommonStorage db;
	
	@PostMapping("/save")
	public String addData(@RequestBody TestBean data) {
	//	map.put("id", data.getId());
	//	map.put("name", data.getName());
	   return db.save(data);
		
	}
	
}
