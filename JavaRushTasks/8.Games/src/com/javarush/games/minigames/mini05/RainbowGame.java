package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    //напишите тут ваш код
    @Override
    public void initialize() {
        setScreenSize(10, 7);
        for(int y = 0; y < 7; y++) {
            for(int x = 0; x < 10; x++) {
                switch(y) {
                    case(0):
                        setCellColor(x, y, Color.RED);
                        break;
                    case(1):
                        setCellColor(x, y, Color.ORANGE);
                        break;
                    case(2):
                        setCellColor(x, y, Color.YELLOW);
                        break;
                    case(3):
                        setCellColor(x, y, Color.GREEN);
                        break;
                    case(4):
                        setCellColor(x, y, Color.BLUE);
                        break;
                    case(5):
                        setCellColor(x, y, Color.INDIGO);
                        break;
                    case(6):
                        setCellColor(x, y, Color.VIOLET);
                        break;
                }
            }
        }
    }
}
