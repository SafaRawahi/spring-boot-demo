package com.example.demo.Schoolproject.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
@Table(name = "Teacher_Detail_Table")
public class TeacherDetails {


    @Id
    Integer id;

    @Column(name = "teacher_phone_number")
    String phoneNumber;

    @Column(name = "teacher_address")
    String address;

    @OneToOne
    Teacher teacher;


}
