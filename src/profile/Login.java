package profile;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/profile/Login")
public class Login extends HttpServlet {

	@PersistenceUnit(unitName = "betmanager")
	private EntityManagerFactory emFactory;

	public Login() {
		super();
	}

}
