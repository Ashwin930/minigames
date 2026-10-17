package com.avin.fun.minigames.entity;

import jakarta.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    private String roomCode ;

    @Column(nullable = false)
    private String status;



    public Room() {
    }

    public Room(String roomCode, String status) {
        this.roomCode = roomCode;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
