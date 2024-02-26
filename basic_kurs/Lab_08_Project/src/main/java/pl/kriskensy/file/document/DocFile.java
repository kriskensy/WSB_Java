package pl.kriskensy.file.document;

import java.io.*;

public class DocFile extends AbstractDocumentFile {

    private static final String FILE_PATH = "C:/_temp/Document.txt";
    public DocFile(String name, int size, String documentText) {
        super(name, size, documentText);
    }

    @Override
    public String toString() {
        return documentText;
    }

    @Override
    public void writeToFile(DocumentFile documentFile) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(documentFile.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void readFromFile() {
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}