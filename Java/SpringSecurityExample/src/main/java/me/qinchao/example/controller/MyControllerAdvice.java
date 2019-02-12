package me.qinchao.example.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by sulvto on 1/31/19.
 */
@ControllerAdvice
public class MyControllerAdvice {

    @ModelAttribute("currentUser")
    public String getCurrentUser(Authentication authentication) {
        return authentication == null ? null : authentication.getName();
    }
}
