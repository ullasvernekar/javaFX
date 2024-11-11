module com.ot.percentage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ot.javaFx to javafx.fxml;
    exports com.ot.javaFx;
}