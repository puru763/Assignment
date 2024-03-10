package com.example.demo.controller;

import com.example.demo.service.CaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/fiscus")
public class CaseController {

    private static final Logger logger = LoggerFactory.getLogger(CaseController.class);

    @Autowired
    private CaseService caseService;

    @PostMapping("/casedata")
    public ResponseEntity<CaseDto> uploadCaseData(@Valid @RequestBody CaseDto uploadCaseDataRequest) {
        try {
            CaseDto savedCaseData = caseService.uploadCaseData(uploadCaseDataRequest);
            return ResponseEntity.ok(savedCaseData);
        } catch (Exception e) {
            logger.error("Error uploading case data", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
