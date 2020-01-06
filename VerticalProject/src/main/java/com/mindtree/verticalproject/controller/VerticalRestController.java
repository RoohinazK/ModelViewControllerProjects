package com.mindtree.verticalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.verticalproject.entity.Vertical;
import com.mindtree.verticalproject.service.VerticalService;

@RestController
public class VerticalRestController {}
//
//	@Autowired
//	private VerticalService verticalService;
//	
//	@GetMapping("/findAllVerticals")
//	public List<Vertical> getAll(){
//		return verticalService.getAll();
//		}
//	
//	@GetMapping("/delete")
//	public void deleteVertical(@RequestParam long id) {
//		verticalService.delete(id);
//	}
//	}