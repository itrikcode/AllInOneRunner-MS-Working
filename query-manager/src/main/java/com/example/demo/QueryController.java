package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.TestBean;
import com.example.demo.storage.CommonStorage;

@RestController
public class QueryController {

	
	@Autowired
	CommonStorage db;
	
	@GetMapping("/guery")
	public String getMethodName() {
		return "QUERY CONTROLLER";
	}
	
	@GetMapping("/data")
	public List<Map<String,Object>> getData() {
		 
		System.out.println("QueryController.getData()"+db.iterateDataList().size());
		return db.iterateDataList();
	}
	
}
