package io.github.radioactivated.essenceofalchemy.creativetab;

import io.github.radioactivated.essenceofalchemy.init.ModItems;
import io.github.radioactivated.essenceofalchemy.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Zhiqian Gao on 9/1/2014.
 */
public class CreativeTabAlchemical {

    public static final CreativeTabs TAB_MAIN = new CreativeTabs(Reference.CREATIVE_TAB_MAIN) {

        @Override
        public Item getTabIconItem() {
            return ModItems.itemEssenceGold;
        }


    };
}
