package FileHandlingDemo;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ReplaceNewEx {
    static void main() throws IOException {

//        Files.copy(
//                Path.of("demo/config/source.txt"),
//                Path.of("demo/config/dest.txt"),
//                StandardCopyOption.REPLACE_EXISTING
//        );

//        Files.move(
//                Path.of("demo/config/source.txt"),
//                Path.of("demo/config/dest.txt"),
//                StandardCopyOption.REPLACE_EXISTING
//        );


        Files.delete(Path.of("demo/config/dest.txt"));

    }
}
