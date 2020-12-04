package com.smilecode.community.mapper;

import com.smilecode.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}