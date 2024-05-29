package com.xoraus.SurvivorsLitClub.feedback;

import com.xoraus.SurvivorsLitClub.book.Book;
import org.springframework.stereotype.Service;


@Service
public class FeedbackMapper {
    public Feedback toFeedback(FeedbackRequest request) {
        return Feedback.builder()
                .note(request.note())
                .comment(request.comment())
                .book(Book.builder()
                        .id(request.bookId())
                        .shareable(false)
                        .archived(false)
                        .build()
                )
                .build();
    }
}