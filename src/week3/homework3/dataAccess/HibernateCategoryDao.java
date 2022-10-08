package week3.homework3.dataAccess;

import week3.homework3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    
	@Override
    public void add(Category category) {
        System.out.println("Category is added by using Hibernate : " + category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Category is update by using Hibernate : " + category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Category is delete by using Hibernate : " + category.getName());
    }
}