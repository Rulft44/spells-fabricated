package net.rulft.spellsfabricated.init;

import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import net.rulft.spellsfabricated.SpellsFabricated;
import net.spell_engine.api.item.trinket.SpellBooks;
import java.util.List;

public class ModItems {
    public static void registerBooks() {
        var books = List.of("lightning", "fire", "ice");
        for (var name: books) {
            SpellBooks.createAndRegister(new Identifier(SpellsFabricated.MOD_ID, name), ItemGroups.COMBAT);
        }
    }
}
