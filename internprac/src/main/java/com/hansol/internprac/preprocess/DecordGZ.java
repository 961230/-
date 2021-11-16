package com.hansol.internprac.preprocess;
import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.*;

public class DecordGZ {

    public void decompress(){
        Path source = Paths.get("C:\\test1.gz");
        Path target = Paths.get("C:\\test.xml");

        if (Files.notExists(source)) {
            System.err.printf("The path %s doesn't exist!", source);
            return;
        }

        try {
            DecordGZ.decompressGzip(source, target);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void decompressGzip(Path source, Path target) throws IOException {

        try (GZIPInputStream gis = new GZIPInputStream(
                new FileInputStream(source.toFile()));
             FileOutputStream fos = new FileOutputStream(target.toFile())) {

            // copy GZIPInputStream to FileOutputStream
            byte[] buffer = new byte[1024];
            int len;
            while ((len = gis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }

        }

    }
}
