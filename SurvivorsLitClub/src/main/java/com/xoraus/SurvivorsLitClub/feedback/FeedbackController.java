package com.xoraus.SurvivorsLitClub.feedback;


import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feedback")
@RequiredArgsConstructor
@Tag(name = "Feedback", description = "Feedback API")
public class FeedbackController {

    private final FeedbackService feedbackService;

    public ResponseEntity<Integer> saveFeedback( @Valid @RequestBody FeedbackRequest request, Authentication connectedUser) {
        
        return ResponseEntity.ok(feedbackService.saveFeedback(request, connectedUser));
    }
}
