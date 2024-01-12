package com.example.demo.storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.TestBean;

@Repository
public class CommonStorage {
	private List<Map<String, Object>> dataList = new ArrayList<>();
	
	public String save(TestBean t) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", t.getId());
		map.put("name",t.getName());
		dataList.add(map);
		System.out.println(map);
		return "pass";
	}
	
	public List<Map<String, Object>> iterateDataList() {
        for (Map<String, Object> dataMap : dataList) {
            System.out.println("Data Set:");

            for (Map.Entry<String, Object> entry : dataMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("------");
        }
        return dataList;
    }

}
