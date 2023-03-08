package com.yevdokymov.parseJson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Resources;
import com.yevdokymov.data.PepData;
import com.yevdokymov.unzip.PepUnZip;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyJsonParser {
    public static ImmutableList<PepData> readAllPep(String newTempFileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        // при использование только что созданного файла в рантайме, выдает ошибку об отсутствии ресурсов, никак не получилось пофиксить,
        // если будет возможность, хотелось бы узнать как это делать
        //InputStream inputStream = Resources.getResource(newTempFileName).openStream();
        InputStream inputStream = Resources.getResource("имя созданного файла").openStream();

        List<PepData> pep = objectMapper.readValue(inputStream, new TypeReference<>() {
        });
        return ImmutableList.copyOf(pep);

    }
    public static String createTempFile (PepUnZip pepUnZip, MultipartFile file) throws IOException {
        File newTempFile = File.createTempFile("pep", ".json", new File("src/main/resources"));
        pepUnZip.unZipFile(file,newTempFile);
        return newTempFile.getName();
    }
}
