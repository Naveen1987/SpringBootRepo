package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SurveyController {
    @Autowired
    private SurveyService surveyService;

    @GetMapping("/surveys/{surveyId}/questions")
    public List<Question> retrieveQuestions(@PathVariable String surveyId) {
    	System.out.println(surveyId);
        return surveyService.retrieveQuestions(surveyId);
    }
    @PostMapping()
    public Question addQuestion(@PathVariable String surveyId,@RequestBody Question Q) {
    	System.out.println(surveyId);
    	System.out.println(Q);
        return surveyService.addQuestion(surveyId,Q);
    }
}