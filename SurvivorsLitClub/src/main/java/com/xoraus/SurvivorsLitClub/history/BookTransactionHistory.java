package com.xoraus.SurvivorsLitClub.history;

import com.xoraus.SurvivorsLitClub.book.Book;
import com.xoraus.SurvivorsLitClub.common.BaseEntity;
import jakarta.persistence.Entity;

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
    private boolean returned;
    private boolean returnApproved;
}