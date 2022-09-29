package com.makersacademy.acebook.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.makersacademy.acebook.model.Images;
import com.makersacademy.acebook.repository.ImagesRepository;
import com.makersacademy.acebook.repository.UserRepository;

@Controller
public class ImagesController {
    @Autowired
    ImagesRepository imagesRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/posts/image")
    public String index(Model model, HttpSession session) {
        Iterable<Images> images = imagesRepository.findAll();
        model.addAttribute("images", images);
        model.addAttribute("image", new Images());

        return "posts/image";
    }

    /*
    @PostMapping("/uploadFiles")
    public String uploadFiles(@RequestParam("files") MultipartFile[] files) {
        for (MultipartFile file:files) {
            imageStorageService.saveFile(file);
        }
        return "redirect:/";
    }

    @GetMapping("/downloadFile/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Integer fileId){
		Images image = imageStorageService.getFile(fileId).get();
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(image.getDocType()))
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+image.getDocName()+"\"")
				.body(new ByteArrayResource(image.getData()));
	}
    */
}
