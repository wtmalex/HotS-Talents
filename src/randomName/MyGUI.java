package randomName;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MyGUI extends Application implements Initializable {

	private static String buttonId = null; // would go back to null after an
											// Event

	@FXML
	private Stage theStage;
	@FXML
	private Scene scene1, scene2, scene3, scene4, scene5, scene6, scene7, scene8, scene9, scene10, scene11;

	@FXML
	private ImageView ImageAbilitiesQ;
	private TextArea TextAbilitiesQ;

	@FXML
	private Button buttonStats, buttonAbilities, buttonLevel1, buttonLevel4, buttonLevel7, buttonLevel10, buttonLevel13,
			buttonLevel16, buttonLevel20, buttonBack;

	// @FXML
	// private AnchorPane GuiAnchor, AsdasdAnchor;

	/*
	 * @FXML private ListView<String> heroNames; ObservableList<String> names =
	 * FXCollections.observableArrayList("Abathur", "Alarak", "Anub'arak",
	 * "Artanis", "Arthas", "Auriel", "Azmodan", "Brightwing", "Chen", "Cho",
	 * "Chromie", "Dehaka", "Diablo", "E.T.C.", "Falstad", "Gall", "Gazlowe",
	 * "Greymane", "Gul'Dan", "Illidan", "Jaina", "Johanna", "Kael'thas",
	 * "Kerrigan", "Kharazim", "Leoric", "Li Li", "Li-Ming", "Lt. Morales",
	 * "Lunara", "Malfurion", "Medivh", "Muradin", "Murky", "Nazeboo", "Nova",
	 * "Raynor", "Reghar", "Rexxar", "Sgt. Hammer", "Sonya", "Stitches",
	 * "Sylvanas", "Tassadar", "The Butcher", "The Lost Vikings", "Thrall",
	 * "Tracer", "Tychus", "Tyrael", "Tyrande", "Uther", "Valla", "Xul",
	 * "Zagara", "Zarya", "Zeratul");
	 */

	@FXML
	ObservableList<String> buttons = FXCollections.observableArrayList("button00", "button01", "button02", "button03",
			"button04", "button05", "button06", "button07", "button08", "button10", "button11", "button12", "button13",
			"button14", "button15", "button16", "button17", "button18", "button20", "button21", "button22", "button23",
			"button24", "button25", "button26", "button27", "button28", "button30", "button31", "button32", "button33",
			"button34", "button35", "button36", "button37", "button38", "button40", "button41", "button42", "button43",
			"button44", "button45", "button46", "button47", "button48", "button50", "button51", "button52", "button53",
			"button54", "button55", "button56", "button57", "button58", "button60", "button61", "button62", "button63",
			"button64", "button65", "button66", "button67", "button68");

	public MyGUI() {
		// TODO Auto-generated constructor stub
		// System.out.println("MyGUI Constructor!!!" + buttonId + "\n");
	}

	@Override
	public void start(Stage stage) throws Exception {
		theStage = stage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("HotS_UI.fxml"));
		Parent root = (Parent) loader.load();
		scene1 = new Scene(root, 900, 700);

		System.out.println("asd"); // I NEED FOR BECAUSE OF REASONS FFS

		stage.setScene(scene1);
		stage.setResizable(false);
		stage.show();

	} // mouseTransparent="true" for SplitPane

	public void ButtonClicked(ActionEvent e) throws Exception {
		// TODO: fixIDs for everything, + create the FXML files
		buttonId = ((Node) e.getSource()).getId();
		System.out.println(buttonId);
		
		// From the default UI to the Abilities
		if (buttons.contains(((Button) e.getSource()).getId())) {
			System.out.print("Currently in Abilities_UI with " + ((Button) e.getSource()).getId() + " ButtonClicked\n");
			WindowInit(scene2, e, "Abilities_UI.fxml", buttonId);

			// Back to Default UI
		} else if (e.getSource() == buttonBack) {
			System.out.print("Currently in HotS_UI with " + ((Button) e.getSource()).getId() + " ButtonClicked\n");
			WindowInit(scene1, e, "HotS_UI.fxml", buttonId);
		}
	}

	public void SwitchLevel(ActionEvent e) throws Exception {
		// TODO: If you click on a button that would bring you to your current
		// location, you get an IllegalStateException.
		// Prolly Solution ->Prevent return to own

		// To Stats
		if (e.getSource() == buttonStats) {
			System.out.print("Currently in Level 20 with " + ((Button) e.getSource()).getId() + " SwitchLevel\n");
			WindowInit(scene3, e, "Stats_UI.fxml", buttonId);

			// To Abilities
		} else if (e.getSource() == buttonAbilities) {
			System.out.print("Currently in Abilites with " + ((Button) e.getSource()).getId() + " SwitchLevel\n");
			WindowInit(scene2, e, "Abilities_UI.fxml", buttonId);

		} else if (e.getSource() == buttonLevel1) {
			System.out.print("Currently in Level 1 with " + ((Button) e.getSource()).getId() + " SwitchLevel\n");
			WindowInit(scene4, e, "Level1_UI.fxml", buttonId);

			// To Level 4 Talents
		} else if (e.getSource() == buttonLevel4) {
			System.out.print("Currently in Level 4 with " + ((Button) e.getSource()).getId() + " SwitchLevel\n");
			WindowInit(scene5, e, "Level4_UI.fxml", buttonId);

			// To Level 7 Talents
		} else if (e.getSource() == buttonLevel7) {
			System.out.print("Currently in Level 7 with " + ((Button) e.getSource()).getId() + " SwitchLevel\n");
			WindowInit(scene6, e, "Level7_UI.fxml", buttonId);

			// To Level 10 Talents
		} else if (e.getSource() == buttonLevel10) {
			System.out.print("Currently in Level 10 with " + ((Button) e.getSource()).getId() + " SwitchLevel\n");
			WindowInit(scene7, e, "Level10_UI.fxml", buttonId);

			// To Level 13 Talents
		} else if (e.getSource() == buttonLevel13) {
			System.out.print("Currently in Level 13 with " + ((Button) e.getSource()).getId() + " SwitchLevel\n");
			WindowInit(scene8, e, "Level13_UI.fxml", buttonId);

			// To Level 16 Talents
		} else if (e.getSource() == buttonLevel16) {
			System.out.print("Currently in Level 16 with " + ((Button) e.getSource()).getId() + " SwitchLevel\n");
			WindowInit(scene9, e, "Level16_UI.fxml", buttonId);

			// To Level 20 Talents
		} else if (e.getSource() == buttonLevel20) {
			System.out.print("Currently in Level 20 with " + ((Button) e.getSource()).getId() + " SwitchLevel\n");
			WindowInit(scene10, e, "Level20_UI.fxml", buttonId);
		}

	}

	public void startThisShit(String[] args) {
		Application.launch(args);
	}

	public void WindowInit(Scene newscene, ActionEvent e, String newWindow, String MenuButtonId) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(newWindow));
			// System.out.println(loader.getNamespace());
			loader.getNamespace().put("Q", "first");
			loader.getNamespace().put("W", "sec");
			loader.getNamespace().put("E", "third");
			loader.getNamespace().put("R1", "forth");
			loader.getNamespace().put("R2", "fifht");

			loader.getNamespace().put("Symbiote_Icon", "Carapace_Icon.png");
			// <Image url="$Symbiote_Icon" />
			System.out.println("WindowInit loader name: " + loader.toString() + " as " + newWindow);
			//System.err.println("FXML resource: " + MyGUI.class.getResource(newWindow));
			Parent root = (Parent) loader.load();
			newscene = new Scene(root, 900, 700);

			Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			app_stage.setScene(newscene);

		} catch (Exception exception) {
			System.out.println("ERROR IN WindowInit!!!!!");
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
}

/*
 * try (FileInputStream file = new FileInputStream("Symbiote_Icon.png")) { Image
 * image = new Image(file); System.out.println(image.toString() + "  " +
 * image.getHeight() + " " + image.getWidth() + " " + image.errorProperty());
 * Thread.sleep(1000); ImageAbilitiesQ.setImage(image); } catch
 * (NullPointerException innerException) {
 * System.out.println(innerException.getMessage());
 * innerException.printStackTrace(); }
 */
// TextAbilitiesQ.setText("OMG ITS NOT WORKING");
