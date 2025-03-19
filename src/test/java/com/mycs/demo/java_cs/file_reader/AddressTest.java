package com.mycs.demo.java_cs.file_reader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void init() throws IOException {
        Address address = new Address();
        address.init("test.csv", new CsvParser());

        Assertions.assertEquals(4, address.getInMemoryList().size());
        Assertions.assertEquals("010-1234-1234", address.getInMemoryList().get(0).getPhone());
        Assertions.assertEquals("010-5678-1234", address.getInMemoryList().get(1).getPhone());
        Assertions.assertEquals("010-5678-5678", address.getInMemoryList().get(2).getPhone());
        Assertions.assertEquals("010-1234-5678", address.getInMemoryList().get(3).getPhone());
    }

    @Test
    void initJson() throws IOException {
        Address address = new Address();
        address.initJson("test.json", new JsonFileParser());

        Assertions.assertEquals(4, address.getInMemoryList().size());
        Assertions.assertEquals("010-1234-1234", address.getInMemoryList().get(0).getPhone());
        Assertions.assertEquals("010-5678-1234", address.getInMemoryList().get(1).getPhone());
        Assertions.assertEquals("010-5678-5678", address.getInMemoryList().get(2).getPhone());
        Assertions.assertEquals("010-1234-5678", address.getInMemoryList().get(3).getPhone());
    }
}