package com;

/**
 * Created by Srikant on 25-04-2017.
 */

import org.springframework.batch.item.file.FlatFileHeaderCallback;

import java.io.IOException;
import java.io.Writer;

class StringHeaderWriter implements FlatFileHeaderCallback {

    private final String header;

    StringHeaderWriter(String header) {
        this.header = header;
    }

    @Override
    public void writeHeader(Writer writer) throws IOException {
        writer.write(header);
    }
}
