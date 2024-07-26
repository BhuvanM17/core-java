package com.xworkz.project.dao;

import com.xworkz.project.dto.ProjectNineDto;

public class ProjectNineDao {
    ProjectNineDto dto;


    public boolean createTask(ProjectNineDto dto) {
        boolean isDtoCreated = false;
        if (dto != null) {
            this.dto = dto;
            isDtoCreated = true;
        }
        return isDtoCreated;
    }

    // Method to get task details
    public void getTaskDetails() {
        if (dto != null) {
            System.out.println("Task details:");
            System.out.println("Task ID: " + dto.taskId);
            System.out.println("Task Name: " + dto.taskName);
            System.out.println("Task Description: " + dto.taskDescription);
            System.out.println("Assignee: " + dto.assigneeName);
            System.out.println("Is Completed: " + (dto.isCompleted ? "Yes" : "No"));
        } else {
            System.out.println("No task details found.");
        }
    }
}
