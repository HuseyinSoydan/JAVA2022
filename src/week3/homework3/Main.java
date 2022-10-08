package week3.homework3;

import week3.homework3.business.CategoryManager;
import week3.homework3.business.CourseManager;
import week3.homework3.business.InstructorManager;
import week3.homework3.dataAccess.*;
import week3.homework3.entities.Category;
import week3.homework3.entities.Course;
import week3.homework3.entities.Instructor;
import week3.homework3.logger.DatabaseLogger;
import week3.homework3.logger.EmailLogger;
import week3.homework3.logger.FileLogger;
import week3.homework3.logger.Logger;

public class Main {
    public static void main(String[] args) throws Exception {


        Logger[] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger()};


        Instructor instructor = new Instructor(1, "Huseyin", "Soydan");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor);

        System.out.println("---------------------");

        Category category = new Category("Java Back-end Development");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryManager.add(category);


        System.out.println("---------------------");


        Category category1 = new Category("Css Development");
        CategoryManager categoryManager1 = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryManager.add(category1);


        System.out.println("---------------------");


        Category category2 = new Category("Frontend Development");
        CategoryManager categoryManager2 = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category2);

        System.out.println("---------------------");


        Course course = new Course(1, "Java Kamp", 20);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.courseName(course);
    }
}