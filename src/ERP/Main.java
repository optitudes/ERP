package ERP;

import java.io.IOException;

import ERP.controller.AdminController;
import ERP.controller.AuxiliarFacturacionController;
import ERP.controller.AuxiliarGasoductoController;
import ERP.controller.AuxiliarOpDomiciliarias;
import ERP.controller.AuxiliarSacController;
import ERP.controller.CoordinadorSACController;
import ERP.controller.EmpleadoProfesionalController;
import ERP.controller.GerenteController;
import ERP.controller.GestorCallCenterController;
import ERP.controller.GestorServicioClienteController;
import ERP.controller.IngenieroGasoductoController;
import ERP.controller.IngenieroSistemasController;
import ERP.controller.JefeFNBController;
import ERP.controller.JefeMantenimientoController;
import ERP.controller.JefeServicioClienteController;
import ERP.controller.JefeVentasConsumoController;
import ERP.controller.LoggingController;
import ERP.controller.PlaneacionController;
import ERP.controller.ProfesionalFacturacionController;
import ERP.controller.ProfesionalNominaController;
import ERP.controller.PsicologoController;
import ERP.controller.RecursosHumanosController;
import ERP.controller.TecnicoHardwareController;
import ERP.controller.TecnicoSoftwareController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {

		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Efigas");
			mostrarVentanaLogging();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	public void mostrarVentanaLogging() {

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/loggingView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			LoggingController loggingController = loader.getController();
			loggingController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	public void cargarVistaGerente() {
	
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/gerenteView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			GerenteController gerenteController = loader.getController();
			gerenteController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargarVistaAdministrador() {
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/administradorView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			AdminController adminController = loader.getController();
			adminController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargarVistaPsicologo() {
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/psicologoView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			PsicologoController psicologoController = loader.getController();
			psicologoController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargarVistaDirectorRecursosHumanos() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/directorRecursosHumanosView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			RecursosHumanosController recursosHumanosController = loader.getController();
			recursosHumanosController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargarVistaJefeFNB() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/jefeFNBView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			JefeFNBController jefeFNBController = loader.getController();
			jefeFNBController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargarVistaJefeVentasConsumo() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/jefeVentasConsumoView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			JefeVentasConsumoController jefeVentasConsumoController = loader.getController();
			jefeVentasConsumoController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargarVistaEmpleadoProfesional() {
			try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/empleadoProfesionalView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			EmpleadoProfesionalController empleadoProfesionalController = loader.getController();
			empleadoProfesionalController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cargarVistaJefeServicioCliente() {
	try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/jefeServicioAlClienteView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			JefeServicioClienteController jefeServicioClienteController = loader.getController();
			jefeServicioClienteController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargarVistaGestorServicioCliente() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/gestorServicioClienteView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			GestorServicioClienteController gestorServicioClienteController = loader.getController();
			gestorServicioClienteController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cargarVistaAuxiliarSac() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/auxiliarSac.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			AuxiliarSacController auxiliarSacController = loader.getController();
			auxiliarSacController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargarVistaAuxiliarOperacionesDomiciliarias() {
	try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/auxiliarOperacionesDomiciliariasView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			AuxiliarOpDomiciliarias auxiliarOpDomiciliarias = loader.getController();
			auxiliarOpDomiciliarias.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void cargarVistaProfesionalFacturacion() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/profesionalFacturacionView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			ProfesionalFacturacionController profesionalFacturacionController = loader.getController();
			profesionalFacturacionController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void cargarVistaAuxiliarFacturacion() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/auxiliarFacturacion.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			AuxiliarFacturacionController auxiliarFacturacionController = loader.getController();
			auxiliarFacturacionController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
}

	public void cargarVistaProfesionalNomina() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/profesionalNominaView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			ProfesionalNominaController profesionalNominaController = loader.getController();
			profesionalNominaController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
		
	}

	public void cargarVistaCoordinadorSac() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/coordinadorView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			CoordinadorSACController coordinadorSACControler = loader.getController();
			coordinadorSACControler.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
		
	}

	public void cargarVistaJefeMantenimiento() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/jefeMantenimientoView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			JefeMantenimientoController jefeMantenimientoController = loader.getController();
			jefeMantenimientoController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
		
	}

	public void cargarVistaIngenieroGasoducto() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/ingenieroGasoductoView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			IngenieroGasoductoController ingenieroGasoductoController = loader.getController();
			ingenieroGasoductoController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	}

	public void cargarVistaAuxiliarGasoducto() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/auxiliarGasoductoView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			AuxiliarGasoductoController auxiliarGasoductoController = loader.getController();
			auxiliarGasoductoController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

	public void cargarVistaTecnicoHardware() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/tecnicoHardwareView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			TecnicoHardwareController tecnicoHardwareController = loader.getController();
			tecnicoHardwareController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

	public void cargarVistaTecnicoSoftware() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/tecnicoSistemas.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			TecnicoSoftwareController tecnicoSoftware = loader.getController();
			tecnicoSoftware.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

	public void cargarVistaIngenieroSistemas() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/ingenieroSistemasView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			IngenieroSistemasController ingenieroSistemasController = loader.getController();
			ingenieroSistemasController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

	public void cargarVistaPlaneacion() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/planeacionView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			PlaneacionController planeacionController = loader.getController();
			planeacionController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

	public void cargarVistaGestorCallCenter() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/gestorCallCenterView.fxml"));

			BorderPane rootLayout = (BorderPane)loader.load();
			GestorCallCenterController gestorCallCenterController = loader.getController();
			gestorCallCenterController.setAplicacion(this);
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}
}
