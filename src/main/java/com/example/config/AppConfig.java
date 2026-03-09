package com.example.config;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Central application configuration.
 * All configurable values are defined here — no hardcoded values elsewhere in the codebase.
 * <p>
 * The SQLite database file ({@code hrapp.db}) is stored in the current working directory
 * so it can easily be located, backed up, and shared with colleagues.
 */
public final class AppConfig {

    private static final Properties props = new Properties();

    static{
        try{
            InputStream input = AppConfig.class.getClassLoader().getResourceAsStream("app.properties");

            if(input == null){

                throw new RuntimeException("app.properties not found");
            }

            props.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load app.properties", e);
        }
    }

    public static String getDbUrl() {
        return props.getProperty("db.url");
    }

    public static Path getLogDir() {
        String dir = props.getProperty("log.dir")
                .replace("${user.home}", System.getProperty("user.home"));
        return Paths.get(dir);
    }

    public static String getAppTitle() {
        return props.getProperty("app.title");
    }

    public static int getAppWidth() {
        return Integer.parseInt(props.getProperty("app.width"));
    }

    public static int getAppHeight() {
        return Integer.parseInt(props.getProperty("app.height"));
    }

    public static double getDividerPosition() {
        return Double.parseDouble(props.getProperty("divider.position"));
    }

    public static int getGradeMin() {
        return Integer.parseInt(props.getProperty("grade.min"));
    }

    public static int getGradeMax() {
        return Integer.parseInt(props.getProperty("grade.max"));
    }

    public static int getMaxNameLength() {
        return Integer.parseInt(props.getProperty("max.name.length"));
    }

    public static int getMaxSkillLength() {
        return Integer.parseInt(props.getProperty("max.skill.length"));
    }

    public static int getMaxTaskNameLength() {
        return Integer.parseInt(props.getProperty("max.task.name.length"));
    }

    public static int getMaxCommentLength() {
        return Integer.parseInt(props.getProperty("max.comment.length"));
    }

    private AppConfig(){}
}
