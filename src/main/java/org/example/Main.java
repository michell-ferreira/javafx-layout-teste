package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        // Criação dos elementos (rótulos, campos de texto e botão)
        Label rotuloNome = new Label("Nome:");
        Label rotuloEmail = new Label("E-mail");

        TextField campoNome = new TextField();
        TextField campoEmail = new TextField();

        Button botaoEnviar = new Button("Enviar");

        // Criação do GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(8);
        // Hgap = espaçamento horizontal entre as colunas.
        // Como margin-right entre os elementos.
        gridPane.setVgap(8);
        // Vgap = espaçamento vertical entre as linhas.
        // Como margin-bottom no CSS.
        gridPane.setPadding(new Insets(5));
        // Padding externo do container inteiro.
        // Igual padding do CSS: espaço entre a borda do layout e os elementos dentro dele.

        gridPane.addRow(0, rotuloNome, campoNome);
        gridPane.addRow(1, rotuloEmail, campoEmail);
        gridPane.addRow(2, botaoEnviar);

        Scene scene = new Scene(gridPane, 400, 200);
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
