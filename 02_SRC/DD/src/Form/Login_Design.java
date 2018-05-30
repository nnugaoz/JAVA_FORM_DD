package Form;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Login_Design {

	public JDialog Dig_Login=null;
	
	public void InitialComponent() {
		
		Dig_Login = new JDialog();
		
		Image icon = null;
		try {
			icon = ImageIO.read(getClass().getResource("../Resource/DDIcon.png"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}		
		Dig_Login.setIconImage(icon);
		Dig_Login.setTitle("µÇÂ¼µ½DD");

		Dig_Login.setSize(300, 500);
		Dig_Login.setLocationRelativeTo(null);
		Dig_Login.setVisible(true);
		Dig_Login.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
