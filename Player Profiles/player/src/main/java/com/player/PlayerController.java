package com.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	@Autowired
	PlayerService service;
	@PostMapping("/addplayer")
	public Players addPlayer(@RequestBody Players players) {
		return service.savePlayers(players);
	}
	@GetMapping("/getallplayers")
	public List<Players> getAllPlayers(){
		return service.findAllPlayers();
	}
	@GetMapping("/getplayer/{id}")
	public Players getPlayerById(@PathVariable int id) {
		return service.findPlayerById(id);
	}
	@GetMapping("/getplayer/{name}")
	public Players getPlayerByName(@PathVariable String name) {
		return service.findPlayerByname(name);
	}
	@DeleteMapping("/delete/{id}")
	public String deletePlayer(@PathVariable int id) {
		return service.deletePlayerById(id);
	}
	@PutMapping("/updateplayer")
	public Players updatePlayer(@RequestBody Players players) {
		return service.updatePlayer(players);
	}
}
