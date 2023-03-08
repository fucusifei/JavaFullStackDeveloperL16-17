package com.yevdokymov.service;


import com.yevdokymov.data.PepData;
import com.yevdokymov.dto.PepInfoDto;
import com.yevdokymov.dto.PepMostPopularNameDto;
import com.yevdokymov.parseJson.MyJsonParser;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import org.springframework.data.mongodb.core.aggregation.AggregationResults;

import java.util.List;
import java.util.ArrayList;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;
import static org.springframework.data.mongodb.core.query.Criteria.where;


@Service
@RequiredArgsConstructor
public class PepServiceImpl implements PepService{
    private MongoTemplate mongoTemplate;

    @Autowired
    public PepServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;

    }

    @Override
    public String upload(String newFileName) throws Exception {

        List<PepData> pepData = MyJsonParser.readAllPep(newFileName);
        mongoTemplate.dropCollection("pep");
        mongoTemplate.insertAll(pepData);
        //newTempFile.delete();
        return  "OK";
    }

    @Override
    public List<PepInfoDto> findPeps(HttpServletRequest request) {

        Query mongoQuery = new Query();
        List<String> parameterNames = new ArrayList<String>(request.getParameterMap().keySet());

        for (String parameterName: parameterNames) {
            switch (parameterName) {
                case "first_name" :  mongoQuery.addCriteria(where("first_name").is(request.getParameter(parameterName)));
                    break;
                case "last_name" : mongoQuery.addCriteria(where("last_name").is(request.getParameter(parameterName)));
                    break;
                case "patronymic" : mongoQuery.addCriteria(where("patronymic").is(request.getParameter(parameterName)));
                    break;
            }
        }
        return mongoTemplate.find(mongoQuery, PepInfoDto.class,"pep");
    }

    @Override
    public List<PepMostPopularNameDto> findMostPopularName() {
        Aggregation aggregation = newAggregation(
                match(where("is_pep").is(true)),
                group("first_name").count().as("sum_first_name"),
                sort(Sort.Direction.DESC, "sum_first_name"),
                limit(10)
        );
        System.out.println(aggregation);
        AggregationResults<PepMostPopularNameDto> aggregationResults = mongoTemplate.aggregate(
                aggregation, "pep", PepMostPopularNameDto.class);
        return aggregationResults.getMappedResults();
    }
}
