package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import observer.action.ExitAction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	private static final Logger	log	= LoggerFactory.getLogger(MainWindow.class);
	
	public MainWindow() {
		createAndShowGUI();
	}
	
	private void createAndShowGUI() {
		// Create and set up the window.
		setTitle("Fusicle - by Erik Stens");
		
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new MainWindowListener());
		
		setResizable(false);
		
		// Menu
		setJMenuBar(buildMenuBar());
		
		// Set up the content pane, where the "main GUI" lives.
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		
		// Create components
		
		// Set constraints
		GridBagConstraints gbc = new GridBagConstraints();
		
		// Adding components to the contentPane, which is then added to the frame
		
		add(contentPane);
		
		// set a minimum size for the window so the image panel is always visible
		setMinimumSize(new Dimension(320, 320));
		
		pack();
		
		// Ensure the start button always gets the first focus.
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent ce) {
				// startButton.requestFocusInWindow();
			}
		});
	}
	
	private JMenuBar buildMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		fileMenu.add(new JMenuItem(new ExitAction(this)));
		
		menuBar.add(fileMenu);
		
		return menuBar;
	}
	
	private class MainWindowListener extends WindowAdapter {
		public MainWindowListener() {}
		
		@Override
		public void windowClosing(WindowEvent e) {
			log.info("Exit");
			System.exit(0);
		}
	}
	
	public void saveImage(BufferedImage image, File file) {
		try {
			ImageIO.write(image, "png", file);
			log.info("Image saved");
		} catch (IOException e) {
			throw new RuntimeException("Image could not be saved!");
		}
	}
}
