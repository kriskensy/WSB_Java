package pl.kriskensy.file.document;

import pl.kriskensy.file.AbstractFile;
import pl.kriskensy.file.FileType;

public abstract class AbstractDocumentFile extends AbstractFile implements DocumentFile{
    protected String documentText;

    public AbstractDocumentFile(String name, int size, String documentText) {
        super(name, size);
        this.documentText = documentText;
    }

    @Override
    public FileType getType() {
        return FileType.TEXT;
    }
}