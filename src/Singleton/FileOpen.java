package Singleton;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileOpen {

    private static FileOpen instance;

    private static File file;
    private static String content;

    private FileOpen() {

    }

    public static  FileOpen getInstance() throws IOException {
        if (instance == null) {
            file = new File("miarchivo.txt");
            content = new String(Files.readAllBytes(file.toPath()));
            instance = new FileOpen();
        }

        return instance;
    }

    public String getContent() {
        return content;
    }
}