package com.player;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Players,Integer> {
	public Players findByName(String name);
}
