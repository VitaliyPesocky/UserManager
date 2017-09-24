package com.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;

    @Basic
    @Column(name = "name")
    @NotNull
    private String name;

    @Basic
    @Column(name = "age")
    private int age;

    @Basic
    @Column(name = "createdDate")
    @GeneratedValue
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Timestamp createdDate;

    @Basic
    @Column(name = "isAdmin")
    private boolean isAdmin;

    public User() {

    }

    public User(String name, boolean isAdmin) {
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public User(String name, int age, boolean isAdmin) {
        this.name = name;
        this.age = age;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate() {
        this.createdDate = new Timestamp(System.currentTimeMillis());
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (age != user.age) return false;
        if (isAdmin != user.isAdmin) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return createdDate != null ? createdDate.equals(user.createdDate) : user.createdDate == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (isAdmin ? 1 : 0);
        return result;
    }
}
