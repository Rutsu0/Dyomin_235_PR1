package ru.dyomin.dyomin_marathon.util;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ru.dyomin.dyomin_marathon.HelloApplication;

import java.io.IOException;

public class manager {
    public static Stage startStage;
    public static Rectangle2D screenSize= Screen.getPrimary().getVisualBounds();

    public static void showStartStage(Stage stage, String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.setMinWidth(300);
        stage.setMinHeight(200);
        stage.setMaximized(true);
        startStage=stage;
        stage.show();}
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showChoiseStage(Stage startStage, String fxmlFileName, String title){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getWidth()-50);
            manager.startStage.setScene(scene);
            manager.startStage.setTitle(title);
            manager.startStage.show();}
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showLoginStage(String fxmlFileName, String title){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getWidth()-50);
            startStage.setScene(scene);
            startStage.setTitle(title);
            startStage.show();}
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showRegistorStage(String fxmlFileName, String title){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getWidth()-50);
            startStage.setScene(scene);
            startStage.setTitle(title);
            startStage.show();}
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showRegistorEventStage(Stage startStage, String fxmlFileName, String title){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getWidth()-50);
            manager.startStage.setScene(scene);
            manager.startStage.setTitle(title);
            manager.startStage.show();}
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showEndStage(Stage startStage, String fxmlFileName, String title){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getWidth()-50);
            manager.startStage.setScene(scene);
            manager.startStage.setTitle(title);
            manager.startStage.show();}
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
