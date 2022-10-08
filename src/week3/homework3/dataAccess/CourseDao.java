package week3.homework3.dataAccess;

import week3.homework3.entities.Category;
import week3.homework3.entities.Course;

public interface CourseDao {

    void add(Course course);

    void update(Course course);

    void delete(Course course);
}