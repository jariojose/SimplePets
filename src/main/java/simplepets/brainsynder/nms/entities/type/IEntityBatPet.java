package simplepets.brainsynder.nms.entities.type;

import simplepets.brainsynder.nms.entities.type.main.IEntityPet;

public interface IEntityBatPet extends IEntityPet {
    boolean isHanging();

    void setHanging(boolean var1);
}
