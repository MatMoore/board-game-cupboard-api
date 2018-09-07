package uk.matmoore.models;

import java.time.LocalDate;

public class Game {

	private String name;

	private String owner;

	private int minNumberOfPlayers;

	private int maxNumberOfPlayers;

	private int estimatePlaytimeMinutes;

	private String boardGameGeekId;

	private LocalDate lastAddedDate;

	private LocalDate lastRemovedDate;

	public Game() {

	}

	public Game(String name, String owner) {
		this.name = name;
		this.owner = owner;
		this.lastAddedDate = LocalDate.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getMaxNumberOfPlayers() {
		return maxNumberOfPlayers;
	}

	public void setMaxNumberOfPlayers(int maxNumberOfPlayers) {
		this.maxNumberOfPlayers = maxNumberOfPlayers;
	}

	public int getEstimatePlaytimeMinutes() {
		return estimatePlaytimeMinutes;
	}

	public void setEstimatePlaytimeMinutes(int estimatePlaytimeMinutes) {
		this.estimatePlaytimeMinutes = estimatePlaytimeMinutes;
	}

	public String getBoardGameGeekId() {
		return boardGameGeekId;
	}

	public void setBoardGameGeekId(String boardGameGeekId) {
		this.boardGameGeekId = boardGameGeekId;
	}

	public LocalDate getLastAddedDate() {
		return lastAddedDate;
	}

	public void setLastAddedDate(LocalDate lastAddedDate) {
		this.lastAddedDate = lastAddedDate;
	}

	public LocalDate getLastRemovedDate() {
		return lastRemovedDate;
	}

	public void setLastRemovedDate(LocalDate lastRemovedDate) {
		this.lastRemovedDate = lastRemovedDate;
	}

	public int getMinNumberOfPlayers() {
		return minNumberOfPlayers;
	}

	public void setMinNumberOfPlayers(int minNumberOfPlayers) {
		this.minNumberOfPlayers = minNumberOfPlayers;
	}

}
