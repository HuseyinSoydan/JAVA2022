package week3.homework3.dataAccess;

import week3.homework3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor is added by using Hibernate : "+ instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Instructor is update by using Hibernate :  "+ instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Instructor is delete by using Hibernate : "+ instructor.getFirstName() + " " + instructor.getLastName());
    }
}