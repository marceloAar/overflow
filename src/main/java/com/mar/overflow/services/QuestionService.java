package com.mar.overflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mar.overflow.models.Question;
import com.mar.overflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	
	private final QuestionRepository questionRepository;

	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	public Question createQuestion(Question b) {
		return questionRepository.save(b);
	}

	public List<Question> allQuestion() {
		return questionRepository.findAll();
	}

	public Question findQuestion(Long id) {
		Optional<Question> optionalQuestion = questionRepository.findById(id);
		if (optionalQuestion.isPresent()) {
			return optionalQuestion.get();
		} else {
			return null;
		}
	}

}
