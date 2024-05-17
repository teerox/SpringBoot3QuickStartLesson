package com.example.mycoolapp.dao;

import com.example.mycoolapp.entity.Student;

import java.util.List;

public interface StudentDAO {

    void saveStudent(Student student);

    public Student findById(int id);

    public void deleteById(int id);

    public void updateStudent(Student student);

    public List<Student> findAll();

    public List<Student> findByLastName(String lastName);

    public int deleteAll();
}
