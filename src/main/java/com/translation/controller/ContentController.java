package com.translation.controller;

import com.translation.model.Content;
import com.translation.service.ContentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentService contentService;

    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }
    
    @GetMapping
    public List<Content> getAllContent() {
        return contentService.getAllContent();
    }


    @GetMapping("/language/{language}")
    public List<Content> getContentByLanguage(@PathVariable String language) {
        return contentService.getContentByLanguage(language);
    }
}
