/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.project.services;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 *
 * @author sgandham
 */
@Service
public class BindingResultValidationError {

    public Map<String, String> mapResults(BindingResult result) {
        Map<String, String> map = new HashMap<>();
        for (FieldError tmpFieldError : result.getFieldErrors()) {
            map.put(tmpFieldError.getField(), tmpFieldError.getDefaultMessage());
        }
        return map;
    }
}
