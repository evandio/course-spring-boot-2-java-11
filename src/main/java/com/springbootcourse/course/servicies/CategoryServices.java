/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootcourse.course.servicies;

import com.springbootcourse.course.entities.Category;
import com.springbootcourse.course.repositories.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author evandio.pereira
 */
@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository repository;

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

}
