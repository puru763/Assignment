package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@RestController
@RequestMapping("fiscus/v1/case")
public interface CaseController {



    @PostMapping("/create-case")
    public ResponseEntity<String> createCase(
            @RequestParam String companyName,
            @RequestParam String accountNumber,
            @RequestParam String relatedParty,
            @RequestParam("bankStatementFile") MultipartFile bankStatementFile,
            @RequestParam String metadata,
            @RequestParam String companyAddress
    ) throws IOException ;
}
