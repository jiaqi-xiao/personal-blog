package com.xjq.blog.dao;

import com.xjq.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type, Long> {
    Type findByName(String name);
    default Type findOne(Long id) {
        return (Type) findById(id).orElse(null);
    }

    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
