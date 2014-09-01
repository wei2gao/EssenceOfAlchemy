package io.github.radioactivated.essenceofalchemy.item;


import io.github.radioactivated.essenceofalchemy.util.FluidType;

public class ItemFluid extends ItemBasic {


    FluidType type;

    public ItemFluid(FluidType type){
        this.type = type;
        setMaxStackSize(64);
        setUnlocalizedName("item"+getFluidTypeName());
    }

    public FluidType getFluidType()
    {
        return this.type;
    }

    public String getFluidTypeName(){
        return this.type.name();
    }

}
