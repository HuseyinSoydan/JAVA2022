package week3.homework3.dataAccess;

import week3.homework3.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Course is added by using Hibernate : "+ course.getName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Course is update by using Hibernate : "+ course.getName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Course is added by using Hibernate : "+ course.getName());
    }
}