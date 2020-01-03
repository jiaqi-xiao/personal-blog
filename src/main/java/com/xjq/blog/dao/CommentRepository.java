package com.xjq.blog.dao;

import com.xjq.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);

    default Comment findOne(Long id) {
        return (Comment) findById(id).orElse(null);
    }
}
