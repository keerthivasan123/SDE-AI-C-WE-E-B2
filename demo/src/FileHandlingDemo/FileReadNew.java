package FileHandlingDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class FileReadNew {
    static void main() throws IOException {

        Path path = Path.of("demo/config/config.txt");
        String content = Files.readString(path);
        System.out.println(content);

        List<String> lines = Files.readAllLines(Path.of("demo/config/config.txt"));
        System.out.println(lines);
        lines.forEach(System.out::println);

        try (Stream<String> stream = Files.lines(Path.of("demo/config/config.txt"))) {
            stream.forEach(System.out::println);
        }


        Path pathWrite = Path.of("demo/config/fileWriterNew.txt");
        Files.writeString(pathWrite, "Hello File I/O \nASDF");
//        Files.writeString(pathWrite, "");

//        List<String> data = List.of("Java", "Spring", "AWS");
//        Files.write(Path.of("demo/config/fileAppendNew.txt"), data);

        Files.write(
                Path.of("demo/config/fileAppendNew.txt"),
                List.of("Docker"),
                StandardOpenOption.APPEND
        );


//        Files.createFile(Path.of("demo/config/newFileUsingCreateFile.txt"));

//        Files.createDirectories(Path.of("demo/config/newDirectoryUsingCreateDirectories"));
        System.out.println("is directory exist : " + Files.exists(Path.of("demo/config/newDirectoryUsingCreateDirectories")));

    }
}
