package com.mycs.demo.java_cs.file_reader;

import java.io.IOException;

public interface Parser<T> {
    T read(String path) throws IOException;
}
