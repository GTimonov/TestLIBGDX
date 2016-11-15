package com.mygdx.game.render;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.mygdx.game.model.Model;
import com.mygdx.game.model.RectModel;
import com.mygdx.game.model.Settings;

import java.util.ArrayList;


/**
 * Created by Goshan on 30.09.2016.
 */
public class MainRenderer {

    private Model model;
    private SpriteBatch batch;
    private ShapeRenderer shapeRenderer;


    public MainRenderer(SpriteBatch batch, Model model)
    {
        this.model = model;
        this.batch = batch;
        shapeRenderer = new ShapeRenderer();


    }

    public void render(){

        drawBricks();
    }

    private void drawBricks(){

        batch.begin();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        for (RectModel[] ar:model.rects)
            for (RectModel rect : ar) {

                shapeRenderer.setColor(rect.color);
                shapeRenderer.rect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());

            }
        shapeRenderer.end();

        batch.end();
    }
}


