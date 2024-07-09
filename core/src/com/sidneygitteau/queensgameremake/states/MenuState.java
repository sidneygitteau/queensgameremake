package com.sidneygitteau.queensgameremake.states;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.sidneygitteau.queensgameremake.QueensGameRemake;

public class MenuState extends State{

    private Stage stage;
    private Texture background;
    private ImageButton jouerBtn;

    public MenuState(GameStateManager gsm) {

        super(gsm);
        background = new Texture("accueil.jpg");
        // Créer le stage
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
        //jouerBtn = new Texture("bouton-jouer.png");

        // Charger les textures pour le bouton
        Texture jouerBtnTexture = new Texture("bouton-jouer.png");
        TextureRegionDrawable jouerBtnDrawable = new TextureRegionDrawable(jouerBtnTexture);

        // Créer le bouton à partir de l'image
        jouerBtn = new ImageButton(jouerBtnDrawable);
        jouerBtn.setSize(200, 200); // Définir la taille du bouton
        jouerBtn.setPosition((QueensGameRemake.WIDTH / 2) - (jouerBtn.getWidth() / 2), QueensGameRemake.HEIGHT / 2);

        // Ajouter un listener au bouton
        jouerBtn.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                gsm.set(new NiveauxState(gsm));
                dispose();
            }
        });

        // Ajouter le bouton au stage
        stage.addActor(jouerBtn);
    }

    @Override
    public void handleInput() {
        /*
        if(Gdx.input.justTouched()){
            gsm.set(new NiveauxState(gsm));
            dispose();
        }*/
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
        //jouerBtn.dispose();
    }
}
