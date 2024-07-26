package com.xworkz.project;

import com.xworkz.project.dao.ProjectTenDao;
import com.xworkz.project.dto.ProjectTenDto;

public class ProjectTenRunner {

    public static void main(String[] args) {
        ProjectTenDto bhu = new ProjectTenDto();

        bhu.attractionId="A001";
        bhu.attractionName="Roller Coaster";
        bhu.attractionType="Thrill Ride";
        bhu.ticketPrice=6;
        bhu.isOpen=true;


        ProjectTenDao dao = new ProjectTenDao();
        dao.addAttraction(bhu);
        dao.getAttractionDetails();
    }

}
