package manager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TEAMS_SEQ")
	@SequenceGenerator(name = "TEAMS_SEQ", initialValue = 1)
	private long id;

	@Column(unique = true)
	private String name;

	private String level;

	private String league;

	private String fixture;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(final String level) {
		this.level = level;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(final String league) {
		this.league = league;
	}

	public String getFixture() {
		return fixture;
	}

	public void setFixture(final String fixture) {
		this.fixture = fixture;
	}

}
