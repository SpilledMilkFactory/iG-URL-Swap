package iGwebSwap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//TODO FIX READOMG URL DATA FROM TARGET .TXT FILE
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Csgsu
 */
public class IG_URL_Swap_v2FX extends Application implements EventHandler<ActionEvent> {

    Button credentialsButton, updateURLsButton, returnButton;
    ArrayList<String> urlSwapList;

    @Override
    public void start(Stage primaryStage) throws IOException {
        //Main Screen ###########################################################
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 300);
        GridPane mainGrid = new GridPane();
        mainGrid.setPadding(new Insets(0, 0, 0, 0));
        mainGrid.setVgap(5);
        mainGrid.setHgap(5);
        final TextField usernameField = new TextField();
        usernameField.setPromptText("username");
        usernameField.setPrefColumnCount(64);
        GridPane.setConstraints(usernameField, 0, 0);
        mainGrid.getChildren().add(usernameField);
        final PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("password");
        GridPane.setConstraints(passwordField, 0, 1);
        mainGrid.getChildren().add(passwordField);
        final Image homescreen = new Image(new FileInputStream("muster.png"));
        ImageView imgvw = new ImageView(homescreen);
        imgvw.setX(150);
        imgvw.setY(200);
        imgvw.setFitHeight(100);
        imgvw.setFitWidth(300);
        imgvw.setPreserveRatio(true);
        
        credentialsButton = new Button();
        credentialsButton.setText("Submit Credentials");
        credentialsButton.setOnAction(e -> {
            try {
                try (BufferedWriter out = new BufferedWriter(new FileWriter("userCredentials.txt"))) {
                    out.write(usernameField.getText());
                    out.newLine();
                    out.write(passwordField.getText());
                }
                Driver.main();
            } catch (IOException | InterruptedException ex) {
                Logger.getLogger(IG_URL_Swap_v2FX.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        //SCENE 2 ##############################################################
        StackPane root2 = new StackPane();
        GridPane grid2 = new GridPane();
        Scene scene2 = new Scene(root2, 400, 800);
        grid2.setPadding(new Insets(0, 0, 0, 0));
        grid2.setVgap(5);
        grid2.setHgap(5);
        final TextField slot0 = new TextField();
        slot0.setPromptText("00:55;https://exampleSite1.com");
        slot0.setPrefColumnCount(40);
        slot0.getText();
        GridPane.setConstraints(slot0, 0, 0);
        grid2.getChildren().add(slot0);
        final TextField slot1 = new TextField();
        slot1.setPromptText("01:26;https://exampleSite2.com");
        slot1.getText();
        GridPane.setConstraints(slot1, 0, 1);
        grid2.getChildren().add(slot1);
        final TextField slot2 = new TextField();
        slot2.setPromptText("02:34;https://exampleSite3.com");
        slot2.getText();
        GridPane.setConstraints(slot2, 0, 2);
        grid2.getChildren().add(slot2);
        final TextField slot3 = new TextField();
        slot3.setPromptText("03:14;https://exampleSite4.com");
        slot3.getText();
        GridPane.setConstraints(slot3, 0, 3);
        grid2.getChildren().add(slot3);
        final TextField slot4 = new TextField();
        slot4.setPromptText("04:21;https://exampleSite5.com");
        slot4.getText();
        GridPane.setConstraints(slot4, 0, 4);
        grid2.getChildren().add(slot4);
        final TextField slot5 = new TextField();
        slot5.setPromptText("05:19;https://exampleSite6.com");
        slot5.getText();
        GridPane.setConstraints(slot5, 0, 5);
        grid2.getChildren().add(slot5);
        final TextField slot6 = new TextField();
        slot6.setPromptText("06:35;https://exampleSite7.com");
        slot6.getText();
        GridPane.setConstraints(slot6, 0, 6);
        grid2.getChildren().add(slot6);
        final TextField slot7 = new TextField();
        slot7.setPromptText("07:30;https://exampleSite8.com");
        slot7.getText();
        GridPane.setConstraints(slot7, 0, 7);
        grid2.getChildren().add(slot7);
        final TextField slot8 = new TextField();
        slot8.setPromptText("08:53;https://exampleSite9.com");
        slot8.getText();
        GridPane.setConstraints(slot8, 0, 8);
        grid2.getChildren().add(slot8);
        final TextField slot9 = new TextField();
        slot9.setPromptText("09:49;https://exampleSite10.com");
        slot9.getText();
        GridPane.setConstraints(slot9, 0, 9);
        grid2.getChildren().add(slot9);
        final TextField slot10 = new TextField();
        slot10.setPromptText("10:56;https://exampleSite11.com");
        slot10.getText();
        GridPane.setConstraints(slot10, 0, 10);
        grid2.getChildren().add(slot10);
        final TextField slot11 = new TextField();
        slot11.setPromptText("11:14;https://exampleSite12.com");
        slot11.getText();
        GridPane.setConstraints(slot11, 0, 11);
        grid2.getChildren().add(slot11);
        final TextField slot12 = new TextField();
        slot12.setPromptText("12:37;https://exampleSite13.com");
        slot12.getText();
        GridPane.setConstraints(slot12, 0, 12);
        grid2.getChildren().add(slot12);
        final TextField slot13 = new TextField();
        slot13.setPromptText("13:25;https://exampleSite14.com");
        slot13.getText();
        GridPane.setConstraints(slot13, 0, 13);
        grid2.getChildren().add(slot13);
        final TextField slot14 = new TextField();
        slot14.setPromptText("14:33;https://exampleSite15.com");
        slot14.getText();
        GridPane.setConstraints(slot14, 0, 14);
        grid2.getChildren().add(slot14);
        final TextField slot15 = new TextField();
        slot15.setPromptText("15:21;https://exampleSite16.com");
        slot15.getText();
        GridPane.setConstraints(slot15, 0, 15);
        grid2.getChildren().add(slot15);
        final TextField slot16 = new TextField();
        slot16.setPromptText("16:46;https://exampleSite17.com");
        slot16.getText();
        GridPane.setConstraints(slot16, 0, 16);
        grid2.getChildren().add(slot16);
        final TextField slot17 = new TextField();
        slot17.setPromptText("17:29;https://exampleSite18.com");
        slot17.getText();
        GridPane.setConstraints(slot17, 0, 17);
        grid2.getChildren().add(slot17);
        final TextField slot18 = new TextField();
        slot18.setPromptText("18:47;https://exampleSite19.com");
        slot18.getText();
        GridPane.setConstraints(slot18, 0, 18);
        grid2.getChildren().add(slot18);
        final TextField slot19 = new TextField();
        slot19.setPromptText("19:06;https://exampleSite20.com");
        slot19.getText();
        GridPane.setConstraints(slot19, 0, 19);
        grid2.getChildren().add(slot19);
        final TextField slot20 = new TextField();
        slot20.setPromptText("20:14;https://exampleSite21.com");
        slot20.getText();
        GridPane.setConstraints(slot20, 0, 20);
        grid2.getChildren().add(slot20);
        final TextField slot21 = new TextField();
        slot21.setPromptText("21:09;https://exampleSite22.com");
        slot21.getText();
        GridPane.setConstraints(slot21, 0, 21);
        grid2.getChildren().add(slot21);
        final TextField slot22 = new TextField();
        slot22.setPromptText("22:51;https://exampleSite23.com");
        slot22.getText();
        GridPane.setConstraints(slot22, 0, 22);
        grid2.getChildren().add(slot22);
        final TextField slot23 = new TextField();
        slot23.setPromptText("23:19;https://exampleSite24.com");
        slot23.getText();
        GridPane.setConstraints(slot23, 0, 23);
        grid2.getChildren().add(slot23);
        final TextField slot24 = new TextField();
        slot24.setPromptText("00:30;https://exampleSite25.com");
        slot24.getText();
        GridPane.setConstraints(slot24, 0, 24);
        grid2.getChildren().add(slot24);

        returnButton = new Button("Save & Return");
        returnButton.setOnAction(e -> {
            try (BufferedWriter urlsOut = new BufferedWriter(new FileWriter("webURLs.txt"))) {
                if(!slot0.getText().equals("")){
                    urlsOut.write(slot0.getText());
                    urlsOut.newLine();
                }if(!slot1.getText().equals("")){
                    urlsOut.write(slot1.getText());
                    urlsOut.newLine();
                }if(!slot2.getText().equals("")){
                    urlsOut.write(slot2.getText());
                    urlsOut.newLine();
                }if(!slot3.getText().equals("")){
                    urlsOut.write(slot3.getText());
                    urlsOut.newLine();
                }if(!slot4.getText().equals("")){
                    urlsOut.write(slot4.getText());
                    urlsOut.newLine();
                }if(!slot5.getText().equals("")){
                    urlsOut.write(slot5.getText());
                    urlsOut.newLine();
                }if(!slot6.getText().equals("")){
                    urlsOut.write(slot6.getText());
                    urlsOut.newLine();
                }if(!slot7.getText().equals("")){
                    urlsOut.write(slot7.getText());
                    urlsOut.newLine();
                }if(!slot8.getText().equals("")){
                    urlsOut.write(slot8.getText());
                    urlsOut.newLine();
                }if(!slot9.getText().equals("")){
                    urlsOut.write(slot9.getText());
                    urlsOut.newLine();
                }if(!slot10.getText().equals("")){
                    urlsOut.write(slot10.getText());
                    urlsOut.newLine();
                }if(!slot11.getText().equals("")){
                    urlsOut.write(slot11.getText());
                    urlsOut.newLine();
                }if(!slot12.getText().equals("")){
                    urlsOut.write(slot12.getText());
                    urlsOut.newLine();
                }if(!slot13.getText().equals("")){
                    urlsOut.write(slot13.getText());
                    urlsOut.newLine();
                }if(!slot14.getText().equals("")){
                    urlsOut.write(slot14.getText());
                    urlsOut.newLine();
                }if(!slot15.getText().equals("")){
                    urlsOut.write(slot15.getText());
                    urlsOut.newLine();
                }if(!slot16.getText().equals("")){
                    urlsOut.write(slot16.getText());
                    urlsOut.newLine();
                }if(!slot17.getText().equals("")){
                    urlsOut.write(slot17.getText());
                    urlsOut.newLine();
                }if(!slot18.getText().equals("")){
                    urlsOut.write(slot18.getText());
                    urlsOut.newLine();
                }if(!slot19.getText().equals("")){
                    urlsOut.write(slot19.getText());
                    urlsOut.newLine();
                }if(!slot20.getText().equals("")){
                    urlsOut.write(slot20.getText());
                    urlsOut.newLine();
                }if(!slot21.getText().equals("")){
                    urlsOut.write(slot21.getText());
                    urlsOut.newLine();
                }if(!slot22.getText().equals("")){
                    urlsOut.write(slot22.getText());
                    urlsOut.newLine();
                }if(!slot23.getText().equals("")){
                    urlsOut.write(slot23.getText());
                    urlsOut.newLine();
                }if(!slot24.getText().equals("")){
                    urlsOut.write(slot24.getText());
                    urlsOut.newLine();
                }
                urlsOut.close();
            } catch (IOException ex) {
                Logger.getLogger(IG_URL_Swap_v2FX.class.getName()).log(Level.SEVERE, null, ex);
            }
            primaryStage.setScene(scene);
        });

        updateURLsButton = new Button();
        updateURLsButton.setText("Update URL Swap Schedule");
        updateURLsButton.setOnAction(e -> primaryStage.setScene(scene2));//primaryStage.setScene(scene2)

        //layout1.getChildren().add()
        root.getChildren().addAll(mainGrid, credentialsButton, updateURLsButton, imgvw);
        StackPane.setAlignment(updateURLsButton, Pos.BOTTOM_CENTER);
        StackPane.setMargin(updateURLsButton, new Insets(0, 0, 76, 0));
        StackPane.setAlignment(credentialsButton, Pos.BOTTOM_CENTER);
        StackPane.setMargin(credentialsButton, new Insets(0, 0, 110, 0));
        StackPane.setAlignment(mainGrid, Pos.TOP_CENTER);
        StackPane.setMargin(mainGrid, new Insets(100, 100, 100, 100));
        StackPane.setAlignment(imgvw, Pos.TOP_CENTER);
        StackPane.setMargin(imgvw, new Insets(0,0,0,0));
        
        root2.getChildren().addAll(grid2, returnButton);
        StackPane.setAlignment(returnButton, Pos.BOTTOM_CENTER);
        StackPane.setMargin(returnButton, new Insets(0, 0, 0, 0));

        primaryStage.setTitle("iG URL Swap");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        /* if (event.getSource() == updateURLsButton){
            primaryStage.setScene(scene2);
        }*/
    }
}
