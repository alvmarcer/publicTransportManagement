package com.example.publictransportmanagement;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import main.Main;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.Scanner;

public class AdminInterface  extends Application{
    @Override
    public void start(Stage primaryStage) {
        Label welcomeLabel = new Label("Welcome to Administrator panel");
        Button createUserBtn = new Button("Create User");
        Button deleteUserBtn = new Button("Delete User");
        VBox root = new VBox(15, welcomeLabel,createUserBtn, deleteUserBtn);
        Scene scene = new Scene(root, 800, 600);

        createUserBtn.setOnAction(e -> {
            System.out.println("Creating user: ");
            Main.createUser(new Scanner(System.in));
            System.out.println("User created successfully.");
            primaryStage.close();
        });

        deleteUserBtn.setOnAction(e -> {
            System.out.println("Deleting user: ");
            Main.deleteUser(new Scanner(System.in));
            primaryStage.close();
        });


        primaryStage.setTitle("Administrator panel");
        primaryStage.setScene(scene);
        primaryStage.show();
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        welcomeLabel.setStyle("-fx-font-size: 40px; -fx-font-weight: bold; -fx-text-fill: white;");
        createUserBtn.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");
        deleteUserBtn.setStyle("-fx-background-color: #F44336; -fx-text-fill: white;");
        root.setStyle("-fx-background-image: url('file:src/main/resources/images/background.jpg'); -fx-background-size: cover;");
    }
}
