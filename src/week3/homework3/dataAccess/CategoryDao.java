package week3.homework3.dataAccess;

import week3.homework3.entities.Category;
import week3.homework3.entities.Instructor;

public interface CategoryDao {
    void add(Category category);

    void update(Category category);

    void delete(Category category);
}