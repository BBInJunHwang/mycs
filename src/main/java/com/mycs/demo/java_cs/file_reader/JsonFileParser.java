package com.mycs.demo.java_cs.file_reader;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class JsonFileParser implements Parser<JsonArray> {

    @Override
    public JsonArray read(String path) throws IOException {
        // 자원 파일을 ClassLoader를 통해 읽기
        try (InputStreamReader reader = new InputStreamReader(
                Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(path)), StandardCharsets.UTF_8)) {
            return JsonParser.parseReader(reader).getAsJsonArray();
        }
    }
}

