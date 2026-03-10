package com.oderServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oderServer.request.RequestPojo;
import com.oderServer.service.OderService;

@RestController
@RequestMapping("/oders")
public class OderController {
	
	@Autowired
	OderService oderservice;
	
	@PostMapping("/placeOder")
	public String placeingOrder(@RequestBody RequestPojo requestpojo ) {
		
		
		
		oderservice.placingOderService(requestpojo);
		return "ok";
	}

}
