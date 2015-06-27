package com.mathedia.players.dto;

public class BasePlayerData {
	
	public BasePlayerData() { }
	
	public BasePlayerData(int id, String nickname) {
		this.id = id;
		this.nickname = nickname;
	}

	private int id;	
	private String nickname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
