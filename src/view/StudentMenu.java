package view;

import input.Input;
import manager.StudentManage;
import model.Student;

import java.util.List;

public class StudentMenu {
    StudentManage studentManage = new StudentManage();

    public void StudentMenu() {


        int choice;
        do {
            System.out.println("==========Menu==========");
            System.out.println("1.Them moi hoc sinh :");
            System.out.println("2.Hien thi tat ca :");
            System.out.println("3.Sua thong tin hoc sinh :");
            System.out.println("4.Xoa thong tin hoc sinh:");
            System.out.println("0.Exit :");
            System.out.println("Nhap lua chon :");
            choice = Input.inputNumber();
            switch (choice) {
                case 1:
                    ShowMenuAdd();
                    break;
                case 2:
                    showALl();

                    break;
                case 4:
                    showMenuRemove();
                    break;
            }
        } while (choice != 0);
    }

    public void ShowMenuAdd() {
        System.out.println("==========MenuAdd==========");
        System.out.println("Nhap id :");
        int id = Input.inputNumber();
        System.out.println("Nhap ten :");
        String name = Input.inputString();
        System.out.println("Nhap gioi tinh :");
        String gender = Input.inputString();
        System.out.println("Nhap diem :");
        int score = Input.inputNumber();
        System.out.println("Nhap hanh kiem :");
        String conduct = Input.inputString();
        System.out.println("Nhap khoi :");
        int grade = Input.inputNumber();
        Student student = new Student(id, name, gender, score, conduct, grade);
        studentManage.add(student);
        System.out.println("them thanh cong ");

    }

    public void showMenuRemove() {
        System.out.println("==========MenuRemove==========");
        System.out.println("Nhap id :");
        int id = Input.inputNumber();
        studentManage.delete(id);
        System.out.println("xoa thanh cong !");
    }

    public void showALl(){
        List<Student> all = studentManage.getAll();
        for(int i = 0; i<all.size(); i++){
            System.out.println(all.get(i).toString());
        }
    }
}
