package com.xoraus.SurvivorsLitClub.history;

import com.xoraus.SurvivorsLitClub.book.Book;
import com.xoraus.SurvivorsLitClub.common.BaseEntity;
import com.xoraus.SurvivorsLitClub.user.User;
import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookTransactionHistory extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "book_id")

    private boolean returned;
    private boolean returnApproved;
}