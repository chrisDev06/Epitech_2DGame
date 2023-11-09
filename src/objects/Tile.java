package objects;

import objects.Tile;

import java.awt.image.BufferedImage;

public class Tile {
    private BufferedImage sprite;

    public Tile(BufferedImage sprite){
        this.sprite = sprite;
    }
    public BufferedImage getSpirte() {
        return sprite;
    }
}
