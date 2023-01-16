package com.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	PlayerRepository repo;
	@Override
	public Players savePlayers(Players players) {
		return repo.save(players);
	}
	@Override
	public List<Players> findAllPlayers() {
		return repo.findAll();
	}
	@Override
	public Players findPlayerById(int id) {
		return repo.findById(id).orElse(null);
	}
	@Override
	public Players findPlayerByname(String name) {
		return repo.findByName(name);
	}
	@Override
	public String deletePlayerById(int id) {
		repo.deleteById(id);
		return "deleted";
	}
	@Override
	public Players updatePlayer(Players players) {
		Players existingPlayer=repo.findById(players.getId()).orElse(null);
		existingPlayer.setName(players.getName());
		existingPlayer.setAge(players.getAge());
		existingPlayer.setNationality(players.getNationality());
		existingPlayer.setClub(players.getClub());
		existingPlayer.setTotalGoals(players.getTotalGoals());
		existingPlayer.setTotalAssists(players.getTotalAssists());
		existingPlayer.setInternationalGoals(players.getInternationalGoals());
		existingPlayer.setClubGoals(players.getClubGoals());
		existingPlayer.setInternationalAssists(players.getInternationalAssists());
		existingPlayer.setClubAssists(players.getClubAssists());
		existingPlayer.setUclGoals(players.getUclGoals());
		existingPlayer.setUclAssists(players.getUclAssists());
		existingPlayer.setTrophies(players.getTrophies());
		existingPlayer.setWorldcups(players.getWorldcups());
		existingPlayer.setUcl(players.getUcl());
		existingPlayer.setBallondor(players.getBallondor());
		existingPlayer.setGoldenBoot(players.getGoldenBoot());
		existingPlayer.setPuskas(players.getPuskas());
		return repo.save(existingPlayer);
		
	}
}
