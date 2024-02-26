package pl.kriskensy.file.image;

import pl.kriskensy.file.AbstractFile;
import pl.kriskensy.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    public AbstractImageFile(String name, int size) { //UWAGA! - z tego konstruktora korzystam w klasach pochodnych, inicjalizacja tutaj aby zredukowac kod
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}