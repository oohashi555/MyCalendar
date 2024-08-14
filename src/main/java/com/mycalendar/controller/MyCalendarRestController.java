package com.mycalendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycalendar.entity.Schedule;
import com.mycalendar.repositories.ScheduleRepository;

import reactor.core.publisher.Mono;

@RestController
public class MyCalendarRestController {

	@Autowired
	ScheduleRepository repository;
	
	@GetMapping("/")
	@CrossOrigin
	public Mono<Schedule> hello() {
		return Mono.just(new Schedule());
	}
}
