package com.avin.fun.minigames.dto;

public class RoomResponse {

    private String roomCode;
    private String roomStatus;

    public RoomResponse(String roomCode, String roomStatus) {
        this.roomCode = roomCode;
        this.roomStatus = roomStatus;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }
}
