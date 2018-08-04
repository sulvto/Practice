package me.qinchao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import me.qinchao.course.service.ICourseService;
import me.qinchao.course.service.dto.CourseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by sulvto on 18-8-4.
 */
@Controller
public class CourseController {

    @Reference
    private ICourseService courseService;

    @RequestMapping(value = "/course",method=RequestMethod.GET)
    public List<CourseDTO> courseList() {
        return courseService.courseList();
    }
}
