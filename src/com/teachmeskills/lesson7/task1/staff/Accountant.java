package com.teachmeskills.lesson7.task1.staff;

import com.teachmeskills.lesson7.task1.info.IRole;

public class Accountant implements IRole {

    public String role = "Accountant";
    public int roleId = 2;

    public void showRole(){
        System.out.println("Staff's role is " + "'" + role + "'.");
    }
}
