package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Axe extends Entity {

    public OBJ_Axe(GamePanel gp) {
        super(gp);

        name = "Woodcutter's Axe";
        down1 = setup("/objects/axe", gp.tileSize, gp.tileSize);
        attackValue = 2;
    }
}
