package fr.nicofighter45.fvm.items;

import fr.nicofighter45.fvm.FVM;
import fr.nicofighter45.fvm.items.armor.EmeraldArmorMaterials;
import fr.nicofighter45.fvm.items.armor.TungstenArmorMaterials;
import fr.nicofighter45.fvm.items.armor.vanadium.ModifiableItem;
import fr.nicofighter45.fvm.items.armor.vanadium.VanadiumArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //vanadium
    public static final Item VANADIUM_NUGGET = new Item(new Item.Settings().group(FVM.VANADIUM_GROUP));
    public static final Item VANADIUM_INGOT = new Item(new Item.Settings().group(FVM.VANADIUM_GROUP));
    public static final Item VANADIUM_STICK = new Item(new Item.Settings().group(FVM.VANADIUM_GROUP).maxCount(16));
    public static final Item VANADIUM_HEART = new Item(new Item.Settings().group(FVM.VANADIUM_GROUP).maxCount(8));
    public static ToolItem VANADIUM_SWORD = new SwordItem(VanadiumToolMaterial.INSTANCE, 5, -1.0F, new Item.Settings().group(FVM.VANADIUM_GROUP));

    //armure en vanadium
    public static final Item VANADIUM_HELMET = new ArmorItem(VanadiumArmorMaterials.VANADIUM, EquipmentSlot.HEAD, new Item.Settings().group(FVM.VANADIUM_GROUP));
    public static final Item VANADIUM_CHESTPLATE = new ArmorItem(VanadiumArmorMaterials.VANADIUM, EquipmentSlot.CHEST, new Item.Settings().group(FVM.VANADIUM_GROUP));
    public static final Item VANADIUM_LEGGINGS = new ArmorItem(VanadiumArmorMaterials.VANADIUM, EquipmentSlot.LEGS, new Item.Settings().group(FVM.VANADIUM_GROUP));
    public static final Item VANADIUM_BOOTS = new ModifiableItem(VanadiumArmorMaterials.VANADIUM, EquipmentSlot.FEET, new Item.Settings().group(FVM.VANADIUM_GROUP));

    //armure en emeraude
    public static final Item EMERALD_HEART = new Item(new Item.Settings().group(FVM.VANADIUM_GROUP).maxCount(8));
    public static final Item EMERALD_HELMET = new ArmorItem(EmeraldArmorMaterials.EMERALD, EquipmentSlot.HEAD, new Item.Settings().group(FVM.VANADIUM_GROUP));
    public static final Item EMERALD_CHESTPLATE = new ArmorItem(EmeraldArmorMaterials.EMERALD, EquipmentSlot.CHEST, new Item.Settings().group(FVM.VANADIUM_GROUP));
    public static final Item EMERALD_LEGGINGS = new ArmorItem(EmeraldArmorMaterials.EMERALD, EquipmentSlot.LEGS, new Item.Settings().group(FVM.VANADIUM_GROUP));
    public static final Item EMERALD_BOOTS = new ArmorItem(EmeraldArmorMaterials.EMERALD, EquipmentSlot.FEET, new Item.Settings().group(FVM.VANADIUM_GROUP));

    //tungsten
    public static final Item TUNGSTEN_INGOT = new Item(new Item.Settings().group(FVM.VANADIUM_GROUP));
    public static final Item TUNGSTEN_CHESTPLATE = new ArmorItem(TungstenArmorMaterials.TUNGSTEN, EquipmentSlot.CHEST, new Item.Settings().group(FVM.VANADIUM_GROUP));

    //argent
    public static final Item SILVER_INGOT = new Item(new Item.Settings().group(FVM.VANADIUM_GROUP));

    //cuivre et étain
    public static final Item TIN_INGOT = new Item(new Item.Settings().group(FVM.VANADIUM_GROUP));
    public static final Item COPPER_INGOT = new Item(new Item.Settings().group(FVM.VANADIUM_GROUP));

    //processeur
    public static final Item TRANSISTOR = new Item(new Item.Settings().group(FVM.VANADIUM_GROUP).maxCount(16));
    public static final Item PROCESSOR = new Item(new Item.Settings().group(FVM.VANADIUM_GROUP).maxCount(16));

    public static void registerAll() {

        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "vanadium_nugget"), VANADIUM_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "vanadium_ingot"), VANADIUM_INGOT);

        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "vanadium_stick"), VANADIUM_STICK);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "vanadium_heart"), VANADIUM_HEART);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "emerald_heart"), EMERALD_HEART);

        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "vanadium_helmet"), VANADIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "vanadium_chestplate"), VANADIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "vanadium_leggings"), VANADIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "vanadium_boots"), VANADIUM_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "emerald_helmet"), EMERALD_HELMET);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "emerald_chestplate"), EMERALD_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "emerald_leggings"), EMERALD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "emerald_boots"), EMERALD_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "tungsten_ingot"), TUNGSTEN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "tungsten_chestplate"), TUNGSTEN_CHESTPLATE);

        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "vanadium_sword"), VANADIUM_SWORD);

        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "silver_ingot"), SILVER_INGOT);

        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "copper_ingot"), COPPER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "tin_ingot"), TIN_INGOT);

        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "transistor"), TRANSISTOR);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "processor"), PROCESSOR);

    }
}