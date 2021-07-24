/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootcourse.course.repositories;

import com.springbootcourse.course.entities.Category;
import com.springbootcourse.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author evandio.pereira
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
