package br.edu.insper.desagil.aula5.concord;

import java.util.ArrayList;
import java.util.List;

public class Server {
	private String name;
	private List<Member> members;
	private List<Channel> channels;

	public Server(String name) {
		this.name = name;
		this.members = new ArrayList<>();
		this.channels = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int numberOfMembers() {
		return members.size();
	}

	public int numberOfChannels() {
		return channels.size();
	}

	public void addMember(User user) {
		members.add(new Member(user));
	}

	public void addChannel(String name) {
		channels.add(new Channel(name));
	}

	public void addChannelUser(int i, Member member) {
		channels.get(i).addUser(member.getUser());
	}

	public Channel getChannelByIndex(int i) {
		return channels.get(i);
	}
}
