package redesdepetri;

import java.util.UUID;

public class Token {
	private UUID id;
	
	public Token () {
		this.id = java.util.UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

}
