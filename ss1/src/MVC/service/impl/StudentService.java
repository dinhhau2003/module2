package MVC.service.impl;

import DeMo.Student;
import MVC.Repository.IStudentRepository;
import MVC.Repository.impl.StudentRepository;
import MVC.service.IStudentService;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository=new StudentRepository();

    @Override
    public Student[] findALL() {
        return studentRepository.findALL();
    }

    @Override
    public Student findByID(int id) {
        return studentRepository.findByID(id);
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public void delete(int id) {
        studentRepository.delete(id);
    }
}
