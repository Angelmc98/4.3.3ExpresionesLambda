/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionlambda;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Ángel Medina Cantos
 */
public class ExpresionLambda extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Creamos el layout 
        GridPane gridpane = new GridPane();
        Scene scene = new Scene(gridpane, 300, 250);
        
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setVgap(10); // Para que tengan espacio entre ellos
        
        // Creamos los Label y los TextField
        
        /* ANUAL INSTEREST RATE */
        Label label1 = new Label("Annual Interest Rate: ");
        TextField texto1 = new TextField();
        gridpane.add(label1,1,0);// añadimos al gridpane el label en esa posicion
        gridpane.add(texto1,2,0);// añadimos la gridpane el TextLabel en esa posicion
       
        
        /* NUMBER OF YEARS*/
        Label label2 = new Label("Number of years: ");
        TextField texto2 = new TextField();
        gridpane.add(label2,1,1 );
        gridpane.add(texto2,2,1);
        
        
        /*LOAN AMOUNT*/
        Label label3 = new Label("Loan Amount: ");
        TextField texto3 = new TextField();
        gridpane.add(label3, 1, 2);
        gridpane.add(texto3, 2,2);
        
        
        /*MONTHLY PAYMENT*/
        Label label4 = new Label("Monthly payment: ");
        TextField texto4 = new TextField();
        gridpane.add(label4, 1,3);
        gridpane.add(texto4, 2,3);
        
        
        /*TOTAL PAYMENT*/
        Label label5 = new Label("Total payment: ");
        TextField texto5 = new TextField();
        gridpane.add(label5,1,4);
        gridpane.add(texto5,2,4);
        
        
        
        /* Creamos el boton y lo añadimos al gridpane */
        Button button = new Button();
        button.setText("Calculate");
        gridpane.add(button,3,6); // Posicionamos el boton
        
        
        // Expresion Lambda
        button.setOnAction(e -> {
            Double i = Double.parseDouble(texto1.getText()); // Devuelve un double
            Double n = Double.parseDouble(texto2.getText()); // Devuelve un double
            Double h = Double.parseDouble(texto3.getText()); // Devuelve un double
            Double m;
            double r;
            
            r = i/(100 * 12); // Ecuacion que da el ejercicio
            double m1 = Math.pow((1+r), (-12*n)); //Metodo para poder elevar
       
            m = (h*r)/(1-m1);
            texto4.setText(m.toString()); // Para convertir la variable M a String
            
            Double j = m * 12 * n;
            j = Math.round(j*100.0)/100.0; // Para que redondee a dos decimales
            texto5.setText(j.toString()); // Para convertir la variable J a String
           
        });
 
        primaryStage.setTitle(" Expresion Lambda");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
