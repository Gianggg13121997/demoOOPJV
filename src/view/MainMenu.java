package view;

import input.Input;

public class MainMenu {
    public void showMainMenu() {
        ClazzMenu clazzMenu = new ClazzMenu();
        StudentMenu studentMenu = new StudentMenu();
        int choice;
        do {
            System.out.println("==========Menu==========");
            System.out.println("1.Quan li lop hoc :");
            System.out.println("2.Quan li hoc sinh :");
            System.out.println("0. Exit :");
            System.out.println("Nhap lua chon :");
            choice = Input.inputNumber();
            switch (choice) {
                case 1:
                    clazzMenu.ClazzMenu();
                    break;
                case 2:
                    studentMenu.StudentMenu();
                    break;
            }
        } while (choice != 0);
    }
}
