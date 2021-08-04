/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootcourse.course.servicies.exceptions;

/**
 *
 * @author evand
 */
public class ResourceNotFoundException extends RuntimeException {

    public static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Resourse not found. Id " + id);
    }

}
