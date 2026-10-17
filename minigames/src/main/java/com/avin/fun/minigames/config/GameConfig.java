package com.avin.fun.minigames.config;

import com.avin.fun.minigames.enums.GameType;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class GameConfig {

    private static final Map<GameType,Integer> maxPlayers= new EnumMap<>(GameType.class);


    static {

        maxPlayers.put(GameType.TIC_TAC_TOE,2 );
        maxPlayers.put(GameType.UNO,6);
    }

}
