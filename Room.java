package com;

public class Room {
	private int roomNo;
	private String roomType;
	private boolean roomOccupied;
	public Room(int roomNo, String roomType) {
		//super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		
	}
	public Room()
	{
		
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public boolean isRoomOccupied() {
		return roomOccupied;
	}
	public void setRoomOccupied(boolean roomOccupied) {
		this.roomOccupied = roomOccupied;
	}
	

}
