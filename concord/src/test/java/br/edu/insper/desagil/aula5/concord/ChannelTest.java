package br.edu.insper.desagil.aula5.concord;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChannelTest {
	private Channel c;

	@BeforeEach
	private void setUp() {
		c = new Channel("rules");
	}

	@Test
	void addTwoUsersSameNameAndTag() {
		c.addUser(new User("alice", 0));
		c.addUser(new User("alice", 0));
		assertEquals(1, c.size());
	}

	@Test
	void addTwoUsersDifferentNameAndTag() {
		c.addUser(new User("alice", 0));
		c.addUser(new User("bob", 1234));
		assertEquals(2, c.size());
	}
}
