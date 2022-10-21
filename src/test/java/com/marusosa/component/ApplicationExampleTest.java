package com.marusosa.component;

import com.marusosa.component.models.CollegeStudent;
import com.marusosa.component.models.StudentGrades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

//@SpringBootTest(classes=MvcTestingExampleApplication.class)
@SpringBootTest
public class ApplicationExampleTest {

    private static int count = 0;

    @Value("${info.app.name}")
    private String appInfo;

    @Value("${info.app.description}")
    private String appDescription;

    @Value("${info.app.version}")
    private String appVersion;

    @Value("${info.school.name}")
    private String schoolName;

    @Autowired
    CollegeStudent student;

    @Autowired
    StudentGrades studentGrades;

    @BeforeEach
    public void beforeEach() {
        count = count + 1;
        System.out.println("Testing: " + appInfo + " which is " + appDescription +
            " Version: " + appVersion + ". Execution of test method " + count);

        student.setFirstname("Maru");
        student.setLastname("Sosa");
        student.setEmailAddress("maru.sosa@school.com");
        studentGrades.setMathGradeResults(new ArrayList<>(Arrays.asList(100.0, 85.5,
            94.0, 91.75)));
        student.setStudentGrades(studentGrades);
    }

    @Test
    void basicTest() {}
}
