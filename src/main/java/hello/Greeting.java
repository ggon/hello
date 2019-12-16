package hello;

import javax.persistence.*;

@Entity
@Table(name="greetings")
public class Greeting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String content;

	protected Greeting(){ }

	public Greeting(String content) {
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
