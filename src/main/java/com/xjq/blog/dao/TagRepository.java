package com.xjq.blog.dao;

import com.xjq.blog.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
    default Tag findOne(Long id) {
        return (Tag) findById(id).orElse(null);
    }

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
