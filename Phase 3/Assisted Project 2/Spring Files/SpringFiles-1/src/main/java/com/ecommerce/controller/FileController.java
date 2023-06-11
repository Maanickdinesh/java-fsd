package com.ecommerce.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
    private final String uploadDir = "D:\\Uploads"; // Specify the directory where the files will be uploaded

    @GetMapping("/")
    public String index(Model model) {
        List<String> uploadedFiles = getUploadedFiles();
        model.addAttribute("uploadedFiles", uploadedFiles);
        return "index";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file, Model model) throws IOException {
        if (!file.isEmpty()) {
            String filename = file.getOriginalFilename();
            File destFile = new File(uploadDir, filename);
            Path destPath = destFile.toPath();
            Files.copy(file.getInputStream(), destPath, StandardCopyOption.REPLACE_EXISTING);
            model.addAttribute("message", "File uploaded successfully");
        } else {
            model.addAttribute("message", "No file selected");
        }
        
        List<String> uploadedFiles = getUploadedFiles();
        model.addAttribute("uploadedFiles", uploadedFiles);
        
        return "index";
    }

    @GetMapping("/download/{filename:.+}")
    public ResponseEntity<FileSystemResource> downloadFile(@PathVariable String filename) {
        File file = new File(uploadDir, filename);
        if (file.exists()) {
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename);
            headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE);
            FileSystemResource resource = new FileSystemResource(file);
            return new ResponseEntity<>(resource, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    private List<String> getUploadedFiles() {
        File uploadDirectory = new File(uploadDir);
        File[] files = uploadDirectory.listFiles();
        List<String> uploadedFiles = new ArrayList<>();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    uploadedFiles.add(file.getName());
                }
            }
        }
        
        return uploadedFiles;
    }
}

