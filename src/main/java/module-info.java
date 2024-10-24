module org.calculadora.calculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.calculadora.calculadora to javafx.fxml;
    exports org.calculadora.calculadora;
}