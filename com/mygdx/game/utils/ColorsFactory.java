package com.mygdx.game.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.mygdx.game.model.Settings;

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by Goshan on 20.10.2016.
 */
public class ColorsFactory {

    private static final int COLORS_MOUNT = 16777215;

    public static Color[] getColors(byte amount){

        Random rand = new Random();

        //int step = COLORS_MOUNT / amount;
        //int randomColor = rand.nextInt(step);

        Color[] values = new Color[amount];
        byte i = 0;
        while (i != amount)
        {
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();


            //Color color = new Color(randomColor + step*i);
            Color color = new Color(r, g, b, 1);
            values[i] = color;
            i++;
        }

        return values;
    }
}
