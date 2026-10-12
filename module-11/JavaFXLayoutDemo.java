/*
    Jonathon Walmsley
    Module 11.2
    Description: Demo JavaFX layout using BorderPane and GridPane.
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXLayoutDemo extends Application {

    // Using BorderPane as the main layout container for the application
    private BorderPane rootPane;

    @Override
    public void start(Stage primaryStage) {

        // Create the root BorderPane and set a background color
        rootPane = new BorderPane();
        rootPane.setStyle("-fx-background-color: #f8fafc;");

        // Create a Header for the TOP region
        HBox header = new HBox(20);
        
        // Set padding, alignment, and background color for the Header
        header.setPadding(new Insets(14, 24, 14, 24));
        header.setAlignment(Pos.CENTER_LEFT);
        header.setStyle("-fx-background-color: #1e293b;");

        // Add a title
        Label appTitle = new Label("JavaFX Layout Demo");
        appTitle.setStyle("-fx-text-fill: #ffffff; -fx-font-size: 16px; -fx-font-weight: bold;");

        // Create navigation buttons
        Button btnHome = new Button("Home");
        Button btnAbout = new Button("About");

        // Add styles to the buttons for a consistent look
        String navStyle = "-fx-background-color: transparent; -fx-text-fill: #cbd5e1; -fx-font-size: 13px; -fx-cursor: hand;";
        btnHome.setStyle(navStyle);
        btnAbout.setStyle(navStyle);

        // Add Actions to switch center content
        btnHome.setOnAction(e -> rootPane.setCenter(createHomeGrid()));
        btnAbout.setOnAction(e -> rootPane.setCenter(createAboutGrid()));

        header.getChildren().addAll(appTitle, btnHome, btnAbout);
        
        // Set the header in the TOP region of the BorderPane
        rootPane.setTop(header);

        // Set the CENTER region default view to Home GridPane
        rootPane.setCenter(createHomeGrid());

        // Configure the Scene and Stage
        Scene scene = new Scene(rootPane, 520, 320);
        primaryStage.setTitle("JavaFX BorderPane and GridPane Layout Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // --- Create the HOME GridPane ---
    private GridPane createHomeGrid() {
        GridPane grid = buildBaseGrid();

        Label title = new Label("Home Page - Application Status");
        title.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #0f172a;");
        GridPane.setColumnSpan(title, 2);
        grid.add(title, 0, 0);

        grid.add(createBoldLabel("System Status:"), 0, 1);
        grid.add(new Label("Online & Synchronized"), 1, 1);

        grid.add(createBoldLabel("Environment:"), 0, 2);
        grid.add(new Label("Production JavaFX 17+"), 1, 2);

        grid.add(createBoldLabel("Active Layout:"), 0, 3);
        grid.add(new Label("BorderPane + Embedded GridPane"), 1, 3);

        return grid;
    }

    // --- Create the ABOUT GridPane ---
    private GridPane createAboutGrid() {
        GridPane grid = buildBaseGrid();

        Label title = new Label("About Page - Application Details");
        title.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #0f172a;");
        GridPane.setColumnSpan(title, 2);
        grid.add(title, 0, 0);

        grid.add(createBoldLabel("Author:"), 0, 1);
        grid.add(new Label("Jonathon Walmsley"), 1, 1);

        grid.add(createBoldLabel("Purpose:"), 0, 2);
        grid.add(new Label("Layout Container Demonstration"), 1, 2);

        grid.add(createBoldLabel("Framework:"), 0, 3);
        grid.add(new Label("OpenJFX Scene Graph"), 1, 3);

        return grid;
    }

    // Helper method to build a base GridPane with consistent styling and spacing
    private GridPane buildBaseGrid() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(16);
        grid.setVgap(12);
        grid.setPadding(new Insets(24));

        ColumnConstraints colLabel = new ColumnConstraints();
        colLabel.setMinWidth(110);
        ColumnConstraints colValue = new ColumnConstraints();
        colValue.setMinWidth(220);

        grid.getColumnConstraints().addAll(colLabel, colValue);
        return grid;
    }

    // Helper method to create a bold label with a specific text color
    private Label createBoldLabel(String text) {
        Label lbl = new Label(text);
        lbl.setStyle("-fx-font-weight: bold; -fx-text-fill: #334155;");
        return lbl;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
