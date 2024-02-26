package pl.kriskensy.drive;

import pl.kriskensy.file.File;

public interface Drive {
    void addFile(File file);

    void listFiles();
}