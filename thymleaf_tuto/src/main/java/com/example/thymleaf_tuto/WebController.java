package com.example.thymleaf_tuto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
	@RequestMapping(value = "/employeeList", method = RequestMethod.GET)
	@ResponseBody
	public List<String> getEmployeeList(
			@RequestParam(value = "term", required = false, defaultValue = "") String term) {

		List<String> empList = new ArrayList<String>();
		empList.add("nader");
		empList.add("rimeh");
		empList.add("khouloud");
		empList.add("wajdi");
		return empList;
	}
}
