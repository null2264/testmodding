package net.testmod.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.testmod.testMod;

public class testItem
{    
    public static final Item TEST_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(testMod.MOD_ID, "test_item"), TEST_ITEM);
    }
}
