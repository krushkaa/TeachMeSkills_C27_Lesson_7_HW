package com.teachmeskills.lesson7.task1.runner;

import com.teachmeskills.lesson7.task1.staff.*;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        Accountant acc1 = new Accountant();
        Worker wrk1 = new Worker();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter staff ID: ");

        if (scan.hasNextInt()) {
            int roleId = scan.nextInt();
            if (roleId == boss1.roleId) {
                boss1.showRole();
            } else if (roleId == acc1.roleId) {
                acc1.showRole();
            } else if (roleId == wrk1.roleId) {
                wrk1.showRole();
            } else
                System.out.println("This staff doesn't exist. Please try again.");
        }
    }
}
