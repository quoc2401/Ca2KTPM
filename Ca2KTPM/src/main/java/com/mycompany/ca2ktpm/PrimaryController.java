package com.mycompany.ca2ktpm;

import java.io.IOException;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    private void checkHandler(EventHandler event) {
        
    }
}
