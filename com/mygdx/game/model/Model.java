package com.mygdx.game.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;

import com.mygdx.game.utils.ColorsFactory;

import java.util.List;
import java.util.Random;


/**
 * Created by Goshan on 28.09.2016.
 */



public class Model {

    public int STAGE_WIDTH;
    public int STAGE_HEIGHT;


    public RectModel[][] rects;
    public int rectSize;
    private Color[] avaliableColors;
    private Random rand;


    public Model(int width, int height)
    {
        STAGE_WIDTH = width;
        STAGE_HEIGHT = height;
        rand = new Random();

    }
    public void updateColors(){
        avaliableColors = ColorsFactory.getColors(Settings.COLORS_AMOUNT);

       /* for (Color color:avaliableColors) {
            Gdx.app.log("Current colors", color.toString());
        }*/

    }

    public void generateLevel()
    {
        rects = new RectModel[Settings.HORIZONTAL_MOUNT][Settings.VERTICAL_MOUNT];
        rectSize = (STAGE_WIDTH - (Settings.MIN_PADDING * 2) - (Settings.GAP * Settings.HORIZONTAL_MOUNT-1)) / Settings.HORIZONTAL_MOUNT;
        updateColors();



        for (byte j = 0; j < Settings.VERTICAL_MOUNT; j++){
            for (byte i = 0; i < Settings.HORIZONTAL_MOUNT; i++) {
                rects[i][j] = createRectByPosition(i, j);
            }
        }
        setColorsToRects();
        randomizeAlpha();

        //Gdx.app.log("Rects Map", rects.toString());

    }
    private void randomizeAlpha(){
        for (RectModel[] ar:rects) {
            for (RectModel rect : ar) {
                float alpha = (float)Math.random();
                rect.color.set(rect.color.r, rect.color.g, rect.color.b, alpha);
                rect.alphaIsIncrease = Math.random() > .5;
            }
        }
    }
    private RectModel createRectByPosition(byte x, byte y){

        float rectX = ((rectSize + Settings.GAP) * x) + Settings.MIN_PADDING;
        float rectY = ((rectSize + Settings.GAP) * y) + Settings.MIN_PADDING;

        Rectangle rect = new Rectangle(rectX, rectY, rectSize, rectSize);
        RectModel rectModel = new RectModel(rect);
        return rectModel;
    }

    public void setColorsToRects(){
        for (RectModel[] ar:rects) {
            for (RectModel rect:ar) {
                rect.color =  new Color(avaliableColors[rand.nextInt(avaliableColors.length)]);
            }
        }
    }

    public void updateAlpha(){
        for (RectModel[] ar:rects) {
            for (RectModel rect : ar) {
                float alpha =  rect.color.a;

                if (alpha <=0) {
                    rect.color.a = 1;
                    rect.color =  new Color(avaliableColors[rand.nextInt(avaliableColors.length)]);
                }
                rect.color.a-=Settings.ALPHA_STEP;
            }
        }
    }
}

