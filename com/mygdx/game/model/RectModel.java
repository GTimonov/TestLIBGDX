package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Goshan on 30.09.2016.
 */
public class RectModel {

    private final Rectangle bounds;
    private int width;
    private int height;
    private int x;
    private int y;

    public RectModel(Rectangle bounds)
    {
        this.bounds = bounds;
        width = (int) bounds.width;
        height = (int) bounds.height;
        x = (int) bounds.x;
        y = (int) bounds.y;

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color color;

    public boolean alphaIsIncrease = true;

}
