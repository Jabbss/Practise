package org.college.practice2.task3;

public class CutCommand extends AbstractCommand{
    private String _text;
    private String _startLine;

    public void execute() {
        System.out.println("Cut executed");
    }
    public void undo() {
        System.out.println("Cut undone");
    }
}
