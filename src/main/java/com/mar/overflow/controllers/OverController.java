package com.mar.overflow.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mar.overflow.models.Question;
import com.mar.overflow.models.Tag;
import com.mar.overflow.services.QuestionService;
import com.mar.overflow.services.TagService;

@Controller
public class OverController {	

	private final QuestionService questionService;
	private final TagService tagService;

	public OverController(QuestionService questionService, TagService tagService) {
		this.questionService = questionService;
		this.tagService = tagService;
	}
	
	@RequestMapping("/questions")
	//public String newDojo(@ModelAttribute("pregunta") Question question, Tag tag, Model model) {
	public String newDojo( Model model) {
	
		List<Question> question = questionService.allQuestion();
		List<Tag> tag = tagService.allTag();
		model.addAttribute("preguntas", question);
		model.addAttribute("etiquetas", tag);
		return "/index.jsp";
	}
	
	@RequestMapping("/questions/new")
	public String crear(@ModelAttribute("preguntas") Question question, Tag tag) {
		return "/new.jsp";
	}

	@RequestMapping(value = "/questions/new", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("preguntas") Question question, Tag tag, BindingResult result) {
		if (result.hasErrors()) {
			return "/new.jsp";
		} else {
			questionService.createQuestion(question);
			tagService.createTag(tag);
			return "redirect:/questions/new";
		}
	}
	

}
