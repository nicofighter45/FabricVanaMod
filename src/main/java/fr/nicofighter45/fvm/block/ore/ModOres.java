package fr.nicofighter45.fvm.block.ore;

import fr.nicofighter45.fvm.FVM;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModOres {

    public static final Block VANADIUM_ORE = new VanadiumOre();
    public static final Block TUNGSTEN_ORE = new TungstenOre();
    public static final Block SILVER_ORE = new SilverOre();
    public static final Block COPPER_ORE = new CopperOre();
    public static final Block TIN_ORE = new TinOre();

    //command to delete stone block behind you to see the generation of ores
    //fill ~-8 0 ~-8 ~8 ~ ~8 minecraft:air replace minecraft:stone

    public static void registerAll(){

        //création minerai de vanadium
        Registry.register(Registry.BLOCK, new Identifier(FVM.MODID, "vanadium_ore"), VANADIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "vanadium_ore"), new BlockItem(VANADIUM_ORE, new Item.Settings().group(ItemGroup.MISC)));

        //génération du minearais de vanadium
        ConfiguredFeature<?, ?> VANADIUM_ORE_GENERATION = Feature.ORE
                .configure(new OreFeatureConfig(
                        new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
                        VANADIUM_ORE.getDefaultState(),

                        4))
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        55,
                        55,
                        70)))
                .spreadHorizontally()
                .repeat(1);


        RegistryKey<ConfiguredFeature<?, ?>> vanadium_ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(FVM.MODID, "vanadium_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, vanadium_ore.getValue(), VANADIUM_ORE_GENERATION);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, vanadium_ore);



        //création minerai de tungsten
        Registry.register(Registry.BLOCK, new Identifier(FVM.MODID, "tungsten_ore"), TUNGSTEN_ORE);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "tungsten_ore"), new BlockItem(TUNGSTEN_ORE, new Item.Settings().group(ItemGroup.MISC)));

        //génération du minearai de tungsten
        ConfiguredFeature<?, ?> TUNGSTEN_ORE_GENERATION = Feature.ORE
                .configure(new OreFeatureConfig(
                        new BlockMatchRuleTest(Blocks.STONE),
                        TUNGSTEN_ORE.getDefaultState(),

                        4))
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        5,
                        5,
                        15)))
                .spreadHorizontally()
                .repeat(3);

        RegistryKey<ConfiguredFeature<?, ?>> tungsten_ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(FVM.MODID, "tungsten_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, tungsten_ore.getValue(), TUNGSTEN_ORE_GENERATION);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, tungsten_ore);

        //création minerai d'argent
        Registry.register(Registry.BLOCK, new Identifier(FVM.MODID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "silver_ore"), new BlockItem(SILVER_ORE, new Item.Settings().group(ItemGroup.MISC)));

        //génération du minearais d'argent
        ConfiguredFeature<?, ?> SILVER_ORE_GENERATION = Feature.ORE
                .configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.NETHERRACK),
                        SILVER_ORE.getDefaultState(),

                        4))
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        30,
                        30,
                        40)))
                .spreadHorizontally()
                .repeat(4);


        RegistryKey<ConfiguredFeature<?, ?>> silver_ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(FVM.MODID, "silver_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, silver_ore.getValue(), SILVER_ORE_GENERATION);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, silver_ore);

        //création minerai de cuivre
        Registry.register(Registry.BLOCK, new Identifier(FVM.MODID, "copper_ore"), COPPER_ORE);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "copper_ore"), new BlockItem(COPPER_ORE, new Item.Settings().group(ItemGroup.MISC)));

        //génération du minearais de cuivre
        ConfiguredFeature<?, ?> COPPER_ORE_GENERATION = Feature.ORE
                .configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.STONE),
                        COPPER_ORE.getDefaultState(),

                        8))
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        20,
                        20,
                        70)))
                .spreadHorizontally()
                .repeat(6);


        RegistryKey<ConfiguredFeature<?, ?>> copper_ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(FVM.MODID, "copper_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, copper_ore.getValue(), COPPER_ORE_GENERATION);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, copper_ore);

        //création minerai d'étain
        Registry.register(Registry.BLOCK, new Identifier(FVM.MODID, "tin_ore"), TIN_ORE);
        Registry.register(Registry.ITEM, new Identifier(FVM.MODID, "tin_ore"), new BlockItem(TIN_ORE, new Item.Settings().group(ItemGroup.MISC)));

        //génération du minearais de cuivre
        ConfiguredFeature<?, ?> TIN_ORE_GENERATION = Feature.ORE
                .configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.STONE),
                        TIN_ORE.getDefaultState(),

                        8))
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        20,
                        20,
                        70)))
                .spreadHorizontally()
                .repeat(4);


        RegistryKey<ConfiguredFeature<?, ?>> tin_ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(FVM.MODID, "tin_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, tin_ore.getValue(), TIN_ORE_GENERATION);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, tin_ore);
    }

}