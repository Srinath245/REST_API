package com.Back_end.REST_API.TABLE_ENTITY;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT_DETAILS")
public class STUDENT_DETAILS {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int ROLL_NO;
    private String STUDENT_NAME;


    public String getSTUDENT_NAME() {
        return STUDENT_NAME;
    }

    public void setSTUDENT_NAME(String STUDENT_NAME) {
        this.STUDENT_NAME = STUDENT_NAME;
    }

    public int getROLL_NO() {
        return ROLL_NO;
    }

    public void setROLL_NO(int ROLL_NO) {
        this.ROLL_NO = ROLL_NO;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private STUDENT_DETAILS studentDetails;

    public STUDENT_DETAILS getStudentDetails() {
        return studentDetails;
    }

    public void setStudentDetails(STUDENT_DETAILS studentDetails) {
        this.studentDetails = studentDetails;
    }
}
