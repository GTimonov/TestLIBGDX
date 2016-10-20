package com.mygdx.game.utils;

import com.badlogic.gdx.Gdx;

import java.util.ArrayList;

/**
 * Created by Goshan on 20.10.2016.
 */
public class ColorsFactory {

    private static final int COLORS_MOUNT = 256000;

    public static ArrayList getColors(byte amount){

        long randomColor = Math.round(Math.random() * COLORS_MOUNT);
        long step = COLORS_MOUNT / amount;

        ArrayList values = new ArrayList();
        byte i = 0;
        while (i != amount)
        {
            long color = randomColor + step*i;
            values.add(color);
            i++;
        }

        return values;
    }
}
