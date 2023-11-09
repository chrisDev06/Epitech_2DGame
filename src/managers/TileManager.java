package managers;

import helper.LoadSave;
import objects.Tile;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class TileManager {

    public Tile GRASS, WATER, ROAD;
    public BufferedImage AllSpritesMap;
    public ArrayList<Tile> tiles = new ArrayList<>();

    public TileManager() {
        loadSpritesMap();
        creatTiles();
    }

    private void creatTiles(){
        tiles.add(GRASS = new Tile(getSprite(8, 1)));
        tiles.add(WATER = new Tile(getSprite(0, 6)));
        tiles.add(ROAD = new Tile(getSprite(9, 0)));
    }

    private  void loadSpritesMap() {
        AllSpritesMap = LoadSave.getSpritesMap();
    }

    public BufferedImage getSprite(int id) {
        return tiles.get(id).getSpirte();
    }
    private BufferedImage getSprite(int xCord, int yCord) {
        return AllSpritesMap.getSubimage(xCord * 32, yCord * 32,32,32);
    }
}
