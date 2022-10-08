package week3.homework3.dataAccess;

import week3.homework3.entities.Instructor;

public interface InstructorDao {

    void add(Instructor instructor);

    void update(Instructor instructor);

    void delete(Instructor instructor);
}