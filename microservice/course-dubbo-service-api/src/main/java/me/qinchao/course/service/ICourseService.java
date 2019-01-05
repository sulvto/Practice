package me.qinchao.course.service;

import me.qinchao.course.service.dto.CourseDTO;

import java.util.List;

/**
 * Created by sulvto on 18-8-3.
 */
public interface ICourseService {
    List<CourseDTO> courseList();
}
