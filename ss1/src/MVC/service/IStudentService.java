package MVC.service;

import DeMo.Student;

public interface IStudentService {
    Student [] findALL();
    Student findByID(int id);
    void add(Student student);
    void delete(int id);
}
