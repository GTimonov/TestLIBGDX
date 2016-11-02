package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.AudioDevice;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.model.Model;
import com.mygdx.game.screens.GameScreen;

public class MyGdxGame extends Game {
	public SpriteBatch batch;
	//Texture img;
	//AudioDevice device;


	//private static final int SAMPLE_RATE = 16 * 1024;
	//float FREQ = 0;



	@Override
	public void create () {
		batch = new SpriteBatch();
		//batch.maxSpritesInBatch = 1000;

		setScreen(new GameScreen(this));
		//img = new Texture("badlogic.jpg");

		//playRecorded();
	}

	private int x = 0;
	private int y = 0;
	@Override
	public void render () {
//		Gdx.gl.glClearColor(1, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		Sprite sprite = new Sprite(img,0, 0, 200, 200);
//		sprite.setPosition(x, y);
//		sprite.setRotation(x);
//
//		TextureRegion tr = new TextureRegion();
//
//		x++;
//		y++;
//		batch.begin();
//		sprite.draw(batch);
//		batch.end();
		super.render();

	}
//	private short[] getData() {
//		final int LENGTH = SAMPLE_RATE*10;
//		final short[] arr = new short[LENGTH];
//		for(int i = 0; i < arr.length; i++) {
//			FREQ+=.001;
//			if (FREQ >= 1) {
//				FREQ = 0;
//			}
//			double angle = (2.0 * Math.PI * i) / (SAMPLE_RATE/FREQ);
//			arr[i] = (short) (Math.cos(angle) * 16000);
//		}
//		return arr;
//	}

//	public void playRecorded(){
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				device = Gdx.audio.newAudioDevice(44100, true);
//				short[] pCM = getData();// 1024 samples
//				device.writeSamples(pCM, 0, pCM.length);
//				device.setVolume(1);
//				device.dispose();
//			}
//		}).start();
//	}






}
