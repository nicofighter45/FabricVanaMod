package fr.nicofighter45.fvm.items.enchantment;

import fr.nicofighter45.fvm.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class FasterEnchantment extends Enchantment {

    public FasterEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot[] equipementSlot) {
        super(weight, target, equipementSlot);
    }

    @Override
    public int getMinPower(int level) {
        return 10;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() == ModItems.VANADIUM_LEGGINGS || stack.getItem() == Items.BOOK;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return true;
    }
}