package com.makersacademy.acebook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

import com.makersacademy.acebook.model.Images;
import com.makersacademy.acebook.repository.ImagesRepository;

@Service
public class ImageStorageService {
    @Autowired
    private ImagesRepository imagesRepository;

    public Images saveFile(MultipartFile file) {
        String imagename = file.getOriginalFilename();
        try {
            Images image = new Images(imagename, file.getContentType(), file.getBytes());
            return imagesRepository.save(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Optional<Images> getFile(Integer fileId) {
        return imagesRepository.findById(fileId);
    }
    
    public List<Images> getFiles() {
        return imagesRepository.findAll(); 
    }
}
