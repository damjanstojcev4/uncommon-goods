package com.damjan.uncommongoods.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(name = "user_name",unique = true)
    private String userName;
    private String profile_photo;

    public User() {
    }

    public User(String first_name, String lastName, String email, String password, String userName,String profile_photo) {
        this.firstName = first_name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.profile_photo = profile_photo;
    }

    public User(Integer id, String first_name, String lastName, String email, String password, String userName,
                String profile_photo) {
        this.id = id;
        this.firstName = first_name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.profile_photo = profile_photo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfile_photo() {
        return profile_photo;
    }

    public void setProfile_photo(String profile_photo) {
        this.profile_photo = profile_photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) && Objects.equals(password, user.password) &&
                Objects.equals(userName, user.userName) && Objects.equals(profile_photo, user.profile_photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, password, userName, profile_photo);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", user_name='" + userName + '\'' +
                ", profile_photo='" + profile_photo + '\'' +
                '}';
    }
}
