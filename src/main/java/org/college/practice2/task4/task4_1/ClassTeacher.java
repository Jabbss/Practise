package org.college.practice2.task4.task4_1;

public class ClassTeacher extends Observable implements Observer {
    private String _subject;

    public ClassTeacher(String subject) {
        this._subject = subject;
    }

    @Override
    public void notifyA() {
        System.out.println("Teacher received notification about student grades.");
    }

    public void gradeStudent(StudentPortfolio student, Project project, int grade) {
        student.setProjectGrade(project, grade);
            if (project.getProjectName().equals(_subject)) {
                if (!student.getIsHaveProject()) {
                    grade = 0;
                } else {
                grade = 80;
                }
            }else {
                System.out.println("I mustn`n grade this work");
        }
    }

    @Override
    public void subscribe(Observer obs) {
        super.subscribe(obs);
    }

    @Override
    public void unSubscribe(Observer obs) {
        super.unSubscribe(obs);
    }

}