package randomName;

import java.awt.BorderLayout; 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MainClass {
	
	JList<String> list;				//Generic solution (gave warning without it)
	ListSelectionModel listSelectionModel;

	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		mainClass.run();						//the usual run()

	}

	public void run() {//TODO: mini icons for heroes, prolly from http://www.heroesnexus.com/heroes

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a hero name: ");

		String temp = scanner.nextLine();	//Read a line from terminal
		String test = "TXT\\" + temp + ".txt";
		scanner.close();
		
		JFrame frame = new JFrame();
		JPanel panelList = new JPanel();	//Panel for JList
		JPanel panelTextArea = new JPanel();
		
		String[] listEntries = {"Abathur", "Alarak", "Anub'arak", "Artanis", "Arthas", "Auriel", "Azmodan", "Brightwing", "Chen",
								"Cho", "Chromie", "Dehaka", "Diablo", "E.T.C.", "Falstad", "Gall", "Gazlowe", "Greymane", "Gul'Dan",
								"Illidan", "Jaina", "Johanna", "Kael'thas", "Kerrigan", "Kharazim", "Leoric", "Li Li", "Li-Ming",
								"Lt. Morales", "Lunara", "Malfurion", "Medivh", "Muradin", "Murky", "Nazeboo", "Nova", "Raynor",
								"Reghar", "Rexxar", "Sgt. Hammer", "Sonya", "Stitches", "Sylvanas", "Tassadar", "The Butcher",
								"The Lost Vikings", "Thrall", "Tracer", "Tychus", "Tyrael", "Tyrande", "Uther", "Valla", "Xul",
								"Zagara", "Zarya", "Zeratul"};		//for JList
		list = new JList<String>(listEntries);
		JScrollPane scroller = new JScrollPane(list);	//Scrollbar, only Vertical
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		/*Dimension d = list.getPreferredSize();	//for the width of the JList
		d.width = 200;								//problematic, scrollbar breaks
		scroller.setPreferredSize(d);*/				//prolly d nélkül majd, simán int-el (int1, int2)	
		panelList.add(scroller);
		list.setVisibleRowCount(40);			//for the lenght of the JList
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		/*listSelectionModel = list.getSelectionModel();
		listSelectionModel.addListSelectionListener(new SharedListSelectionHandler()); */
		list.addListSelectionListener(new ListSelectionListener() {
		      public void valueChanged(ListSelectionEvent evt) {
		        if (evt.getValueIsAdjusting())
		          return;
		        //System.out.println("Selected from " + evt.getFirstIndex() + " to " + evt.getLastIndex());
		        System.out.println("Selected:" + list.getSelectedValue());
		      }
		    });
		
		JTextArea one = new JTextArea(5,20);		//talentek kiírása, 
		//JTextArea two = new JTextArea(5,20);
		//JTextArea three = new JTextArea(5,20);
		//JTextArea four = new JTextArea(5,20);
		one.setLineWrap(true);						//WordWrap on
		//two.setLineWrap(true);
		//three.setLineWrap(true);
		//four.setLineWrap(true);
		
		panelTextArea.add(one);						//add to Panel
		//panelTextArea.add(two);
		//panelTextArea.add(three);
		//panelTextArea.add(four);
		panelTextArea.setLayout(new BoxLayout(panelTextArea, BoxLayout.Y_AXIS));
		
		frame.getContentPane().add(BorderLayout.WEST, panelList);
		frame.getContentPane().add(BorderLayout.CENTER, panelTextArea);
		
		frame.setSize(1024,768);
		frame.setVisible(true);
		
		
		
		
		
		Hero hero = new Hero();				//Creating new Hero object

		try {
			File myFile = new File(test);
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);	//"Connecting" to the TXT file

			while (true) { //Read X lines, store it in line, and set to Hero object
				
				String line = "Stats:\n";
				for (int i = 0; i < 7; i++) {
					line += reader.readLine() + "\n";
				}
				hero.setStats(line);
				
				line = "Abilities:\n";
				for (int i = 0; i < 6; i++) {
					line +=reader.readLine() + "\n";
				}
				hero.setAbilities(line);
				
				line = "Level 1:\n";
				for (int i = 0; i < 4; i++) {
					line +=reader.readLine() + "\n";
				}
				hero.setLevel_1_talents(line);
			
				line = "Level 4:\n";
				for (int i = 0; i < 4; i++) {
					line +=reader.readLine() + "\n";
				}
				hero.setLevel_4_talents(line);
				
				line = "Level 7:\n";
				for (int i = 0; i < 4; i++) {
					line +=reader.readLine() + "\n";
				}
				hero.setLevel_7_talents(line);
				
				line = "Level 10:\n";
				for (int i = 0; i < 2; i++) {
					line +=reader.readLine() + "\n";
				}
				hero.setLevel_10_talents(line);
				
				line = "Level 13:\n";
				for (int i = 0; i < 4; i++) {
					line +=reader.readLine() + "\n";
				}
				hero.setLevel_13_talents(line);
				
				line = "Level 16:\n";
				for (int i = 0; i < 4; i++) {
					line +=reader.readLine() + "\n";
				}
				hero.setLevel_16_talents(line);
				
				line = "Level 20:\n";
				for (int i = 0; i < 4; i++) {
					line +=reader.readLine() + "\n";
				}
				hero.setLevel_20_talents(line);
				
				line = "Extra:\n";
				for (int i = 0; i < 3; i++) {
					line +=reader.readLine() + "\n";
				}
				hero.setExtra(line);
			
				reader.close();
				break;
			}
		} catch (Exception e) {
			System.out.println("RIP FAGIT");
			e.printStackTrace();
		}
		System.out.println(hero.getStats());
		one.append(hero.getStats());
		System.out.println(hero.getAbilities());
		//two.append(hero.getAbilities());
		System.out.println(hero.getLevel_1_talents());
		System.out.println(hero.getLevel_4_talents());
		System.out.println(hero.getLevel_7_talents());
		System.out.println(hero.getLevel_10_talents());
		System.out.println(hero.getLevel_13_talents());
		System.out.println(hero.getLevel_16_talents());
		System.out.println(hero.getLevel_20_talents());
		System.out.println(hero.getExtra());	//TODO:if-et rakni ide, hogy az Extra nélküli hero ne adjon null-t
	}
	/*
	public void valueChanged(ListSelectionEvent lse) {
		if(!lse.getValueIsAdjusting()) {
			String selection = (String) list.getSelectedValue();
			System.out.println(selection);
		}
	}
	*/
	
	/*
	 * public void go() { JFrame frame = new JFrame(
	 * "Heroes of the Storm Talent Builder"); BorderLayout layout = new
	 * BorderLayout(); //JPanel mainPanel = new JPanel(layout);
	 * 
	 * 
	 * ImageIcon image = new ImageIcon("JPG\\Heroes_of_the_Storm_logo.png");
	 * JLabel label = new JLabel("", image, JLabel.CENTER);
	 * //mainPanel.add(BorderLayout.NORTH, label);
	 * //logo.getContentPane().add(new
	 * JPanelWithBackGround("JPG\\Heroes_of_the_Storm_logo.jpg"));
	 * //mainPanel.add(BorderLayout.NORTH, logo);
	 * 
	 * //JPanelPicture logo = new JPanelPicture();
	 * 
	 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * frame.getContentPane().add(new
	 * JPanelWithBackGround("JPG\\background.jpg"));
	 * frame.getContentPane().add(BorderLayout.NORTH, label);
	 * frame.setSize(1200, 675); frame.setVisible(true);
	 * 
	 * }
	 * 
	 * public class JPanelWithBackGround extends JPanel {
	 * 
	 * private Image backgroundImage;
	 * 
	 * public JPanelWithBackGround(String fileName){ try { backgroundImage =
	 * ImageIO.read(new File(fileName)); } catch (IOException e)
	 * {e.printStackTrace();} } public void paintComponent(Graphics g) {
	 * g.drawImage(backgroundImage, 0, 0, this); } }
	 * 
	 * public class JPanelPicture extends JPanel { public void
	 * paintComponent(Graphics g) { Image image = new
	 * ImageIcon("JPG\\Heroes_of_the_Storm_logo.png").getImage();
	 * g.drawImage(image, 100, 50, this); } }
	 */
}
