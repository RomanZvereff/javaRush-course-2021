package com.javarush.games.minigames.mini09;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Таймер
*/

public class TimerGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }

    //напишите тут ваш код

    @Override
    public void onTurn(int step) {
        setCellNumber(1, 1, step);
        if(step % 2 == 0) {
            for(int y = 0; y < 3; y++) {
                for(int x = 0; x < 3; x++) {
                    setCellColor(x, y, Color.GREEN);
                }
            }
        }else {
            for(int y = 0; y < 3; y++) {
                for(int x = 0; x < 3; x++) {
                    setCellColor(x, y, Color.ORANGE);
                }
            }
        }
    }
}
