package base.exemplos.fxml;


import base.utils.BorderPaneRegion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class JanelaPrincipal {
    

    @FXML
    private void mostraParte1(ActionEvent evt){
        App.changeScreenRegion("PARTE1", BorderPaneRegion.CENTER);
    }

    @FXML
    private void mostraParte2(ActionEvent evt){
        App.changeScreenRegion("PARTE2", BorderPaneRegion.CENTER);
    }

    @FXML
    private void mostraTela1(ActionEvent evt){
        App.pushScreen("TELA1");
    }


}
