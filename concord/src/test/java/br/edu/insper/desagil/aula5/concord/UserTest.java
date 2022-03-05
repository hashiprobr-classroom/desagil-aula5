package br.edu.insper.desagil.aula5.concord;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserTest {
	private User u;

	@Test
	void buildWithNameAliceTag0() {
		u = new User("alice", 0);
		assertEquals("alice#0000", u.fullName());
	}

	@Test
	void buildWithNameAliceTag1() {
		u = new User("alice", 1);
		assertEquals("alice#0001", u.fullName());
	}

	@Test
	void buildWithNameAliceTag22() {
		u = new User("alice", 22);
		assertEquals("alice#0022", u.fullName());
	}

	@Test
	void buildWithNameBobTag333() {
		u = new User("bob", 333);
		assertEquals("bob#0333", u.fullName());
	}

	@Test
	void buildWithNameBobTag4444() {
		u = new User("bob", 4444);
		assertEquals("bob#4444", u.fullName());
	}

	@Test
	void buildWithNameBobTag1234() {
		u = new User("bob", 1234);
		assertEquals("bob#1234", u.fullName());
	}
}
