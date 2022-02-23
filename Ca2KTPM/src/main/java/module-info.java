module com.mycompany.ca2ktpm {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ca2ktpm to javafx.fxml;
    exports com.mycompany.ca2ktpm;
}
