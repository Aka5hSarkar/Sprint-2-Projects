package com.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="player_profile")
public class Players {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String nationality;
	private String club;
	private int totalGoals;
	private int totalAssists;
	private int internationalGoals;
	private int clubGoals;
	private int internationalAssists;
	private int clubAssists;
	private int uclGoals;
	private int uclAssists;
	private int trophies;
	private int worldcups;
	private int ucl;
	private int ballondor;
	private int goldenBoot;
	private int puskas;
	
}
