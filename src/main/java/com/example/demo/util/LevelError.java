package com.example.demo.util;

public class LevelError extends LevelErrorAbstract{
    public LevelError(String nombre, int valor) {
        this.setNombre(nombre);
        this.setValor(valor);
    }

    public static final LevelError INFO = new LevelError("INFO", 1);

    public static final LevelError ERROR = new LevelError("ERROR", 2);

    public static final LevelError WARN = new LevelError("WARN", 3);
}
