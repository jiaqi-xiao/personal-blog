package com.xjq.blog.service;

import com.xjq.blog.NotFoundException;
import com.xjq.blog.dao.TagRepository;
import com.xjq.blog.po.Tag;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TagServiceImpl implements TagService{

    @Autowired
    private TagRepository TagRepository;

    @Transactional
    @Override
    public Tag saveTag(Tag tag) {
        return TagRepository.save(tag);
    }

    @Transactional
    @Override
    public Tag getTag(Long id) {
        return TagRepository.findOne(id);
    }

    @Override
    public Tag getTagByName(String name) {
        return TagRepository.findByName(name);
    }

    @Transactional
    @Override
    public Page<Tag> listTag(Pageable pageable) {
        return TagRepository.findAll(pageable);
    }

    @Transactional
    @Override
    public Tag updateTag(Long id, Tag tag) {
        Tag t = TagRepository.findOne(id);
        if (t == null) {
            throw new NotFoundException("This Category is invalid");
        }
        BeanUtils.copyProperties(tag,t);
        return TagRepository.save(t);
    }

    @Transactional
    @Override
    public void deleteTag(Long id) {
        TagRepository.deleteById(id);
    }
}
