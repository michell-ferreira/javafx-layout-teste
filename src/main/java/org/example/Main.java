package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Button button1 = new Button("Botão 1");
        // Um botão simples
        Button button2 = new Button("Botão 2");
        Button button3 = new Button("Botão 3");
        Button button4 = new Button("Botão 4");

        HBox hBox = new HBox(button1, button2);
        // HBox joga os itens lado a lado horizontalmente.

        hBox.setAlignment(Pos.CENTER);
        // Centraliza os botões dentro do HBox

        VBox vBox = new VBox(button3, button4);
        // VBox empilha os itens um embaixo do outro.

        vBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        // Layout que permite dividir a tela em 5 partes: TOP, CENTER, LEFT, RIGHT, BOTTOM.

        borderPane.setTop(hBox);
        // Coloca os botões 1 e 2 na parte superior da tela.

        borderPane.setCenter(vBox);
        // Coloca os botões 3 e 4 no centro da tela.

        Scene scene = new Scene(borderPane, 300, 300);
        // Cria a cena com o BorderPane dentro, tamanho 300x300.

        stage.setScene(scene);
        // stage usa a scene criada.

        stage.show();
        // Mostra a janela. Sem isso, nada aparece.
    }

    public static void main(String[] args) {
        launch(args);
        // Inicia o JavaFX e dispara o start().
    }
}
