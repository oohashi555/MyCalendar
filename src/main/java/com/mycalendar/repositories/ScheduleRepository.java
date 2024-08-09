package com.mycalendar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycalendar.entity.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer>{

	public Schedule findById(int id);
}
