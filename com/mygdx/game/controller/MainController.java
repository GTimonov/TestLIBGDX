package com.mygdx.game.controller;

import com.mygdx.game.model.Model;
import com.mygdx.game.model.Settings;

/**
 * Created by Goshan on 20.10.2016.
 */
public class MainController {

    private Model model;

    public MainController(Model model){

        this.model = model;
        model.generateLevel();
    }

    private int i = 0;
    public void update(float delta)
    {
        model.updateAlpha();

//        if (i < Settings.PERIOD_TO_CHANGE) {
//            i++;
//        }
//        else {
//            i = 0;
//            //model.updateColors();
//            model.setColorsToRects();
//
//        }
    }
}
