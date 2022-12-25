package com.unab.catvirtual.catvirtualg24.entity.dto;

import com.unab.catvirtual.catvirtualg24.entity.Book;
import com.unab.catvirtual.catvirtualg24.entity.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class SurveyDto {
    private String id;
    private Book bookId;
    private User userId;
    private String vote;
    private String resume;
}
