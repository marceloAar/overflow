package com.mar.overflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mar.overflow.models.Tag;
import com.mar.overflow.repositories.TagRepository;

@Service
public class TagService {
	
	private final TagRepository tagRepository;

	public TagService(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}

	public Tag createTag(Tag b) {
		return tagRepository.save(b);
	}

	public List<Tag> allTag() {
		return tagRepository.findAll();
	}

	public Tag findTag(Long id) {
		Optional<Tag> optionalTag = tagRepository.findById(id);
		if (optionalTag.isPresent()) {
			return optionalTag.get();
		} else {
			return null;
		}
	}

}
