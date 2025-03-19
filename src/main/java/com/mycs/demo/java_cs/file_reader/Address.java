package com.mycs.demo.java_cs.file_reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class Address {
    private String address;
    private String phone;
    private String email;
    private String name;
    private final List<Address> inMemoryList = new ArrayList<>();

    public Address(String address, String phone, String email, String name) {
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.name = name;
    }

    public void init(String path, Parser<List<String[]>> parser) throws IOException {
        List<String[]> readList = parser.read(path);
        readList.forEach(s -> {
            Address address1 = new Address(
                    s[0].trim(),
                    s[1].trim(),
                    s[2].trim(),
                    s[3].trim()
            );
            inMemoryList.add(address1);
        });
    }

    public void initJson(String path, Parser<JsonArray> parser) throws IOException {
        JsonArray jsonArray = parser.read(path);
        ObjectMapper objectMapper = new ObjectMapper();

        List<Address> addresses = objectMapper.readValue(
                jsonArray.toString(),
                objectMapper.getTypeFactory().constructCollectionType(List.class, Address.class)
        );
        inMemoryList.addAll(addresses);
    }
}
