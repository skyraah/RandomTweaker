package ink.ikx.rt.api.instance.item;

import static ink.ikx.rt.RandomTweaker.itemDsSet;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.damage.IDamageSource;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import ink.ikx.rt.impl.utils.ItemDs;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenMethodStatic;

@ZenRegister
@ZenExpansion("crafttweaker.item.IItemStack")
public class IItemStackExpansion {

    @ZenMethodStatic
    public static void addItemDs(IItemStack stack, IDamageSource damageSource) {
        itemDsSet.add(new ItemDs(CraftTweakerMC.getItemStack(stack), CraftTweakerMC.getDamageSource(damageSource)));
    }

    @ZenMethodStatic
    public static void removeItemDs(IItemStack stack, IDamageSource damageSource) {
        itemDsSet.remove(new ItemDs(CraftTweakerMC.getItemStack(stack), CraftTweakerMC.getDamageSource(damageSource)));
    }
}
