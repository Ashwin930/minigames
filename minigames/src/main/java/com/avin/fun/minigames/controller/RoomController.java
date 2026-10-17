package com.avin.fun.minigames.controller;

import com.avin.fun.minigames.dto.RoomResponse;
import com.avin.fun.minigames.entity.Room;
import com.avin.fun.minigames.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @PostMapping("/create-room")
    public RoomResponse createRoom(){

        Room room = new Room();
        room = roomService.createRoom();

        RoomResponse roomResponse = new RoomResponse(room.getRoomCode(),room.getStatus());
        return roomResponse;
    }

    @PostMapping("/start-playing/{roomCode}")
    public String startPlayingInRoom(@PathVariable String roomCode){

        Optional<RoomResponse> roomResponse = roomService.startPlaying(roomCode);
        if(roomResponse.isEmpty()){
            return "Room not found";
        }else{
            return roomResponse.get().getRoomStatus();
        }

    }

}
