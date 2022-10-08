package week3.homework3.business;

import week3.homework3.dataAccess.CategoryDao;
import week3.homework3.entities.Category;
import week3.homework3.entities.Course;
import week3.homework3.logger.Logger;

import java.util.List;
import java.util.Locale;

public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] loggers;


    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) {
        this.categoryDao.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getName());
        }
    }

    public void update(Category category) {
        this.categoryDao.update(category);
    }

    public void delete(Category category) {
        this.categoryDao.delete(category);
    }
}