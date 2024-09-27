package com.issuetracker.validator;

import java.time.LocalDate;

import com.issuetracker.exception.IssueTrackerException;
import com.issuetracker.model.Issue;
import com.issuetracker.model.IssueStatus;

//Do Not Change Any Signature
public class Validator
{
 public void validate(Issue issue) throws IssueTrackerException
 {
     if(!isValidIssueId(issue.getIssueId())){
         throw new IssueTrackException
	// Your Code Goes Here
 }

 public Boolean isValidIssueId(String issueId)
 {
	// Your Code Goes Here
     if (issueId == null || issueId.isEmpty()) {
         return false;
     }
     String regexp = "^MTI-I-\\d{3}-(LS|MS|HS)$";


	return issueId.matches(regexp) && !issueId.endsWith("000-");

 }

 public Boolean isValidIssueDescription(String issueDescription)
 {
	// Your Code Goes Here
     if (description == null || description.trim().isEmpty()) {
         return false;
     }

     // Check if description contains only alphabets
     if (!description.matches("[a-zA-Z ]+")) {
         return false;
     }

     // Check if description has leading or trailing spaces
     if (description.startsWith(" ") || description.endsWith(" ")) {
         return false;
     }

     // Check if description length is within the specified range
     if (description.length() < 1 || description.length() > 50) {
         return false;
     }

     // If all checks pass, the description is valid
     return true;
 }
	return false;
 }

 public Boolean isValidReportedOn(LocalDate reportedOn)
 {
	// Your Code Goes Her
     // e
     LocalDate present= LocalDate.now();

     if (reportedDate == null) {
         return false;
     }

     // Get the current date
     Date currentDate = new Date();

     // Check if reportedDate is in the future
     if (reportedDate.after(currentDate)) {
         return false;
     }

     // If all checks pass, the reportedDate is valid
     return false;
 }
 }

 public Boolean isValidStatus(IssueStatus status)
 {
     if(status=="OPEN" || status=="IN PROGRESS") {
         return true;
     }

	return false;
 }
}