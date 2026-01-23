package com.devansh.Day52.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.*;

@Service
public class FileService {

    private static final String UPLOAD_DIR = "uploads";

    public String uploadFile(MultipartFile file) throws IOException {
        Files.createDirectories(Paths.get(UPLOAD_DIR));

        Path filePath = Paths.get(UPLOAD_DIR, file.getOriginalFilename());
        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

        return "File uploaded: " + file.getOriginalFilename();
    }

    public File getFile(String filename) {
        return Paths.get(UPLOAD_DIR, filename).toFile();
    }
}
