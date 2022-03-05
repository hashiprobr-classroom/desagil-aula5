package br.edu.insper.desagil.aula5.concord;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberTest {
	private Member m;

	@BeforeEach
	private void setUp() {
		User user = new User("bob", 1234);
		m = new Member(user);
	}

	@Test
	void build() {
		assertNotNull(m.getUser());
		assertFalse(m.isManageServer());
		assertFalse(m.isManageChannel());
	}

	@Test
	void changeManageServer() {
		m.setManageServer(true);
		assertTrue(m.isManageServer());
	}

	@Test
	void changeManageChannel() {
		m.setManageChannel(true);
		assertTrue(m.isManageChannel());
	}
}
