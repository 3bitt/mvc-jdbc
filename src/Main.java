import java.awt.EventQueue;

import controller.Controller;
import dao.SqliteObjectDAO;
import daoRepo.Repository;
import view.View;

public class Main {	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {					
					View frame = new View();					
					Repository model = new Repository();
					Controller controller = new Controller(frame, model);
					frame.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}
}
