//package com.example.demo.service;
//
//import com.example.demo.entity.CaseEntity;
//import com.example.demo.repository.CaseRepository;
//import com.example.demo.vo.CaseVo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.util.Date;
//
//@Service
//public class CaseServiceImpl implements CaseService {
//
//    @Autowired
//    CaseVo caseVo;
//
//    @Override
//    public String createCase(CaseVo caseVo) {
//        try {
//            CaseEntity caseEntity = new CaseEntity();
//            caseEntity.setCompanyName(caseVo.getCompanyName());
//            caseEntity.setAccountNumber(caseVo.getAccountNumber());
//            caseEntity.setRelatedParty(caseVo.getRelatedParty());
//            caseEntity.setMetadata(caseVo.getMetadata());
//            caseEntity.setCompanyAddress(caseVo.getCompanyAddress());
//            caseEntity.setBankStatement(caseVo.getBankStatementFile().getBytes());
//            caseEntity.setCreatedAt(new Date());
//            caseEntity.setUpdatedAt(new Date());
//
//            caseVo.save(caseEntity);
//
//            return "Case created successfully";
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "Error creating case: " + e.getMessage();
//        }
//    }
//}

package com.example.demo.service;

import com.example.demo.dal.entity.CaseEntity;
import com.example.demo.dal.repository.CaseRepository;
import com.example.demo.vo.CaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class CaseServiceImpl implements CaseService {

    private CaseEntity caseEntity;

    @Autowired
    private CaseRepository caseRepository;


    @Override
    public String createCase(CaseVo caseVo) {
        caseEntity.setCompanyName(caseVo.getCompanyName());
        caseEntity.setAccountNumber(caseVo.getAccountNumber());
        caseEntity.setRelatedParty(caseVo.getRelatedParty());
        caseEntity.setBankStatement(caseVo.getBankStatementFile());
        caseEntity.setMetadata(caseVo.getMetadata());
        caseEntity.setCompanyAddress(caseVo.getCompanyAddress());

        caseRepository.save(caseEntity);
        return "saved successfullty ";
    }
}


