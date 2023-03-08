package com.App1.App1.controll;

import com.App1.App1.model.dto.QuizDTO;
import com.App1.App1.model.dto.mapper.QuizMapper;
import com.App1.App1.model.entity.Quiz;
import com.App1.App1.model.response.ResponseObject;
import com.App1.App1.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/link") //http://localhost:8088/link
public class LinkController {
    @Autowired
    LinkService linkService;
    @PostMapping("/score")
    public @ResponseBody ResponseEntity<ResponseObject> addScore(@RequestBody QuizDTO quizDTO) {
        QuizMapper quizMapper = new QuizMapper();
        Quiz quiz = quizMapper.toquiz(quizDTO);
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("OK", "Add score successfully",
                        linkService.addScore(quiz, quizDTO.getFresherId(), quizDTO.getSubjectId()))
        );
    }

    @PostMapping("/fc/{centerId}")
    public @ResponseBody ResponseEntity<ResponseObject> adFresherToCenter(@RequestParam String fresherId,
                                                                          @PathVariable String centerId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("OK", "Add fresher to center successfully",
                        linkService.addFresherToCenter(fresherId,centerId))
        );
    }
}
