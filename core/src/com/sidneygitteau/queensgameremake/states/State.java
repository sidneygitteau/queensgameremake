package com.sidneygitteau.queensgameremake.states;


import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {

    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;

    protected State(GameStateManager gsm) {
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();


    }

    protected abstract void handleInput();

    public abstract void update(float dt); //difference entre 1 frame et une autre

    public abstract void render (SpriteBatch sb); //container pour tout ce qu'on a besoin niveau texture = ca prend tout ce dont on a besoin

    public abstract void dispose();
}
