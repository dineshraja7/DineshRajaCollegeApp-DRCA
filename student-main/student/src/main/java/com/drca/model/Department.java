package com.drca.model;
import javax.persistence.*;

@Entity
@Table(name = "department", catalog = "rrd")
public class Department {
    @Id int departmentId;


    String departmentName;
    int departmentStrength;
    String departmentLocation;


  // int facultyId;


   // String firstName;
    //String lastName;
    //String subjectHandling;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentStrength() {
        return departmentStrength;
    }

    public void setDepartmentStrength(int departmentStrength) {
        this.departmentStrength = departmentStrength;
    }



    public String getDepartmentLocation() {
        return departmentLocation;
    }

    public void setDepartmentLocation(String departmentLocation) {
        this.departmentLocation = departmentLocation;
    }


    // public int getFacultyId() {
      // return facultyId;
    //}

    //public void setFacultyId(int facultyId) {
        //this.facultyId = facultyId;
    //}
    //public String getFirstName() {
      //  return firstName;
    //}

    //public void setFirstName(String firstName) {
      //  this.firstName = firstName;
    //}

    //public String getLastName() {
      //  return lastName;
    //}

    //public void setLastName(String lastName) {
      //  this.lastName = lastName;
    //}

    //public String getSubjectHandling() {
      //  return subjectHandling;
    //}

    //public void setSubjectHandling(String subjectHandling) {
      //  this.subjectHandling = subjectHandling;
    //}




}


