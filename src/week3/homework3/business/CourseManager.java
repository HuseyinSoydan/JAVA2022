package week3.homework3.business;

import week3.homework3.dataAccess.CourseDao;
import week3.homework3.entities.Category;
import week3.homework3.entities.Course;
import week3.homework3.logger.Logger;

import java.util.List;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void courseName(Course course) throws Exception {
        if (course.getPrice() < 10) {
            throw new Exception("The price of a course cannot be less than 10");
        }
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getName());

        }
    }

    public void add(Course course) {
        this.courseDao.add(course);

        for (Logger logger : loggers) {

            logger.log(course.getName());
        }
    }

    public void update(Course course) {
        this.courseDao.update(course);
    }

    public void delete(Course course) {
        this.courseDao.delete(course);
    }
}