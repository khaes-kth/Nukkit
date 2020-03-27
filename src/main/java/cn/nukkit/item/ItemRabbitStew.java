package cn.nukkit.item;

import cn.nukkit.utils.Identifier;

/**
 * Created by Snake1999 on 2016/1/14.
 * Package cn.nukkit.item in project nukkit.
 */
public class ItemRabbitStew extends ItemEdible {

    public ItemRabbitStew(Identifier id) {
        super(id);
    }

    @Override
    public int getMaxStackSize() {
        return 1;
    }
}
