package net.testmod;

import net.fabricmc.api.ModInitializer;
import net.testmod.registry.testItem;

public class testMod implements ModInitializer 
{
    public static final String MOD_ID = "testmod";

    @Override
    public void onInitialize()
    {
        testItem.registerItems();
    }
}
