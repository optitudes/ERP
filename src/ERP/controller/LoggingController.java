package ERP.controller;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import ERP.Main;
import ERP.model.TipoLogginEnum;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;


public class LoggingController implements Initializable{
	Main main;



	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private ComboBox<TipoLogginEnum> comboTipoLoggin;

	@FXML
    private PasswordField txtClaveLogin;

	@FXML
	private Button btnAccederLogin;

	@FXML
	private TextField txtCorreoLogin;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<TipoLogginEnum> listaTipos= FXCollections.observableArrayList() ;
		listaTipos.addAll(TipoLogginEnum.values());
		comboTipoLoggin.getItems().addAll(listaTipos);

	}


	public void setAplicacion(Main mainAux) {
		main= mainAux;
	}


	@FXML
	void accederAction(ActionEvent event) {
		if(comboTipoLoggin.getValue()!=null)
		{
			TipoLogginEnum tipoLog=comboTipoLoggin.getValue();
	
			switch(tipoLog)
			{
			case GERENTE:main.cargarVistaGerente();
						 break;
			case ADMINISTRADOR:main.cargarVistaAdministrador();
						 break;
			case PSICOLOGO:main.cargarVistaPsicologo();
						 break;
			case DIRECTOR_RECURSOS_HUMANOS :main.cargarVistaDirectorRecursosHumanos();
						break;
			case JEFE_FNB :main.cargarVistaJefeFNB();
						break;
			case JEFE_VENTAS_Y_CONSUMO :main.cargarVistaJefeVentasConsumo();
						break;
			case EMPLEADO_PROFESIONAL :main.cargarVistaEmpleadoProfesional();
						break;
			case JEFE_SERVICIO_AL_CLIENTE :main.cargarVistaJefeServicioCliente();
						break;
			case GESTOR_SERVICIO_CLIENTE :main.cargarVistaGestorServicioCliente();
						break;
			case AUXILAR_SAC :main.cargarVistaAuxiliarSac();
						break;
			case AUXILIAR_OPERACIONES_DOMICILIARIAS :main.cargarVistaAuxiliarOperacionesDomiciliarias();
						break;
			case PROFESIONAL_DE_FACTURACION :main.cargarVistaProfesionalFacturacion();
						break;
			case AUXILIAR_FACTURACION :main.cargarVistaAuxiliarFacturacion();
						break;
			case PROFESIONAL_NOMINA :main.cargarVistaProfesionalNomina();
						break;
			case COORDINADOR_SAC :main.cargarVistaCoordinadorSac();
						break;
			case JEFE_MANTENIMIENTO :main.cargarVistaJefeMantenimiento();
						break;
			case INGENIERO_GASODUCTO :main.cargarVistaIngenieroGasoducto();
						break;
			case AUXILIAR_GASODUCTO :main.cargarVistaAuxiliarGasoducto();
						break;
			case TECNICO_HARDWARE :main.cargarVistaTecnicoHardware();
						break;
			case TECNICO_SOFTWARE :main.cargarVistaTecnicoSoftware();
						break;
			case INGENIERO_SISTEMAS :main.cargarVistaIngenieroSistemas();
						break;
			case PLANEACION :main.cargarVistaPlaneacion();
						break;
			case GESTOR_CALL_CENTER :main.cargarVistaGestorCallCenter();
						break;
			
			}
			
		}else{
			mostrarMensaje("Error logging","tipo de acceso no seleccionado", ""
					+ "No se ha seleccionado un tipo de acceso...", AlertType.ERROR);
			
		}

	}

	private void limpiarLogging() {
		txtCorreoLogin.setText("");
		txtClaveLogin.setText("");

	}
	public void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {

		Alert alert = new Alert(alertType);
		alert.setTitle      (titulo);
		alert.setHeaderText (header);
		alert.setContentText(contenido);
		alert.showAndWait   ();
	}

}
