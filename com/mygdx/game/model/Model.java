package com.mygdx.game.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

import com.mygdx.game.utils.ColorsFactory;

import java.util.List;


/**
 * Created by Goshan on 28.09.2016.
 */



public class Model {

    private int STAGE_WIDTH;
    private int STAGE_HEIGHT;


    public RectModel[][] rects;
    public int rectSize;
    private List _avaliableColors;
    public float rectAlpha = 1;

    public Model(int width, int height)
    {
        STAGE_WIDTH = width;
        STAGE_HEIGHT = height;
        generateLevel();
    }
    private void generateLevel()
    {
        rects = new RectModel[Settings.HORIZONTAL_MOUNT][Settings.VERTICAL_MOUNT];
        rectSize = (STAGE_WIDTH - (Settings.MIN_PADDING * 2) - (Settings.GAP * Settings.HORIZONTAL_MOUNT-1)) / Settings.HORIZONTAL_MOUNT;

        _avaliableColors = ColorsFactory.getColors(Settings.COLORS_AMOUNT);
        for (Object color:_avaliableColors) {
            Gdx.app.log("Current colors", color.toString());
        }

        for (byte j = 0; j < Settings.VERTICAL_MOUNT; j++){
            for (byte i = 0; i < Settings.HORIZONTAL_MOUNT; i++) {
                rects[i][j] = createRectByPosition(i, j);
            }
        }

        Gdx.app.log("Rects Map", rects.toString());

    }
    private RectModel createRectByPosition(byte x, byte y){

        float rectX = ((rectSize + Settings.GAP) * x) + Settings.MIN_PADDING;
        float rectY = ((rectSize + Settings.GAP) * y) + Settings.MIN_PADDING;

        Rectangle rect = new Rectangle(rectX, rectY, rectSize, rectSize);
        RectModel rectModel = new RectModel(rect);
        return rectModel;
    }
}

