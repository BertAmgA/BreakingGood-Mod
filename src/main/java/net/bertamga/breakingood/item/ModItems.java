package net.bertamga.breakingood.item;

import net.bertamga.breakingood.BreakingGood;
import net.bertamga.breakingood.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Un deferred register è come una lunga lista di tutti gli oggetti che vuoi registrare sotto un id
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BreakingGood.MODID);

    // Registrare effettivamente gli oggetti
    public static final DeferredItem<Item> EPHEDRA = ITEMS.register("ephedra",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EPHEDRA_SEEDS = ITEMS.register("ephedra_seeds",
            () -> new ItemNameBlockItem(ModBlocks.EPHEDRA_CROP.get(), new Item.Properties()));

    // Metodo Register chiamato "register" con parametro IEventBus chiamato "eventBus"
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus); // Chiamare ITEMS (il deferred register) passando eventBus
    }
}
