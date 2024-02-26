package pl.kriskensy.file.image;

public class JPGImageFile extends AbstractImageFile {

    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
    }

    public void showImage() {
        System.out.println("Showing Image");
    }
}