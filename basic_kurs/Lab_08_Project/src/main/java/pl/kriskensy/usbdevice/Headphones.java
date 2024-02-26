package pl.kriskensy.usbdevice;

public class Headphones implements USBDevice {
    private final String name;

    public Headphones(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Headphones connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Headphones disconnected");
        return true;
    }

    public String getName() {
        return name;
    }
}