package com.example.config;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance
 * each time,
 * not thread-safe, reload allowed anytime, mutable global state,
 * reflection+serialization-friendly.
 */
public class AppSettings implements Serializable {
    private final Properties props = new Properties();
    static boolean isInstnance; //used to handle reflextion
    private AppSettings() { 
        if(isInstnance) {
            throw new RuntimeException("Instance already exsist!");
        }
        isInstnance = true;
    }

    public static AppSettings getInstance() {
        // return new AppSettings(); // returns a fresh instance (bug)
       return AppSettingsTemp.appsettings;
    }

    //java calls this, when we try to create a copy, 
    //and it returns the exsitningn instance.
    public AppSettings readResolve() {
        return AppSettingsTemp.appsettings;
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }

    // inner-class
    private static class AppSettingsTemp {
        private static AppSettings appsettings = new AppSettings();

    }
}
