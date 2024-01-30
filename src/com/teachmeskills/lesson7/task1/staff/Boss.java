package com.teachmeskills.lesson7.task1.staff;

import com.teachmeskills.lesson7.task1.info.IRole;

public class Boss implements IRole {
    public String role = "Boss";
    public int roleId = 1;

    public void showRole(){
        System.out.println("Staff's role is " + "'" + role + "'.");
    }


}
