package com.teachmeskills.lesson7.task1.staff;

import com.teachmeskills.lesson7.task1.info.IRole;

public class Worker implements IRole {
    public String role = "Worker";
    public int roleId = 3;

    public void showRole(){
        System.out.println("Staff's role is " + "'" + role + "'.");    }


}
