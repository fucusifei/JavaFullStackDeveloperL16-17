package com.yevdokymov.controller;

import com.google.common.collect.ImmutableList;
import com.yevdokymov.data.PepData;
import com.yevdokymov.dto.PepInfoDto;
import com.yevdokymov.dto.PepMostPopularNameDto;
import com.yevdokymov.parseJson.MyJsonParser;
import com.yevdokymov.service.PepService;
import com.yevdokymov.unzip.PepUnZip;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/pep")
@RequiredArgsConstructor
public class PepController {
    private final PepService pepService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        PepUnZip pepUnZip = new PepUnZip();
        String fileName = MyJsonParser.createTempFile(pepUnZip,file);
        return pepService.upload(fileName);
    }
    @GetMapping("/findBy")
    public List<PepInfoDto> findPeps(HttpServletRequest request) {
        return pepService.findPeps(request);
    }

    @GetMapping("/findMostPopularName")
    public List<PepMostPopularNameDto> findPeps() {
        return pepService.findMostPopularName();
    }

}
