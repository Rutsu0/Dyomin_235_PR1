package ru.dyomin.dyomin_task1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        scene4 = createScene4();
        primaryStage.setTitle("Практическая работа 6");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene createScene1() {

        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        Button calcButton = new Button("Найти пример");
        Label resultLavel = new Label();
        Label result1Lavel = new Label();

        calcButton.setOnAction(www -> {
            try {
                int a = Integer.parseInt(sideAField.getText());
                int b = Integer.parseInt(sideBField.getText());
                int summ = a + b;
                int raz = a - b;
                int proz = a * b;
                double chas2 = Math.pow(a, 2) / Math.pow(b, 2);
                resultLavel.setText("сумма = " + summ + " разность = " + raz);
                result1Lavel.setText("проз = " + proz + " chas2 = " + chas2);
            } catch (NumberFormatException e) {
                resultLavel.setText("ERROR !!!");
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, new Label("b="), sideBField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLavel, result1Lavel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);


    }

    private Scene createScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-sizd:20px;-fx-font-weigt:bold;");
        TextField sidea1Field = new TextField();
        TextField sideb1Field = new TextField();
        Button calcButton = new Button("Змена числел");
        Label resultLabel = new Label();
        calcButton.setOnAction(event -> {
            try {
                double a1 = Double.parseDouble(sidea1Field.getText());
                double b1 = Double.parseDouble(sideb1Field.getText());
                resultLabel.setText("a = " + b1 + " b = " + a1);
            } catch (NumberFormatException e) {
                resultLabel.setText("Error !!!");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sidea1Field, new Label("b="), sideb1Field);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    private Scene createScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-sizd:20px;-fx-font-weigt:bold;");
        TextField sideFField = new TextField();
        Button calcButton = new Button("Найти температуру из F в C");
        Label resultLabel = new Label();
        calcButton.setOnAction(event -> {
            try {
                double F = Double.parseDouble(sideFField.getText());
                double C = (F - 32) * 5 / 9;
                resultLabel.setText("Температура в °C =  " + C);
            } catch (NumberFormatException e) {
                resultLabel.setText("Error !!!");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("F="), sideFField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    private Scene createScene4() {
        Label titleLabel = new Label("Задание 4");
        titleLabel.setStyle("-fx-font-sizd:20px;-fx-font-weigt:bold;");
        TextField sideNField = new TextField();
        Button calcButton = new Button("Найти значение выражения");
        Label resultLabel = new Label();
        calcButton.setOnAction(event -> {
            try {
                double n = Double.parseDouble(sideNField.getText());
                double z = (n + (1 / Math.tan(n + 1))) / (Math.sin(n + 1));
                resultLabel.setText("Значение выражения =  " + z);
            } catch (NumberFormatException e) {
                resultLabel.setText("Error !!!");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("N="), sideNField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);

    }
}
