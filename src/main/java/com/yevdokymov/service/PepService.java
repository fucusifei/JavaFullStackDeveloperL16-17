package com.yevdokymov.service;

import com.yevdokymov.data.PepData;
import com.yevdokymov.dto.PepInfoDto;
import com.yevdokymov.dto.PepMostPopularNameDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PepService {
    String upload(String fileName) throws  Exception;

    List<PepInfoDto> findPeps(HttpServletRequest request);

    List<PepMostPopularNameDto> findMostPopularName();
}
