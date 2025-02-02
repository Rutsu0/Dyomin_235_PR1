package ru.dyomin.dyomin;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static java.lang.Math.*;

import static java.lang.Math.pow;


public class HelloApplication extends Application {
    private Stage SP;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;


    @Override
    public void start(Stage stage) throws Exception {
        SP = stage;
        scene1 = create1scene();
        scene2 = create2scene();
        scene3 = create3scene();
        SP.show();
        SP.setScene(scene1);
        SP.setTitle("Сессия");
    }

    private Scene create1scene  () {
        Label titleLAbel = new Label("Задание 1");
        TextField ATF = new TextField();
        TextField BTF = new TextField();
        Button rezButton = new Button("Решить");
        Label rezLabel = new Label();

        rezButton.setOnAction(ww->{
            try {
                int a = Integer.parseInt(ATF.getText());
                int b = Integer.parseInt(BTF.getText());
                String x = "";
                for (int z = 0; z <= a; z += b) {
                    x += " " + z;
                }
                rezLabel.setText("Ответ =" + x);
            } catch (NumberFormatException e) {
                rezLabel.setText("ERROR!!!!!!");
            }
        });
        Button btn1Scene = new Button("1");
        Button btn2Scene = new Button("2");
        Button btn3Scene = new Button("3");
        btn1Scene.setOnAction(event -> SP.setScene(scene1));
        btn2Scene.setOnAction(event -> SP.setScene(scene2));
        btn3Scene.setOnAction(event -> SP.setScene(scene3));
        HBox root2 = new HBox(10, btn1Scene,btn2Scene,btn3Scene);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a= "),ATF, new Label("b= "),BTF);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLAbel, root1,rezButton,rezLabel,root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 1000,1000);
    }
    private Scene create2scene  () {
        Label titleLAbel = new Label("Задание 2");
        TextField ATF = new TextField();
        TextField BTF = new TextField();
        TextField CTF = new TextField();
        Button rezButton = new Button("Решить");
        Label rezLabel = new Label();

        rezButton.setOnAction(ww->{
            try {
                int a = Integer.parseInt(ATF.getText());
                int b = Integer.parseInt(BTF.getText());
                int c = Integer.parseInt(CTF.getText());
                int rez1 = a*b;
                int rez2 = b*c;
                if (rez1<rez2) {
                    rezLabel.setText("Ответ = " + rez1 + " " + rez2);
                } else {
                    rezLabel.setText("Ответ = " + rez2 + " " + rez1);
                }
            } catch (NumberFormatException e) {
                rezLabel.setText("ERROR!!!!!!");
            }
        });
        Button btn1Scene = new Button("1");
        Button btn2Scene = new Button("2");
        Button btn3Scene = new Button("3");
        btn1Scene.setOnAction(event -> SP.setScene(scene1));
        btn2Scene.setOnAction(event -> SP.setScene(scene2));
        btn3Scene.setOnAction(event -> SP.setScene(scene3));
        HBox root2 = new HBox(10, btn1Scene,btn2Scene,btn3Scene);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a= "),ATF, new Label("b= "),BTF, new Label("c = "), CTF);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLAbel, root1,rezButton,rezLabel,root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 1000,1000);
    }
    private Scene create3scene  () {
        Label titleLAbel = new Label("Задание 3");
        TextField x = new TextField();
        TextField y = new TextField();
        TextField r = new TextField();
        TextField n = new TextField();
        TextField m = new TextField();
        TextField a = new TextField();
        Button rezButton = new Button("Решить");
        Label rezLabel = new Label();

        rezButton.setOnAction(ww->{
            try {
                int X = Integer.parseInt(x.getText());
                int Y = Integer.parseInt(y.getText());
                int R = Integer.parseInt(r.getText());
                int N = Integer.parseInt(n.getText());
                int M = Integer.parseInt(m.getText());
                int A = Integer.parseInt(a.getText());
                if (pow(M + X, 2) + pow(N + Y, 2) <= pow(R, 2) && pow(M + X, 2) + pow(N - A + Y, 2) <= pow(R, 2) && pow(M - A + X, 2) + pow(N - A + Y, 2) <= pow(R, 2) && pow(M - A + X, 2) + pow(N+ Y, 2) <= pow(R, 2)){
                    rezLabel.setText("Принадлежит");
                }else {
                    rezLabel.setText("Не принадлежит");
                }
            } catch (NumberFormatException e) {
                rezLabel.setText("ERROR!!!!!!");
            }
        });
        Button btn1Scene = new Button("1");
        Button btn2Scene = new Button("2");
        Button btn3Scene = new Button("3");
        btn1Scene.setOnAction(event -> SP.setScene(scene1));
        btn2Scene.setOnAction(event -> SP.setScene(scene2));
        btn3Scene.setOnAction(event -> SP.setScene(scene3));
        HBox root2 = new HBox(10, btn1Scene,btn2Scene,btn3Scene);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x= "),x, new Label("y= "),y,new Label("r"),r);
        root1.setAlignment(Pos.CENTER);
        HBox root3 = new HBox(10, new Label("b= "),n, new Label("m= "),m,new Label("a"),a);
        root3.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLAbel, root1, root3, rezButton,rezLabel,root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 1000,1000);
    }
}


