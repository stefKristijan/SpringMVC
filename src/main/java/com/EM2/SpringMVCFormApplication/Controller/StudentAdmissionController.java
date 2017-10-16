package com.EM2.SpringMVCFormApplication.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.EM2.SpringMVCFormApplication.Model.Student;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView admissionForm() {
		
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		
		return modelAndView;
		
	}
	
	/*@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView admissionForm(@RequestParam("name") String name, @RequestParam("hobby") String hobby) {
		
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("msg","You've submitted<br>Name: "+name+"<br>Hobby: "+hobby);
		
		return modelAndView;
	}*/
	
	/*@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView admissionForm(@RequestParam Map<String, String> reqParams) {
		
		String name = reqParams.get("name");
		String hobby = reqParams.get("hobby");
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("msg","You've submitted<br>Name: "+name+"<br>Hobby: "+hobby);
		
		return modelAndView;
	}*/
	
	@ModelAttribute
	public void setHeader(Model model) {
		model.addAttribute("headerMessage","Ovo su gontuseries tutoriali za Spring MVC");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"mobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy.");
		binder.registerCustomEditor(Date.class, "date", new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView admissionForm(@ModelAttribute("student") Student student, BindingResult result) {
		
		if(result.hasErrors()) {
			return new ModelAndView("AdmissionForm");
		}
		
		return new ModelAndView("AdmissionSuccess");
	}
}
