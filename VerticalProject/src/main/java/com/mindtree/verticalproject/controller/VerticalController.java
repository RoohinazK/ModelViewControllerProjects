package com.mindtree.verticalproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.verticalproject.entity.Vertical;
import com.mindtree.verticalproject.service.VerticalService;

@Controller
public class VerticalController {

	int verticalId1;
	@Autowired
	private VerticalService verticalService;

	@RequestMapping("/")
	public String first(Model model) {
		List<Vertical> verticalList = verticalService.getAll();

		model.addAttribute("verticals", verticalList);
		return "first";
	}

	@PostMapping("/add")
	public String add(Vertical vertical, Model model) {
		verticalService.add(vertical);
		List<Vertical> verticalList = verticalService.getAll();

		model.addAttribute("verticals", verticalList);
		return "first";
	}

	@RequestMapping("/update")
	public String updateCount(int verticalId, Model model) {
		Vertical vertical = verticalService.updateVerticals(verticalId);
		model.addAttribute("vertical", vertical);
		return "edit";
	}

	@PostMapping("/updateName")
	public String updateName(Model model, int verticalId, String verticalName) {
		Vertical vertical = verticalService.updateDetails(verticalId, verticalName);
		List<Vertical> verticalList = verticalService.getAll();
		model.addAttribute("verticals", verticalList);
//		model.addAttribute("vertical", vertical);
		return "first";
	}

	@RequestMapping("/delete")
	public String deleteVehicles(Model model, int verticalId) {
		verticalService.deleteVertical(verticalId);
		List<Vertical> verticalList = verticalService.getAll();
		model.addAttribute("verticals", verticalList);
		return "first";
	}

}