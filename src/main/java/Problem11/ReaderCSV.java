package Problem11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Consumer;

/**
 * @author lefeverw
 */
public class ReaderCSV {

    final private String filePath;


    public ReaderCSV(String filePath) {
        this.filePath = filePath;
    }

    public void readLines(Consumer<String> lineOperation) throws IOException {

        File toRead = new File(filePath);

        BufferedReader br = new BufferedReader(new FileReader(toRead));

        String line;
        while((line = br.readLine()) != null){
            lineOperation.accept(line);
        }


        br.close();
    }
}
