package com.example.dans.Answer;

import ch.qos.logback.core.model.Model;
import com.example.dans.Question.Question;
import com.example.dans.Question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {
    private final QuestionService questionService;
    private final AnswerService answerService;
    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id")Integer id, @RequestParam String content){
    Question question = this.questionService.getQuestion(id);
    //TODO: 답변을 저장한다.
        this.answerService.create(question,content);
        return String.format("redirect:/question/detail/%s",id);
    }
}
