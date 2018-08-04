package me.qinchao.course.service;

import me.qinchao.course.mapper.CourseMapper;
import me.qinchao.course.service.dto.CourseDTO;
import me.qinchao.thrift.user.UserInfo;
import me.qinchao.thrift.user.dto.TeacherDTO;
import org.apache.thrift.TException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sulvto on 18-8-3.
 */
@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private ServiceProvider serviceProvider;

    public List<CourseDTO> courseList() {
        List<CourseDTO> courseList = courseMapper.courseList();
        if (courseList != null) {
            courseList.stream().forEach(course->{
                Integer teacherId = courseMapper.getCourseTeacher(course.getId());
                if (teacherId != null) {
                    try {
                        UserInfo teacher =  serviceProvider.getUserService().getTeacherById(teacherId);
                        course.setTeacher(trans2teacher(teacher));
                    } catch (TException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        return courseList;
    }

    private TeacherDTO trans2teacher(UserInfo userInfo) {
        TeacherDTO teacherDTO = new TeacherDTO();
        BeanUtils.copyProperties(userInfo, teacherDTO);
        return teacherDTO;
    }
}
