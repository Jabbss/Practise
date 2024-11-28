package org.college.practice2.task3;

public class CopyCommand extends AbstractCommand{
    public void execute() {
        System.out.println("Copy executed");
    }
    public void undo() {
        System.out.println("Copy undone");
    }
}
