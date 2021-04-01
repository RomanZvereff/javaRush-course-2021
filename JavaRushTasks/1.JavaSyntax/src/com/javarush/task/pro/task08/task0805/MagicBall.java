package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        //напишите тут ваш код
        Random random = new Random();
        int index = random.nextInt(8);
        String answer = null;

        switch(index) {
            case 0:
                answer = CERTAIN;
                break;
            case 1:
                answer = DEFINITELY;
                break;
            case 2:
                answer = MOST_LIKELY;
                break;
            case 3:
                answer = OUTLOOK_GOOD;
                break;
            case 4:
                answer = ASK_AGAIN_LATER;
                break;
            case 5:
                answer = TRY_AGAIN;
                break;
            case 6:
                answer = NO;
                break;
            case 7:
                answer = VERY_DOUBTFUL;
                break;
        }
        return answer;
    }
}
