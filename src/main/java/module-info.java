module com.halil.otogarvt {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.halil.otogarvt to javafx.fxml;
    exports com.halil.otogarvt;
    exports databaseConnector;
    opens databaseConnector to javafx.fxml;
}