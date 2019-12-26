package com.xjq.blog.dao;

import com.xjq.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Long> {
    Type findByName(String name);
    default Type findOne(Long id) {
        return (Type) findById(id).orElse(null);
    }
}
