package services;

import models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagerImpl implements StudentManager {
    private List<Student> studentList = new ArrayList<>();
    public StudentManagerImpl(){
        this.init();
    }
    @Override
    public void init() {
        studentList.add(new Student("3007","Vũ Hoàng Sơn",19,"08 Trần Quang Khải","Male","17T3"));
        studentList.add(new Student("1234","Đàm Thị Dung",19,"09 Trần Quang Khải","Female","17T3"));
        studentList.add(new Student("5678","Tăng Văn Lộc",19,"10 Trần Quang Khải","Male","17T3"));
        studentList.add(new Student("9101","Phạm Văn Hoàng",19,"11 Trần Quang Khải","Male","17T3"));
        studentList.add(new Student("8080","Mai Tấn Sang",19,"12 Trần Quang Khải","Male","17T3"));
    }

    @Override
    public Student findById(String id) {
        for (Student x :
                studentList) {
            if (x.getId().equals(id)){
                return x;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> findByName(String name) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (Student x :
                studentList) {
            if (x.getName().equals(name)){
                studentArrayList.add(x);
            }
        }
        return studentArrayList;
    }

    @Override
    public List<Student> getListStudent() {
        return studentList;
    }

    @Override
    public Student editInformation(Student student) {
        Student oldStudent = this.findById(student.getId());
        oldStudent.setName(student.getName());
        oldStudent.setAge(student.getAge());
        oldStudent.setSex(student.getSex());
        oldStudent.setAddress(student.getAddress());
        oldStudent.setStudentClass(student.getStudentClass());
        return oldStudent;
    }
}
