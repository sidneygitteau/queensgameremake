package com.sidneygitteau.queensgameremake.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.sidneygitteau.queensgameremake.QueensGameRemake;

public class NiveauxState extends State{

    private Stage stage;
    private Texture background;

    private ImageButton niveau1;
    private ImageButton niveau2;
    private ImageButton niveau3;
    private ImageButton niveau4;
    private ImageButton niveau5;
    private ImageButton niveau6;
    private ImageButton niveau7;
    private ImageButton niveau8;
    private ImageButton niveau9;


    protected NiveauxState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("niveaux/choisir-niveau-section1.png");
        //on créé le stage
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);

        //Charger les textures pour le bouton
        Texture niveau1Texture = new Texture("niveaux/niveau_1.jpg");
        Texture niveau2Texture = new Texture("niveaux/niveau_2.jpg");
        Texture niveau3Texture = new Texture("niveaux/niveau_3.jpg");
        Texture niveau4Texture = new Texture("niveaux/niveau_4.jpg");
        Texture niveau5Texture = new Texture("niveaux/niveau_5.jpg");
        Texture niveau6Texture = new Texture("niveaux/niveau_6.jpg");
        Texture niveau7Texture = new Texture("niveaux/niveau_7.jpg");
        Texture niveau8Texture = new Texture("niveaux/niveau_8.jpg");
        Texture niveau9Texture = new Texture("niveaux/niveau_9.jpg");

        TextureRegionDrawable niveau1Drawable = new TextureRegionDrawable(niveau1Texture);
        TextureRegionDrawable niveau2Drawable = new TextureRegionDrawable(niveau2Texture);
        TextureRegionDrawable niveau3Drawable = new TextureRegionDrawable(niveau3Texture);
        TextureRegionDrawable niveau4Drawable = new TextureRegionDrawable(niveau4Texture);
        TextureRegionDrawable niveau5Drawable = new TextureRegionDrawable(niveau5Texture);
        TextureRegionDrawable niveau6Drawable = new TextureRegionDrawable(niveau6Texture);
        TextureRegionDrawable niveau7Drawable = new TextureRegionDrawable(niveau7Texture);
        TextureRegionDrawable niveau8Drawable = new TextureRegionDrawable(niveau8Texture);
        TextureRegionDrawable niveau9Drawable = new TextureRegionDrawable(niveau9Texture);

        //on créé leS bouton via les image
        niveau1=new ImageButton(niveau1Drawable);
        niveau1.setSize(100, 150);
        niveau1.setPosition((QueensGameRemake.WIDTH / 5) - (niveau1.getWidth() / 2), QueensGameRemake.HEIGHT*3 / 5);

        niveau2=new ImageButton(niveau2Drawable);
        niveau2.setSize(100,150);
        niveau2.setPosition((QueensGameRemake.WIDTH  / 2)- (niveau2.getWidth() / 2),QueensGameRemake.HEIGHT*3 / 5 );

        niveau3=new ImageButton(niveau3Drawable);
        niveau3.setSize(100, 150);
        niveau3.setPosition((QueensGameRemake.WIDTH * 4/ 5) - (niveau3.getWidth() / 2), QueensGameRemake.HEIGHT*3 / 5);

        niveau4=new ImageButton(niveau4Drawable);
        niveau4.setSize(100,150);
        niveau4.setPosition((QueensGameRemake.WIDTH / 5) - (niveau4.getWidth() / 2),QueensGameRemake.HEIGHT*2 / 5);

        niveau5=new ImageButton(niveau5Drawable);
        niveau5.setSize(100,150);
        niveau5.setPosition((QueensGameRemake.WIDTH  / 2)- (niveau5.getWidth() / 2),QueensGameRemake.HEIGHT*2 / 5 );

        niveau6=new ImageButton(niveau6Drawable);
        niveau6.setSize(100, 150);
        niveau6.setPosition((QueensGameRemake.WIDTH * 4/ 5) - (niveau6.getWidth() / 2), QueensGameRemake.HEIGHT*2 / 5);
        /*
        niveau1 = new Texture("niveaux/niveau_1.jpg");
        niveau2 = new Texture("niveaux/niveau_2.jpg");
        niveau3 = new Texture("niveaux/niveau_3.jpg");
        niveau4 = new Texture("niveaux/niveau_4.jpg");
        niveau5 = new Texture("niveaux/niveau_5.jpg");
        niveau6 = new Texture("niveaux/niveau_6.jpg");
        niveau7 = new Texture("niveaux/niveau_7.jpg");
        niveau8 = new Texture("niveaux/niveau_8.jpg");
        niveau9 = new Texture("niveaux/niveau_9.jpg");*/

        stage.addActor(niveau1);
        stage.addActor(niveau2);
        stage.addActor(niveau3);
        stage.addActor(niveau4);
        stage.addActor(niveau5);
        stage.addActor(niveau6);

    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background,0,0, QueensGameRemake.WIDTH,QueensGameRemake.HEIGHT);
        //sb.draw(jouerBtn,(QueensGameRemake.WIDTH/2)- (jouerBtn.getWidth()/2),QueensGameRemake.HEIGHT/2);
        sb.end();

        stage.draw();
    }

    @Override
    public void dispose() {
        background.dispose();
    }
}
