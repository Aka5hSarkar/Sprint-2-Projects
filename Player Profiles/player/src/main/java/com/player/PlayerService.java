package com.player;

import java.util.List;

public interface PlayerService {
	public Players savePlayers(Players players);
	public List<Players> findAllPlayers();
	public Players findPlayerById(int id);
	public Players findPlayerByname(String name);
	public String deletePlayerById(int id);
	public Players updatePlayer(Players players);
}
