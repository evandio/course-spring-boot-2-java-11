/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootcourse.course.repositories;

import com.springbootcourse.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author evand
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
