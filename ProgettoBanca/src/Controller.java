import it.unipv.pois.ProgettoBanca.model.Banca;
import it.unipv.pois.ProgettoBanca.view.MainFrame;

public class Controller {
	private Banca b;
	private MainFrame f;
	
	public Controller(Banca b, MainFrame f) {
		super();
		this.b = b;
		this.f = f;
		addListeners();
	}
	
	public void addListeners() {
		
	}
	
	
}
