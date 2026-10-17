package com.avin.fun.minigames.service;

import com.avin.fun.minigames.dto.RoomResponse;
import com.avin.fun.minigames.entity.Room;
import com.avin.fun.minigames.repository.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;


@Service
public class RoomService {

    @Autowired
    private RoomRepo roomRepo;

    public Room createRoom(){
        Random random = new Random();
        String roomCode = String.valueOf(random.nextInt(1000,9999) );
        String roomStatus = "WAITING";

        Room room = new Room(roomCode,roomStatus);
        roomRepo.save(room);

        return room;

    }

    public Optional<RoomResponse> startPlaying(String roomCode){
        Optional<Room> room = roomRepo.findByroomCode(roomCode);

        if(room.isPresent()){
            Room currentRoom = room.get();
            String currentStatus  = currentRoom.getStatus();

            if(currentStatus.equals("WAITING")){
                currentRoom.setStatus("PLAYING");
                roomRepo.save(currentRoom);
            }

            return Optional.of(new RoomResponse(currentRoom.getRoomCode(), currentRoom.getStatus()));
        }

        return Optional.empty();

    }

}
