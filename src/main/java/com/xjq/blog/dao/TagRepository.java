package com.xjq.blog.dao;

import com.xjq.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
    default Tag findOne(Long id) {
        return (Tag) findById(id).orElse(null);
    }
}
