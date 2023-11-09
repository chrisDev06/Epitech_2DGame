package helper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class LoadSave {
    public static BufferedImage getSpritesMap(){
        BufferedImage img = null;

        InputStream is  = LoadSave.class.getClassLoader().getResourceAsStream("spritesMap.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
}
