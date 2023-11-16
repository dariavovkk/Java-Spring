package com.example.Restauracja.Restauracja;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String department;
    private int year_of_study;
    private int student_id;

    // Konstruktor domyślny (bezargumentowy) - wymagany przez JPA
    public User() {
    }

    // Konstruktor z argumentami
    public User(String firstname, String lastname, String email, String department, int year_of_study, int student_id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.department = department;
        this.year_of_study = year_of_study;
        this.student_id = student_id;
    }

    // Getter i Setter dla id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter i Setter dla dania
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String firstname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfStudy() {
        return year_of_study;
    }

    public void setYearOfStudy(int year_of_study) {
        this.year_of_study = year_of_study;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
}
