package com.alibou.batch.config;

import com.alibou.batch.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {
        // All the business logic goes here
        student.setId(null);
        return student;
    }
}
