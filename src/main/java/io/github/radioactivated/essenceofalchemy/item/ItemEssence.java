package io.github.radioactivated.essenceofalchemy.item;

import io.github.radioactivated.essenceofalchemy.util.EssenceType;


public class ItemEssence extends ItemBasic{

    EssenceType type;
    public ItemEssence(EssenceType type)
    {
        setMaxStackSize(64);
        this.type = type;
        setUnlocalizedName("itemEssence" + getEssenceTypeName());
    }

    public EssenceType getEssenceType()
    {
        return this.type;
    }

    public String getEssenceTypeName()
    {
        return this.type.name();
    }
}
