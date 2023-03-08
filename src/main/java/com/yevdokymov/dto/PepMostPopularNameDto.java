package com.yevdokymov.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
@Builder
public class PepMostPopularNameDto {
    @Id
    private String id;

    private String sum_first_name;


    @Override
    public String toString() {
        return "PepMostPopularNameDto{" +
                "id='" + id + '\'' +
                ", sum_first_name='" + sum_first_name + '\'' +
                '}';
    }
}
