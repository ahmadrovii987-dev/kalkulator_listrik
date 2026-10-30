module kalkulator_listrik {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens kalkulator_listrik to javafx.fxml;
    exports kalkulator_listrik;
}
