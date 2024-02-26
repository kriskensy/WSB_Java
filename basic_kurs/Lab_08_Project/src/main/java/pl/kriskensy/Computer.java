package pl.kriskensy;

import pl.kriskensy.drive.Drive;
import pl.kriskensy.file.File;
import pl.kriskensy.usbdevice.Headphones;
import pl.kriskensy.usbdevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;

    List<USBDevice> usbDevices = new ArrayList<>(); //brak zwykłego settera dla listy bo nie chce calej listy zmieniac
    // tylko ja modyfikowac, dlatego zamiast settera metoda  doddajaca i metoda usuwajaca urzadzenie

    public Computer(Monitor monitor, Drive drive) { //Drive jest interfejsem, dlatego dla kazdego obiektu typu computer mozna zamieniac rodzaj dysku bez zadnego problemu
        this.monitor = monitor;
        this.drive = drive;
    }

    public void addFile(File file) { //z poziomu komputera moge przymowac plik
        drive.addFile(file);
    }

    public void listFiles() {
        drive.listFiles();
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

    public void addUSBDevice(USBDevice usbDevice) {
        boolean isConnected = usbDevice.connect();

        if (isConnected) {
            usbDevices.add(usbDevice);
        }
    }

    public void removeUSBDevice(USBDevice usbDevice) {
        boolean isDisconnected = usbDevice.disconnect();

        if (!isDisconnected) {
            System.out.println("USB Device forcefully disconnected");
        }
        usbDevices.remove(usbDevice); //urzadzenie zostanie usuniete z listy niezaleznie czy usuniete poprawnie czy nie
    }
}