package com.mygdx.game.render;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.model.Model;
import com.mygdx.game.model.RectModel;
import com.mygdx.game.model.Settings;



/**
 * Created by Goshan on 30.09.2016.
 */
public class MainRenderer {

    private Model model;
    private SpriteBatch batch;

    public MainRenderer(SpriteBatch batch, Model model)
    {
        this.model = model;
        this.batch = batch;
    }

    public void render(){
        drawBricks();
    }

    private void drawBricks(){

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // This cryptic line clears the screen.
        batch.begin();
        // Drawing goes here!


        for (int i = 0; i < Settings.HORIZONTAL_MOUNT; i++) {
            for (int j = 0; j < Settings.VERTICAL_MOUNT; j++) {
                RectModel rect = model.rects[i][j];
                Pixmap pixmap = new Pixmap(model.rectSize, model.rectSize, Pixmap.Format.RGBA8888);
                pixmap.setColor(0xddffdd);


            }
        }

        batch.end();

    }

}


