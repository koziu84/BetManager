package manager;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

@WebServlet("/manager/AddTeam")
public class AddTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@PersistenceUnit(unitName = "betmanager")
	private EntityManagerFactory emFactory;

	public AddTeam() {
		super();

	}

	@Override
	protected void doPost(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException,
			IOException {

		final String name = request.getParameter("name");
		final String level = request.getParameter("level");
		final String league = request.getParameter("league");
		final String fixture = request.getParameter("fixture");

		if (StringUtils.isBlank(name) || StringUtils.isBlank(level)
				|| StringUtils.isBlank(league) || StringUtils.isBlank(fixture)) {

			System.out.println("Wypełnij wszystkie pola!");
			response.sendRedirect("./index.jsp");
			return;

		}

		EntityManager em = null;

		try {
			em = emFactory.createEntityManager();
			em.getTransaction().begin();

			final Team team = new Team();

			team.setName(name);
			team.setLevel(level);
			team.setLeague(league);
			team.setFixture(fixture);
			em.persist(team);

			System.out.println("Dodano drużynę!");

			em.getTransaction().commit();

		} catch (final Throwable t) {

			t.printStackTrace(System.err);

		} finally {

			if (em != null) {
				em.close();
			}

		}

		response.sendRedirect("./index.jsp");

	}
}
