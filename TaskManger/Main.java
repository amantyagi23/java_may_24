package TaskManger;

import java.util.Date;

class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Task task1 = new Task("Task1", "Complete HomeWork", date, "Aman Tyagi");

        task1.printTask();

        task1.printTask();
    }
}
