package com.mygdx.game.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.utils.ColorsFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Goshan on 28.09.2016.
 */



public class Model {

    private int STAGE_WIDTH;
    private int STAGE_HEIGHT;

    public byte columnsMount;
    public byte linesMount;

    public RectModel[][] rects;
    private int _rectSize;

    public Model(int width, int height)
    {
        STAGE_WIDTH = width;
        STAGE_HEIGHT = height;
        generateLevel();
    }
    private void generateLevel()
    {
        rects = new RectModel[Settings.HORIZONTAL_MOUNT][Settings.VERTICAL_MOUNT];
        _rectSize = (STAGE_WIDTH - (Settings.MIN_PADDING * 2) - (Settings.GAP * Settings.HORIZONTAL_MOUNT-1)) / Settings.HORIZONTAL_MOUNT;

        ArrayList colors = ColorsFactory.getColors(Settings.COLORS_AMOUNT);
        for (Object color:colors) {
            Gdx.app.log("Current colors", color.toString());
        }

        for (byte j = 0; j <= Settings.VERTICAL_MOUNT; j++){
            for (byte i = 0; i <= Settings.HORIZONTAL_MOUNT; i++) {
                rects[i][j] = createRectByPosition(i, j);
            }
        }

    }
    private RectModel createRectByPosition(byte verticalPos, byte horisontalPos){


    }

}

