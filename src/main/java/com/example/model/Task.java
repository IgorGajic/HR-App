package com.example.model;

public class Task {
    private String taskName;
    private String comment;
    private TaskStatus taskStatus;

    private TeamMember teamMember;

    public Task(String taskName, String comment, TeamMember teamMember) {
        this.taskName = taskName;
        this.comment = comment;
        this.teamMember = teamMember;
        taskStatus = TaskStatus.PENDING;
    }

    public TaskStatus getStatus() {
        return taskStatus;
    }

    public void setStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public Task(String taskName, TeamMember teamMember) {
        this.taskName = taskName;
        this.teamMember = teamMember;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public TeamMember getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(TeamMember teamMember) {
        this.teamMember = teamMember;
    }
}
