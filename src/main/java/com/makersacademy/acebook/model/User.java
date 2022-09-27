package com.makersacademy.acebook.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.GenerationType;

import lombok.Data;

import static java.lang.Boolean.TRUE;

import java.util.Set;

@Data
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String avatar;
    private boolean enabled;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Post> posts;

    public User() {
        this.enabled = TRUE;
        this.avatar = "default-avatar.jpeg";
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.avatar = "default-avatar.jpeg";
        this.enabled = TRUE;
    }

    public User(String username, String password, boolean enabled) {
        this.username = username;
        this.password = password;
        this.avatar = "default-avatar.jpeg";
        this.enabled = enabled;
    }

    public String getUsername() {return this.username;}

    public String getPassword() {return this.password;}

    public String getAvatar() {return this.avatar;}

    public void setUsername(String username) {this.username = username;}

    public void setPassword(String password) {this.password = password;}

    public void setAvatar(String avatar) {this.avatar = avatar;}

    // public void getAllUsernames() {
    // String url =
    // "jdbc:postgresql://localhost:5432/acebook_sprintboot_development";

    // }

    // public String isUnique(String username) {
    // Optional<Credential> credentials =
    // CredentialsRepository.findByUsername(username);

    // return credentials.isPresent() ? "exist" : "doesnt exist";
    // }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}
}
