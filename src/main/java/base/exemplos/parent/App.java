package base.exemplos.parent;

import java.net.URL;

import base.utils.BaseAppNavigator;
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
   

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryNoFXML(o->new JanelaPrincipal().getRoot()));
        registraTela("TELA1", new ScreenRegistryNoFXML(o->new Tela1().getRoot()));
        registraTela("TELA2", new ScreenRegistryNoFXML(o->new Tela2().getRoot()));
    
    }



}
