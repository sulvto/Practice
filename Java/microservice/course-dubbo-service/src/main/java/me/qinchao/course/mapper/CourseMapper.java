package me.qinchao.course.mapper;

import me.qinchao.course.service.dto.CourseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by sulvto on 18-8-3.
 */
@Mapper
public interface CourseMapper {

    @Select("SELECT * FROM pe_course")
    List<CourseDTO> courseList();

    @Select("SELECT user_id FROM pr_user_course WHERE course_id=#{course}")
    Integer getCourseTeacher(@Param("courseId") int courseId);
}
