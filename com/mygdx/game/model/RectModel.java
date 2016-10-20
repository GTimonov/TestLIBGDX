package com.mygdx.game.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Goshan on 30.09.2016.
 */
public class RectModel {

    public final Rectangle bounds;

    public final int color;

    public RectModel(Rectangle bounds, int color)
    {
        this.bounds = bounds;
        this.color = color;
    }
}
