package org.college.practice2.task4.task4_1;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentPortfolio extends Observable{
    private String _name;
    private boolean isHaveProject;
    private ArrayList<Project> _projects = new ArrayList<>();
    private HashMap<Project, Integer> _projectGrades = new HashMap<>();

    public StudentPortfolio(String name, boolean isHaveProject) {
        this._name = name;
        this.isHaveProject = isHaveProject;
    }

    public void addProject(Project project) {
        _projects.add(project);
        isHaveProject = true;
    }

    public String getName() {
        return _name;
    }

    public void setProjectGrade(Project project, int grade) {
        _projectGrades.put(project, grade);
        informAll(this, project, grade);
    }

    public void portfolioInfo() {
        System.out.println("Student: " + _name);
        System.out.println("Projects:");
        for (Project project : _projects) {
            System.out.println(project.toString() + " (Grade: " + _projectGrades.getOrDefault(project, 0) + ")");
        }
    }

    public boolean getIsHaveProject() {
        return isHaveProject;
    }
}