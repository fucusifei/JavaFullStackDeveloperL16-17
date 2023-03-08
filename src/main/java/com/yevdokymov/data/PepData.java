package com.yevdokymov.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("pep")
public class PepData {
    @Id
    private String id;
    @JsonProperty("type_of_official")
    private String type_of_official;
    @JsonProperty("first_name")
    private String first_name;
    @JsonProperty("last_name")
    private String last_name;
    @JsonProperty("related_persons")
    private Object[] related_persons;
    @JsonProperty("related_companies")
    private Object[] related_companies;
    @JsonProperty("declarations")
    private Object[] declarations;
    @JsonProperty("related_countries")
    private Object[] related_countries;
    @JsonProperty("is_pep")
    private boolean is_pep;
    @JsonProperty("photo")
    private String photo;
    @JsonProperty("full_name_en")
    private String full_name_en;
    @JsonProperty("first_name_en")
    private String first_name_en;
    @JsonProperty("last_name_en")
    private String last_name_en;
    @JsonProperty("last_job_title")
    private String last_job_title;
    @JsonProperty("last_job_title_en")
    private String last_job_title_en;
    @JsonProperty("last_workplace")
    private String last_workplace;
    @JsonProperty("last_workplace_en")
    private String last_workplace_en;
    @JsonProperty("reason_of_termination_en")
    private String reason_of_termination_en;
    @JsonProperty("reason_of_termination")
    private String reason_of_termination;
    @JsonProperty("termination_date_human")
    private String termination_date_human;
    @JsonProperty("url")
    private String url;
    @JsonProperty("wiki_uk")
    private String wiki_uk;
    @JsonProperty("wiki_en")
    private String wiki_en;
    @JsonProperty("date_of_birth")
    private String date_of_birth;
    @JsonProperty("type_of_official_en")
    private String type_of_official_en;
    @JsonProperty("reputation_convictions_en")
    private String reputation_convictions_en;
    @JsonProperty("reputation_convictions_uk")
    private String reputation_convictions_uk;
    @JsonProperty("reputation_manhunt_uk")
    private String reputation_manhunt_uk;
    @JsonProperty("reputation_manhunt_en")
    private String reputation_manhunt_en;
    @JsonProperty("reputation_sanctions_uk")
    private String reputation_sanctions_uk;
    @JsonProperty("reputation_sanctions_en")
    private String reputation_sanctions_en;
    @JsonProperty("reputation_assets_en")
    private String reputation_assets_en;
    @JsonProperty("reputation_assets_uk")
    private String reputation_assets_uk;
    @JsonProperty("reputation_crimes_en")
    private String reputation_crimes_en;
    @JsonProperty("reputation_crimes_uk")
    private String reputation_crimes_uk;
    @JsonProperty("full_name")
    private String full_name;
    @JsonProperty("patronymic")
    private String patronymic;
    @JsonProperty("patronymic_en")
    private String patronymic_en;
    @JsonProperty("died")
    private boolean died;
    @JsonProperty("also_known_as_en")
    private String also_known_as_en;
    @JsonProperty("also_known_as_uk")
    private String also_known_as_uk;
    @JsonProperty("city_of_birth_uk")
    private String city_of_birth_uk;
    @JsonProperty("city_of_birth_en")
    private String city_of_birth_en;
    @JsonProperty("names")
    private String names;


    @Override
    public String toString() {
        return "PepData{" +
                "id='" + id + '\'' +
                ", type_of_official='" + type_of_official + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", related_persons=" + Arrays.toString(related_persons) +
                ", related_companies=" + Arrays.toString(related_companies) +
                ", declarations=" + Arrays.toString(declarations) +
                ", related_countries=" + Arrays.toString(related_countries) +
                ", is_pep=" + is_pep +
                ", photo='" + photo + '\'' +
                ", full_name_en='" + full_name_en + '\'' +
                ", first_name_en='" + first_name_en + '\'' +
                ", last_name_en='" + last_name_en + '\'' +
                ", last_job_title='" + last_job_title + '\'' +
                ", last_job_title_en='" + last_job_title_en + '\'' +
                ", last_workplace='" + last_workplace + '\'' +
                ", last_workplace_en='" + last_workplace_en + '\'' +
                ", reason_of_termination_en='" + reason_of_termination_en + '\'' +
                ", reason_of_termination='" + reason_of_termination + '\'' +
                ", termination_date_human='" + termination_date_human + '\'' +
                ", url='" + url + '\'' +
                ", wiki_uk='" + wiki_uk + '\'' +
                ", wiki_en='" + wiki_en + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", type_of_official_en='" + type_of_official_en + '\'' +
                ", reputation_convictions_en='" + reputation_convictions_en + '\'' +
                ", reputation_convictions_uk='" + reputation_convictions_uk + '\'' +
                ", reputation_manhunt_uk='" + reputation_manhunt_uk + '\'' +
                ", reputation_manhunt_en='" + reputation_manhunt_en + '\'' +
                ", reputation_sanctions_uk='" + reputation_sanctions_uk + '\'' +
                ", reputation_sanctions_en='" + reputation_sanctions_en + '\'' +
                ", reputation_assets_en='" + reputation_assets_en + '\'' +
                ", reputation_assets_uk='" + reputation_assets_uk + '\'' +
                ", reputation_crimes_en='" + reputation_crimes_en + '\'' +
                ", reputation_crimes_uk='" + reputation_crimes_uk + '\'' +
                ", full_name='" + full_name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", patronymic_en='" + patronymic_en + '\'' +
                ", died=" + died +
                ", also_known_as_en='" + also_known_as_en + '\'' +
                ", also_known_as_uk='" + also_known_as_uk + '\'' +
                ", city_of_birth_uk='" + city_of_birth_uk + '\'' +
                ", city_of_birth_en='" + city_of_birth_en + '\'' +
                ", names='" + names + '\'' +
                '}';
    }
}
