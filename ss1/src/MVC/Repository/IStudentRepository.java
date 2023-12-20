package MVC.Repository;

import DeMo.Student;

public interface IStudentRepository {
    Student []findALL();
    Student findByID(int id);
    void add(Student student);
    void delete(int id);
}
