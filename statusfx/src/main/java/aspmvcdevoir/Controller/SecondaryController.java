package aspmvcdevoir.Controller;

import java.io.IOException;

import aspmvcdevoir.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}