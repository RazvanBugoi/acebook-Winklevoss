package com.makersacademy.acebook.model;

import java.util.Date;  
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="images")
public class Images {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String imageName;
    private Timestamp time_posted;

    @Lob
    private byte[] data;
    
    public Images() {}

    public Images(String imageName, String imageType, byte[] data) {
        this.imageName = imageName;
    }

    public Long getId() {return id;}

    public String getTitle() {return this.imageName;}

    public Date getTimePosted() { return time_posted;}

    public void setTitle(String imageName) {this.imageName = imageName;}

    public void setTimePosted(Timestamp time_posted) {this.time_posted = time_posted;}
}
