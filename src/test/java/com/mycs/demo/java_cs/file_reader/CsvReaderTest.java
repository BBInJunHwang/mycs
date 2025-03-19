package com.mycs.demo.java_cs.file_reader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class CsvReaderTest {

    @Test
    void read() throws IOException {
        CsvParser csvReader = new CsvParser();
        List<String[]> list = csvReader.read("test.csv");

        Assertions.assertEquals(4,list.size());
    }
}