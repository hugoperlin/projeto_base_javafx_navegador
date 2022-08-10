package base.exemplos.fxml;

import java.net.URL;

import base.utils.BaseAppNavigator;
import base.utils.ScreenRegistryFXML;
import base.utils.ScreenRegistryNoFXML;
import javafx.scene.Parent;

public class App extends BaseAppNavigator{



    @Override
    public String getHome() {
        return "PRINCIPAL";
    }



    @Override
    public String getAppTitle() {
        return "Teste";
    }



    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryFXML(App.class,"telas/principal.fxml",o->new JanelaPrincipal()));
        registraTela("PARTE1", new ScreenRegistryFXML(App.class,"telas/parte1.fxml",o->new Parte1()));
        registraTela("PARTE2", new ScreenRegistryFXML(App.class,"telas/parte2.fxml",o->new Parte2()));
        registraTela("TELA1", new ScreenRegistryFXML(App.class,"telas/tela1.fxml",o->new Tela1()));
    
        
    }


    
}
