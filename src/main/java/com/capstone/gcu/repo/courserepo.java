package com.capstone.gcu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.gcu.entity.course;

public interface courserepo extends JpaRepository<course, Integer> {

	public course findCourseByCourseid(long courseid);
}
