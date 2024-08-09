package com.mycalendar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="schedule")
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int scId;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String scDate;
	
	@Column
	private String timeFrom;
	
	@Column
	private String timeTo;
	
	@Column
	private String detail;
}
