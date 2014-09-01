package io.github.radioactivated.essenceofalchemy.init;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.radioactivated.essenceofalchemy.item.*;
import io.github.radioactivated.essenceofalchemy.util.EssenceType;
import io.github.radioactivated.essenceofalchemy.util.FluidType;

public class ModItems {


    //public static final ItemBasic itemCappuccino = new ItemCappuccino();
    public static final ItemBasic itemEssenceBasic = new ItemEssence(EssenceType.Basic);
    public static final ItemBasic itemEssenceCopper = new ItemEssence(EssenceType.Copper);
    public static final ItemBasic itemEssenceGold = new ItemEssence(EssenceType.Gold);
    public static final ItemBasic itemEssenceIron = new ItemEssence(EssenceType.Iron);
    public static final ItemBasic itemEssenceLead = new ItemEssence(EssenceType.Lead);
    public static final ItemBasic itemEssenceMercury = new ItemEssence(EssenceType.Mercury);
    public static final ItemBasic itemEssenceSilver = new ItemEssence(EssenceType.Silver);
    public static final ItemBasic itemEssenceTin = new ItemEssence(EssenceType.Tin);
    public static final ItemBasic itemVitriol = new ItemFluid(FluidType.Vitriol);
    public static final ItemBasic itemAquaFortis = new ItemFluid(FluidType.AquaFortis);
    public static final ItemBasic itemAquaRegia = new ItemFluid(FluidType.AquaRegia);
    public static final ItemBasic itemAquaVitae = new ItemFluid(FluidType.AquaVitae);
    public static final ItemBasic itemSalAmmoniac = new ItemSalAmmoniac();
    public static final ItemBasic itemSulfur = new ItemSulfur();
    public static void init(){

        //GameRegistry.registerItem(itemCappuccino, "itemCappuccino");
        GameRegistry.registerItem(itemEssenceBasic, "itemEssenceBasic");
        GameRegistry.registerItem(itemEssenceCopper, "itemEssenceCopper");
        GameRegistry.registerItem(itemEssenceGold,"itemEssenceGold");
        GameRegistry.registerItem(itemEssenceIron,"itemEssenceIron");
        GameRegistry.registerItem(itemEssenceLead,"itemEssenceLead");
        GameRegistry.registerItem(itemEssenceMercury,"itemEssenceMercury");
        GameRegistry.registerItem(itemEssenceSilver,"itemEssenceSilver");
        GameRegistry.registerItem(itemEssenceTin,"itemEssenceTin");
        GameRegistry.registerItem(itemVitriol,"itemVitriol");
        GameRegistry.registerItem(itemAquaFortis,"itemAquaFortis");
        GameRegistry.registerItem(itemAquaRegia,"itemAquaRegia");
        GameRegistry.registerItem(itemAquaVitae,"itemAquaVitae");
        GameRegistry.registerItem(itemSalAmmoniac,"itemSalAmmoniac");
        GameRegistry.registerItem(itemSulfur,"itemSulfur");

    }
}
