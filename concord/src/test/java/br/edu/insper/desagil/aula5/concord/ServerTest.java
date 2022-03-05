package br.edu.insper.desagil.aula5.concord;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServerTest {
	private Server s;

	@BeforeEach
	private void setUp() {
		s = new Server("insper");
	}

	@Test
	void addOneMember() {
		s.addMember(new User("alice", 0));
		assertEquals(1, s.numberOfMembers());
	}

	@Test
	void addTwoMembers() {
		s.addMember(new User("alice", 0));
		s.addMember(new User("bob", 1234));
		assertEquals(2, s.numberOfMembers());
	}

	@Test
	void addOneChannel() {
		s.addChannel("rules");
		assertEquals(1, s.numberOfChannels());
	}

	@Test
	void addTwoChannels() {
		s.addChannel("rules");
		s.addChannel("coffee");
		assertEquals(2, s.numberOfChannels());
	}

	@Test
	void addChannelUser() {
		s.addChannel("rules");
		s.addChannel("coffee");
		Member member = new Member(new User("alice", 0));
		s.addChannelUser(0, member);
		Channel channel = s.getChannelByIndex(0);
		assertEquals(1, channel.size());
	}
}
