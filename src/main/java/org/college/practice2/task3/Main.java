package org.college.practice2.task3;

public class Main {
    public static void main(String[] args){
        WindowController controller = new WindowController();
        AbstractCommand copyCommand = new CopyCommand();
        AbstractCommand cutCommand = new CutCommand();
        AbstractCommand insertCommand = new InsertCommand();
        controller.addCommand(copyCommand);
        controller.removeCommand(cutCommand);
        controller.undoCommand(insertCommand);
        controller.undoChanges(2);
    }
}
