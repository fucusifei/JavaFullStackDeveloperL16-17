package com.yevdokymov.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@Jacksonized
public class PepInfoDto {
    private String id;

    private String full_name;

    private boolean is_pep;

    private boolean died;

    @Override
    public String toString() {
        return "PepInfoDto{" +
                "id='" + id + '\'' +
                ", full_name='" + full_name + '\'' +
                ", is_pep=" + is_pep +
                ", died=" + died +
                '}';
    }
}
