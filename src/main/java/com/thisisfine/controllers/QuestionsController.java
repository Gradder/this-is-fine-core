package com.thisisfine.controllers;

import com.thisisfine.dao.Topic;
import com.thisisfine.services.TopicService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.List;

@Controller("/questions")
public class QuestionsController {

    private final TopicService topicService;

    public QuestionsController(TopicService topicService) {
        this.topicService = topicService;
    }

    @Get("/topics")
    public List<Topic> retrieveQuestionsByLang() {
        return topicService.getAllTopics();
    }
}