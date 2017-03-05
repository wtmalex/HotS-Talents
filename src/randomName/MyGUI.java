package randomName;

import java.io.File;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import randomName.MainClass;

public class MyGUI{

	@FXML
	private AnchorPane mainAnchorPane;
	@FXML
	private Button myButton;

	@FXML
	private TextArea textArea1;
	@FXML
	private TextArea textArea2;
	@FXML
	private TextArea textArea3;
	

	@FXML
	private ListView<String> heroNames;
	ObservableList<String> names = FXCollections.observableArrayList("Abathur", "Alarak", "Anub'arak", "Artanis", "Arthas", "Auriel", "Azmodan", "Brightwing", "Chen",
			"Cho", "Chromie", "Dehaka", "Diablo", "E.T.C.", "Falstad", "Gall", "Gazlowe", "Greymane", "Gul'Dan",
			"Illidan", "Jaina", "Johanna", "Kael'thas", "Kerrigan", "Kharazim", "Leoric", "Li Li", "Li-Ming",
			"Lt. Morales", "Lunara", "Malfurion", "Medivh", "Muradin", "Murky", "Nazeboo", "Nova", "Raynor",
			"Reghar", "Rexxar", "Sgt. Hammer", "Sonya", "Stitches", "Sylvanas", "Tassadar", "The Butcher",
			"The Lost Vikings", "Thrall", "Tracer", "Tychus", "Tyrael", "Tyrande", "Uther", "Valla", "Xul",
			"Zagara", "Zarya", "Zeratul");
	
	@FXML
	private ImageView image1;
	@FXML
	private ImageView image2;
	@FXML
	private ImageView image3;
	
	MainClass asd = new MainClass();
	
	//BufferedImage readimg = ImageIO.read(new File("JPG\\storm_ui_icon_abathur_stab.jpg"));
	File readimg = new File("JPG\\storm_ui_icon_abathur_stab.jpg");
	Image img = new Image(readimg.toURI().toString());

	@FXML
	public void handleButtonAction(ActionEvent event) {	//TODO: append problem, need clear
		// Button was clicked, do something...
		System.out.println("IM IN BUTTONEVENT");
		textArea1.appendText(asd.readTestText("Abathur_abilities"));
		textArea2.appendText(asd.readTestText("Abathur_abilities"));
		textArea3.appendText(asd.readTestText("Abathur_abilities"));
		image1.setImage(img);
	}

	@FXML
    public void initialize() {
        ObservableList<String> items = heroNames.getItems();
        items.addAll(names);
	}
}
