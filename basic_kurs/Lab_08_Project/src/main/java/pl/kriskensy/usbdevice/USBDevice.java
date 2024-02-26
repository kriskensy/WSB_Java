package pl.kriskensy.usbdevice;

public interface USBDevice {
    boolean connect();

    boolean disconnect();

    String getName();
}