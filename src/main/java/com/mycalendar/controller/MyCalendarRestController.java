package com.mycalendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycalendar.repositories.ScheduleRepository;

@RestController
public class MyCalendarRestController {

	@Autowired
	ScheduleRepository repository;
	
	@RequestMapping("/")
	public String hello() {
		return "";
	}
}
