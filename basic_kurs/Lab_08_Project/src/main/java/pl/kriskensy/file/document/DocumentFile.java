package pl.kriskensy.file.document;

import pl.kriskensy.file.File;

public interface DocumentFile extends File {

    void writeToFile(DocumentFile documentFile);

    void readFromFile();
}