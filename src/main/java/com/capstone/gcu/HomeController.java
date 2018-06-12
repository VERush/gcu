package com.capstone.gcu;
/*
 * Capstone: Grand Circus University
 * Victoria Rush
 * June 2018
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capstone.gcu.entity.course;
import com.capstone.gcu.repo.courserepo;
import com.capstone.gcu.repo.studentrepo;

@Controller
public class HomeController {
	
	@Autowired
	studentrepo sr;
	
	@Autowired
	courserepo cr;

	@RequestMapping("/")
	public ModelAndView start() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/courselist")
	public ModelAndView courselist() {
		return new ModelAndView("courselist");
	}
	
	@RequestMapping("/courseroster")
	public ModelAndView courseroster(@RequestParam("courseid")long courseid) {
//		Optional<student> roster = sr.findByCourseid(courseid);
		course c1 = cr.findCourseByCourseid(courseid);
		System.out.println(c1.getStudents());
		return new ModelAndView("courseroster", "roster", c1);
	}
	
	@RequestMapping("/transcript")
	public ModelAndView transcript() {
		return new ModelAndView("transcript");
	}
}
