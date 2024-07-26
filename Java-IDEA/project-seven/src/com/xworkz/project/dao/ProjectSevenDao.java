package com.xworkz.project.dao;

import com.xworkz.project.dta.ProjectSevenDto;

public class ProjectSevenDao {
    ProjectSevenDto dto;

    public boolean createPassport(ProjectSevenDto dto) {
        boolean isDtoCreated = false;
        if(dto!=null){
            this.dto=dto;
            isDtoCreated = true;
        }
    return isDtoCreated;
    }
        public void getDetails(){
            System.out.println("Passport details:");
            System.out.println("CPV Location: " + dto.cpvLocation);
            System.out.println("DCDR Location: " + dto.dcdrLocation);
            System.out.println("Given Name: " + dto.givenName);
            System.out.println("Surname: " +dto.surName);
            System.out.println("Date of Birth: " + dto.dob);
            System.out.println("Email: " + dto.email);
            System.out.println("Is Email Same as Login: " + dto.isemailoginSame);
            System.out.println("Login ID: " + dto.loginId);
            System.out.println("Hint Question: " + dto.hintQue);
            System.out.println("Hint Answer: " + dto.hintAns);
            System.out.println("Captcha: " + dto.captcha);
        }

}
