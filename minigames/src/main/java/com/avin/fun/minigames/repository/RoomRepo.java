package com.avin.fun.minigames.repository;


import com.avin.fun.minigames.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepo extends JpaRepository<Room,Long> {


    Optional<Room> findByroomCode(String roomCode);
}
