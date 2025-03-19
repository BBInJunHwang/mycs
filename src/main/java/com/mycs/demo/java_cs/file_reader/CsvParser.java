package com.mycs.demo.java_cs.file_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CsvParser implements Parser<List<String[]>>{

    public List<String[]> read(String filename) throws IOException {
        InputStreamReader in = new InputStreamReader(Objects.requireNonNull(
                this.getClass().getClassLoader().getResourceAsStream(filename)), StandardCharsets.UTF_8);

        BufferedReader br = new BufferedReader(in);
        List<String[]> list = new ArrayList<>();

        String str = null;
        while ((str = br.readLine()) != null) {
            String[] arr = str.split(",");
            list.add(arr);
        }
        return list;
    }
}

