package com.mycs.demo.java_cs.file_reader;

import com.google.gson.JsonArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonFileParserTest {

    @Test
    void read() throws IOException {
        JsonFileParser jsonFileParser = new JsonFileParser();
        JsonArray jsonArray = jsonFileParser.read("test.json");

        Assertions.assertNotNull(jsonArray);
    }
}