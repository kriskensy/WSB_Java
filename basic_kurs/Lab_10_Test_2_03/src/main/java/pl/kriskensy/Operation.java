package pl.kriskensy;

import java.util.Scanner;

public abstract class Operation {
    protected Scanner scanner = new Scanner(System.in);

    public abstract void mathOperation();
}