package com.example.file.zip;

import com.example.file.io.FileException;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;

public class ZipFile {

    public static void main(String[] args) {
        byte[] file = getFile(Path.of("to-zip.txt"));

        Path tempFile = getTempFile();

        File gzip = gzipContent(file, tempFile);

        System.out.println(gzip.getAbsolutePath());

        //TODO
        delete(gzip.toPath());
    }

    public static File gzipContent(byte[] content, Path tempFile) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream)) {
            gzipOutputStream.write(content, 0, content.length);
            gzipOutputStream.finish();

            return Files.write(tempFile, byteArrayOutputStream.toByteArray()).toFile();
        } catch (IOException e) {
            throw new FileException("Unable to create gzip file", e);
        }
    }

    public static Path getTempFile() {
        String tempDir = "zip";
        String tempFilePrefix = "tmpAmazonS3Gzipfile";

        try {
            //TODO
           createDirectoryIfNotExists(tempDir);

            return Files.createTempFile(Path.of(tempDir), tempFilePrefix, ".zip");
        } catch (IOException e) {
            throw new FileException("Unable to create temp file", e);
        }
    }

    public static void createDirectoryIfNotExists(String directory) throws IOException {
        Path path = Paths.get(directory);
        if (Files.notExists(path)) {
            Files.createDirectories(path);
        }
    }

    public static byte[] getFile(Path path) {
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            throw new FileException("Unable to get file", e);
        }
    }

    private static void delete(Path path) {
        try {
            Files.delete(path);
        } catch (IOException e) {
            throw new FileException("Unable to delete file", e);
        }
    }
}
