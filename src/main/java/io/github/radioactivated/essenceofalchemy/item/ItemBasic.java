package io.github.radioactivated.essenceofalchemy.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.radioactivated.essenceofalchemy.creativetab.CreativeTabAlchemical;
import io.github.radioactivated.essenceofalchemy.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBasic extends Item
{
        public ItemBasic(){
            super();
            setMaxStackSize(1);
            setCreativeTab(CreativeTabAlchemical.TAB_MAIN);
        }

        @Override
        public String getUnlocalizedName(){
            return String.format("items.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        }

        @Override
        public String getUnlocalizedName(ItemStack itemStack){
            return String.format("items.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        }

        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IIconRegister iconRegister){
            itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        }

        protected String getUnwrappedUnlocalizedName(String unlocalizedName)
        {
            return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
        }
}


