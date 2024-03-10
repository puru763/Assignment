package com.example.demo.controller;

import com.example.demo.service.CaseService;

import com.example.demo.vo.CaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class CaseControllerImpl implements CaseController {


    @Autowired
    private CaseService caseService;


    public ResponseEntity<String> createCase(

            @RequestParam String companyName,
            @RequestParam String accountNumber,
            @RequestParam String relatedParty,
            @RequestParam("bankStatementFile") MultipartFile bankStatementFile,
            @RequestParam String metadata,
            @RequestParam String companyAddress
    ) throws IOException{


        try {

            CaseVo casevo= new CaseVo(companyName,accountNumber, relatedParty,bankStatementFile.getBytes(),metadata,companyAddress);
//            return caseService.createCase(casevo);
            return ResponseEntity.ok(caseService.createCase(casevo));


        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save case.");
        }




    };
}
