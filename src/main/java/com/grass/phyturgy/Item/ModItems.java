package com.grass.phyturgy.Item;

import com.grass.phyturgy.Phyturgy;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Phyturgy.PHYTURGY);

    public static final DeferredItem<Item> FIELD_JOURNAL = ITEMS.registerSimpleItem(
            "field_journal"
    );

    public static final DeferredItem<Item> PINECONE = ITEMS.registerSimpleItem(
            "pinecone"
    );

    public static final DeferredItem<Item> PEAT = ITEMS.registerSimpleItem(
            "peat"
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
