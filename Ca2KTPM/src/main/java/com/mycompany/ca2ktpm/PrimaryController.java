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
<<<<<<< HEAD
        String a = "sub test";
=======
        String a = "test conflict main";
>>>>>>> 27c64e9a7e2562b853cfb62075cc9092e5c66d94
    }
}
