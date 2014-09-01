package io.github.radioactivated.essenceofalchemy.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes
{

    public static void init()
    {
        //so you can just reference instantiated essences in ModItems apparently
        //output, pattern, pattern definitions
        /*GameRegistry.addRecipe(new ItemStack(ModItems.itemCappuccino),
                " a ", " b ", " c ",
                'a', new ItemStack(Items.ender_pearl),
                'b', new ItemStack(Blocks.end_stone),
                'c', new ItemStack(Blocks.stone));*/
        //output, inputs

        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.itemEssenceBasic),
                new ItemStack(Blocks.netherrack),


                new ItemStack(ModItems.itemSalAmmoniac));
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                        new ItemStack(ModItems.itemEssenceIron),
                        "ingotIron",
                        new ItemStack(ModItems.itemEssenceBasic),
                        new ItemStack(ModItems.itemEssenceBasic),
                        new ItemStack(ModItems.itemEssenceBasic),
                        new ItemStack(ModItems.itemEssenceBasic)
                )
        );
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                        new ItemStack(ModItems.itemEssenceGold),
                        "ingotGold",
                        new ItemStack(ModItems.itemEssenceBasic),
                        new ItemStack(ModItems.itemEssenceBasic),
                        new ItemStack(ModItems.itemEssenceBasic),
                        new ItemStack(ModItems.itemEssenceBasic)
                )
        );
    }
}
