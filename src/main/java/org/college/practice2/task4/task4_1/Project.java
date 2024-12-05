package org.college.practice2.task4.task4_1;

public class Project {
    private String _projectName;
    private String _projectType;

    public Project(String projectName, String projectType) {
        this._projectName = projectName;
        this._projectType = projectType;
    }

    public String getProjectName() {
        return _projectName;
    }

    public String getProjectType() {
        return _projectType;
    }


    @Override
    public String toString() {
        return "Project name = '" + _projectName + "', type = '" + _projectType;
    }
}
