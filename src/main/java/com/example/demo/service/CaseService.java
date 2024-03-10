package com.example.demo.service;

import com.example.demo.vo.CaseVo;
import org.springframework.web.multipart.MultipartFile;

public interface CaseService {



    String createCase(CaseVo caseVo);
}
