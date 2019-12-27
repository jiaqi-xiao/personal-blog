package com.xjq.blog.dao;

import com.xjq.blog.po.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {
    default Blog findOne(Long id) {
        return (Blog) findById(id).orElse(null);
    }
}
