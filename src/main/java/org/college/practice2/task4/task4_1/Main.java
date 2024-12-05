package org.college.practice2.task4.task4_1;

public class Main {
    public static void main(String[] args){
        ClassTeacher teacher = new ClassTeacher("Math");
        StudentPortfolio student = new StudentPortfolio("Alice", false);
        Project project1 = new Project("Math", "Research");
        teacher.subscribe(teacher);
        student.addProject(project1);
        teacher.gradeStudent(student, project1, 80);
        student.portfolioInfo();

    }
}
