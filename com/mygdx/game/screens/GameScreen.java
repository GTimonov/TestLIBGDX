package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.controller.MainController;
import com.mygdx.game.model.Model;
import com.mygdx.game.render.MainRenderer;

/**
 * Created by Goshan on 30.09.2016.
 */
public class GameScreen extends ScreenAdapter {

    MyGdxGame game;
    Model model;
    MainRenderer renderer;
    MainController controller;
    FPSLogger logger;


    public GameScreen(MyGdxGame game)
    {
        logger = new FPSLogger();
        this.game = game;
        model = new Model(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        controller = new MainController(model);
        renderer = new MainRenderer(game.batch,  model);

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        controller.update(delta);
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glEnable(GL20.GL_BLEND);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        renderer.render();
        logger.log();
        Gdx.gl.glDisable(GL20.GL_BLEND);
    }


}
