package com.xworkz.project.dao;

import com.xworkz.project.dto.ProjectTenDto;

public class ProjectTenDao {
    ProjectTenDto dto;

    public boolean addAttraction(ProjectTenDto dto) {
        boolean isDtoCreated = false;
        if (dto != null) {
            this.dto = dto;
            isDtoCreated = true;
        }
        return isDtoCreated;
    }

    public void getAttractionDetails() {
        if (dto != null) {
            System.out.println("Attraction details:");
            System.out.println("Attraction ID: " + dto.attractionId);
            System.out.println("Attraction Name: " + dto.attractionName);
            System.out.println("Attraction Type: " + dto.attractionType);
            System.out.println("Ticket Price: $" + dto.ticketPrice);
            System.out.println("Is Open: " + (dto.isOpen ? "Yes" : "No"));
        } else {
            System.out.println("No attraction details found.");
        }
    }
}
