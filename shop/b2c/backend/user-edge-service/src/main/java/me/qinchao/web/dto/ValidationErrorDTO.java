package me.qinchao.web.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sulvto on 9/21/18.
 */
public class ValidationErrorDTO {
    private List<FieldErrorDTO> fieldErrors = new ArrayList<>();

    public ValidationErrorDTO() {

    }


    public void addFieldError(String field, String message) {
        FieldErrorDTO fieldError = new FieldErrorDTO(field, message);
        fieldErrors.add(fieldError);
    }


    public List<FieldErrorDTO> getFieldErrors() {
        return fieldErrors;
    }
}
