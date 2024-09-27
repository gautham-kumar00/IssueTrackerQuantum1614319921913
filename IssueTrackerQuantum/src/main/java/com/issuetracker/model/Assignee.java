package com.issuetracker.model;

// Do Not Change Any Signature
public class Assignee
{
    private String assigneeId;
    private String assigneeName;
    private String  assigneeEmail;
    private Unit WorkingUnit
    private LocalDate employeeSince;

    public Assignee() {
    }

    public Assignee(String assigneeId, String assigneeName, String assigneeEmail, Unit workingUnit, LocalDate employeeSince, Integer numberOfIssuesActive) {
        this.assigneeId = assigneeId;
        this.assigneeName = assigneeName;
        this.assigneeEmail = assigneeEmail;
        WorkingUnit = workingUnit;
        this.employeeSince = employeeSince;
        this.numberOfIssuesActive = numberOfIssuesActive;
    }

    public Integer getNumberOfIssuesActive() {
        return numberOfIssuesActive;
    }

    public void setNumberOfIssuesActive(Integer numberOfIssuesActive) {
        this.numberOfIssuesActive = numberOfIssuesActive;
    }

    public LocalDate getEmployeeSince() {
        return employeeSince;
    }

    public void setEmployeeSince(LocalDate employeeSince) {
        this.employeeSince = employeeSince;
    }

    public Unit getWorkingUnit() {
        return WorkingUnit;
    }

    public void setWorkingUnit(Unit workingUnit) {
        WorkingUnit = workingUnit;
    }

    public String getAssigneeEmail() {
        return assigneeEmail;
    }

    public void setAssigneeEmail(String assigneeEmail) {
        this.assigneeEmail = assigneeEmail;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    private Integer numberOfIssuesActive;
    // Your Code Goes Here
}