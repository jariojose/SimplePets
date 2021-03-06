package simplepets.brainsynder.menu.menuItems.sizes;

import org.bukkit.Material;
import simple.brainsynder.api.ItemMaker;
import simplepets.brainsynder.menu.MenuItemAbstract;
import simplepets.brainsynder.nms.entities.type.IEntityMagmaCubePet;
import simplepets.brainsynder.nms.entities.type.IEntitySlimePet;
import simplepets.brainsynder.nms.entities.type.main.IEntityPet;
import simplepets.brainsynder.pet.PetType;

public class Size3 extends MenuItemAbstract {
    private ItemMaker item = new ItemMaker(Material.SLIME_BLOCK);

    public Size3(PetType type, IEntityPet entityPet) {
        super(type, entityPet);
    }

    @Override
    public ItemMaker getItem() {
        return item.setName("&6&lSize:&e " + 3);
    }

    @Override
    public void onLeftClick() {
        if (entityPet instanceof IEntitySlimePet) {
            IEntitySlimePet slime = (IEntitySlimePet) entityPet;
            slime.setSize(3);
        }
        if (entityPet instanceof IEntityMagmaCubePet) {
            IEntityMagmaCubePet slime = (IEntityMagmaCubePet) entityPet;
            slime.setSize(3);
        }
    }
}
