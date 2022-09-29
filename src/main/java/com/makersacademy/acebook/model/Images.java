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
    private String imageType;
    private Timestamp time_posted;

    @Lob
    private byte[] data;
    
    public Images() {}

    public Images(String imageName, String imageType, byte[] data) {
        super();
        this.imageName = imageName;
        this.imageType = imageType;
        this.data = data;
    }

    public Long getId() {return id;}

    public String getTitle() {return this.imageName;}

    public String getType() {return this.imageType;}

    public byte[] getContent() {return this.data;}

    public Date getTimePosted() { return time_posted;}

    public void setTitle(String imageName) {this.imageName = imageName;}

    public String setType(String imageType) {return this.imageType = imageType;}

    public void setContent(byte[] data) {this.data = data;}

    public void setTimePosted(Timestamp time_posted) {this.time_posted = time_posted;}
}
