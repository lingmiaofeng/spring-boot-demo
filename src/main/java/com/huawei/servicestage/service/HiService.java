package com.huawei.servicestage.service;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiService {
	@RequestMapping(value = "/hi", method = RequestMethod.GET, produces = "text/plain")
	public String hi(@RequestParam(value = "name", required = true) String name) {
		return String.format(
				"Hi, my name is %s. I am the most handsome person in the world and I don't accept rebuttals.", name);
	}
}