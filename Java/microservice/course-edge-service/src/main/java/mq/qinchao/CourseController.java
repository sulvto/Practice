package me.qinchao.controller;

/**
 * Created by sulvto on 18-8-4.
 */
@Controller
public class CourseController {

    @Ref
    private ICourseService courseService;

    @RequestMapping("/course",method=GET)
    public List<CourseDTO> courseList() {
        return courseService.courseList();
    }
}
