package gui.testGenerator;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JPanel;

import dataModels.electric.projects.ProjectManagement;

/**
 * This Dialog holds the panel for the test creation process
 * @author CSCHulze
 *
 */
public class TestCaseGenerator extends JDialog {
	
	private JPanel contentPane;

	public TestCaseGenerator(ProjectManagement projectManagement) {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		
		contentPane = new TestGeneratorPanel(projectManagement);
		//contentPane.setSize(projectManagement.)
		Dimension dimension = contentPane.getPreferredSize();
		
		setBounds(100, 100, dimension.width, dimension.height);
		
		setContentPane(contentPane);
	}

	public void showDialog() {
		setVisible(true);
	}
	
}
