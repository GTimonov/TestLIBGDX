package com.mygdx.game.render;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
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
    private Texture mainTexture;
    private Pixmap pixmap;

    public MainRenderer(SpriteBatch batch, Model model)
    {
        this.model = model;
        this.batch = batch;
        pixmap = new Pixmap(model.STAGE_WIDTH, model.STAGE_HEIGHT, Pixmap.Format.RGBA8888);
        mainTexture = new Texture(pixmap);
    }

    public void render(){
        drawBricks();
    }

    public void create()
    {

    }

    private void drawBricks(){

        batch.begin();

        for (RectModel[] ar:model.rects) {
            for (RectModel rect:ar) {
                pixmap.setColor(rect.color);
                pixmap.fillRectangle(rect.getX(), rect.getY(), rect.getWidth(),  rect.getHeight());

            }
        }

        mainTexture.draw(pixmap, 0, 0);
        batch.draw(mainTexture, 0, 0);
        batch.end();

    }

}


