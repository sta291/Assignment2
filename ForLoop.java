import javax.swing.JOptionPane;
public class ForLoop {

	public static void main(String[] args) {
        String U, P;
		
		U = JOptionPane.showInputDialog("Enter Username :");
		P = JOptionPane.showInputDialog("Enter Password :");
		for (int i = 0; i < 3; i++ ){
			if(U .equals("sta) && P.equals("505")){
				JOptionPane.showMessageDialog(null, "Welcome " + U);
				i +=3;
			}
			else{
				U = JOptionPane.showInputDialog("Enter Username :");
				P = JOptionPane.showInputDialog("Enter Password :");
				i = i +1;
				
			}
		
		}
		if (!U .equals("sta") || !P .equals("505")) {
		JOptionPane.showMessageDialog(null, "Please contact your administrator to unlock your account!");
		}
	
	}
}
