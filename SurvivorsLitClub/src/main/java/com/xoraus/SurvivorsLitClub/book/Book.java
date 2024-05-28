package com.xoraus.SurvivorsLitClub.book;

import com.xoraus.SurvivorsLitClub.common.BaseEntity;
import com.xoraus.SurvivorsLitClub.feedback.Feedback;
import com.xoraus.SurvivorsLitClub.history.BookTransactionHistory;
import com.xoraus.SurvivorsLitClub.user.User;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book extends BaseEntity {
    @Id
    @GeneratedValue
    private Integer id;

    private String title;
    private String authorName;
    private String isbn;
    private String synopsis;
    private String bookCover;
    private boolean archived;
    private boolean shareable;


    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "book")
    private List<Feedback> feedbacks;

    @OneToMany(mappedBy = "book")
    private List<BookTransactionHistory> histories;
}
