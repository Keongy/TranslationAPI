package com.translation.service;

import com.translation.model.Content;
import com.translation.repository.ContentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {
    
    private final ContentRepository contentRepository;

    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }
    
    public List<Content> getAllContent() {
        return contentRepository.findAll();
    }

    public List<Content> getContentByLanguage(String language) {
        return contentRepository.findAll().stream()
                .filter(content -> content.getLanguage().equalsIgnoreCase(language))
                .toList();
    }
	
}
