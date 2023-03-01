package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }

    public void addTeahcer(Teacher teacher){
        studentRepository.addTeacher(teacher);
    }

    public void studentTeacherPair(String studentName,String teacherName){
        studentRepository.addStudentTeacherPair(studentName,teacherName);
    }

    public Student studentByStudentName(String Sname){
        return studentRepository.studentByStudentName(Sname);
    }

    public Teacher teacherByTeacherName(String Tname){
        return studentRepository.teacherByTeacherName(Tname);
    }

    public List<String> studentsByTeacherName(String name){
        return studentRepository.studentsByTeacherName(name);
    }

    public List<String> findAllStudents(){
        return studentRepository.findAllStudents();
    }

    public void deleteTeacherByName(String name){
        studentRepository.deleteTeacherByName(name);
    }

    public void deleteAllTeachers(){
        studentRepository.deleteAllTeachers();
    }
}
