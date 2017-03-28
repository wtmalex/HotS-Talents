package randomName;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MainClass_old {
	
	JFrame frame;
	JPanel panelList, panelTextArea, panelButton;
	JList<String> list;				//Generic solution (gave warning without it)
	ListSelectionModel listSelectionModel;
	JTextArea one;
	JButton st,ab,lvl1,lvl4,lvl7,lvl10,lvl13,lvl16,lvl20,ex;


	public void run() {//TODO: mini icons for heroes, prolly from http://www.heroesnexus.com/heroes
		
		frame = new JFrame();
		panelList = new JPanel();	//Panel for JList
		panelTextArea = new JPanel();
		panelButton = new JPanel();
		
		//JLIST PART
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
		panelList.add(scroller);
		list.setVisibleRowCount(40);			//for the lenght of the JList
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
		      public void valueChanged(ListSelectionEvent evt) {
		        if (evt.getValueIsAdjusting())
		          return;
		        System.out.println("Selected:" + list.getSelectedValue());
		        readAndStore(list.getSelectedValue());
		      }
		    });
		
		
		
		//JTEXTAREA PART
		one = new JTextArea(5,20);					//talentek ki�r�sa, 
		one.setLineWrap(true);						//WordWrap on
		one.setEditable(false);
		
		panelTextArea.add(one);						//add to Panel
		panelTextArea.setLayout(new BoxLayout(panelTextArea, BoxLayout.Y_AXIS));

		
		
		//JBUTTONS PART
		st = new JButton("Stats");
		ab = new JButton("Abilities");
		lvl1 = new JButton("Lvl 1");
		lvl4 = new JButton("Lvl 4");
		lvl7 = new JButton("lvl 7");
		lvl10 = new JButton("lvl 10");
		lvl13 = new JButton("lvl 13");
		lvl16 = new JButton("lvl 16");
		lvl20 = new JButton("lvl 20");
		ex = new JButton("Extra");
		
		panelButton.add(st);
		panelButton.add(ab);
		panelButton.add(lvl1);
		panelButton.add(lvl4);
		panelButton.add(lvl7);
		panelButton.add(lvl10);
		panelButton.add(lvl13);
		panelButton.add(lvl16);
		panelButton.add(lvl20);
		panelButton.add(ex);
		panelButton.setLayout(new BoxLayout(panelButton, BoxLayout.X_AXIS));
		
		st.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				one.append("CLICKED ST");		//TODO: Append Strings from Hero object
				
			}
		});
		
		
		//FRAME PART
		frame.getContentPane().add(BorderLayout.WEST, panelList);
		frame.getContentPane().add(BorderLayout.NORTH, panelButton);
		frame.getContentPane().add(BorderLayout.CENTER, panelTextArea);
		
		frame.setSize(1024,768);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void readAndStore(String heroName) {
		String test = "TXT\\" + heroName + ".txt";
		System.out.println(test);
		
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
		System.out.println(hero.getLevel_1_talents());
		System.out.println(hero.getLevel_4_talents());
		System.out.println(hero.getLevel_7_talents());
		System.out.println(hero.getLevel_10_talents());
		System.out.println(hero.getLevel_13_talents());
		System.out.println(hero.getLevel_16_talents());
		System.out.println(hero.getLevel_20_talents());
		System.out.println(hero.getExtra());	//TODO:if-et rakni ide, hogy az Extra n�lk�li hero ne adjon null-t
	}
	
	
/*	public static void main(String[] args) { 
		MainClass_old mainClass = new MainClass_old();
		mainClass.run();						//the usual run()

	} */
}
