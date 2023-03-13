package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    public Label output;

    public TextField input;

    public void B(ActionEvent e){
        try{
            String s=input.getText();
            int num=Integer.parseInt(s);
            output.setText(Integer.toBinaryString(num));
        }catch (NumberFormatException ee){
            output.setText("Not a Number!");
        }
    }
    public void O(ActionEvent e){
        try{
            String s=input.getText();
            int num=Integer.parseInt(s);
            output.setText(Integer.toOctalString(num));
        }catch (NumberFormatException ee){
            output.setText("Not a Number!");
        }
    }

    public void H(ActionEvent e){
        try{
            String s=input.getText();
            int num=Integer.parseInt(s);
            output.setText(Integer.toHexString(num));
        }catch (NumberFormatException ee){
            output.setText("Not a Number!");
        }
    }
    public void clear(ActionEvent e){
        output.setText("No Input");
        input.setText(null);
    }
    public void exit(ActionEvent e){
        System.exit(0);
    }
    public Stage stage;
    public Scene scene;
    public Parent root;
    public void nextScene(ActionEvent e) throws IOException {
        root=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NextScene.fxml")));
        scene=new Scene(root);
        stage=(Stage)((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    public void goBack(ActionEvent e) throws IOException {
        root=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        scene=new Scene(root);
        stage=(Stage)((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

}