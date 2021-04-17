package com.javarush.games.minigames.mini07;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Работа с мышью
*/

public class PaintGame extends Game {

    @Override
    public void initialize() {
        //напишите тут ваш код
        setScreenSize(5, 5);
        for(int y = 0; y < 5; y++) {
            for(int x = 0; x < 5; x++) {
                setCellColor(x, y , Color.WHITE);
            }
        }
    }

    //напишите тут ваш код
    @Override
    public void onMouseLeftClick(int x, int y) {
        setCellColor(x, y, Color.GREEN);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        setCellColor(x, y, Color.ORANGE);
    }

}
