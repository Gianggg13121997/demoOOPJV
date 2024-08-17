package view;

import input.Input;
import manager.ClazzManage;
import model.Clazz;

import java.util.ArrayList;
import java.util.List;

public class ClazzMenu {
    ClazzManage clazzManage = new ClazzManage();

    public void ClazzMenu() {


        int choice;
        do {
            System.out.println("==========Menu==========");
            System.out.println("1.Them moi :");
            System.out.println("2.Hien thi tat ca :");
            System.out.println("3.Sua thong tin lop hoc :");
            System.out.println("4.Xoa thong tin lop hoc :");
            System.out.println("0.Exit :");
            System.out.println("Nhap lua chon :");
            choice = Input.inputNumber();
            switch (choice) {
                case 1:
                    showAddMenu();
                    break;
                case 2:
                    showall();
                    break;
                case 4 :
                    showMenuRemove();
                    break;
            }
        } while (choice != 0);
    }

    public void showAddMenu() {
        System.out.println("========Menu Add =========");
        System.out.println("Them id :");
        int id = Input.inputNumber();
        System.out.println(" Them ten lop :");
        String name = Input.inputString();
        System.out.println("Them khoi");
        String grade = Input.inputString();
        List<Clazz> clazzList = clazzManage.getAll();
        for(int i = 0; i < clazzList.size(); i++) {
            System.out.println(i+1 + ". " + clazzList.get(i).getName());
        }
        System.out.println("them thanh cong !");
    }

    public void showall() {
        List<Clazz> listClazz = clazzManage.getAll();
        System.out.println("========Menu Clazz=========");
        for (Clazz clazz : listClazz) {
            System.out.println(clazz);
        }


    }
    public void showMenuRemove(){
        System.out.println("========Menu Remove =========");
        System.out.println("Nhap id can xoa :");
        int id = Input.inputNumber();
        clazzManage.delete(id);
        System.out.println("xoa thanh cong !");
    }

}
