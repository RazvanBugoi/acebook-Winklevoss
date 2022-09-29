package com.makersacademy.acebook.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.makersacademy.acebook.model.Images;


public interface ImagesRepository extends JpaRepository<Images, Integer>{
    
    
}
