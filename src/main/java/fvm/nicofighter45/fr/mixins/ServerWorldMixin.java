package fvm.nicofighter45.fr.mixins;

import fvm.nicofighter45.fr.FVM;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;
import java.util.function.BooleanSupplier;

@Mixin(ServerWorld.class)
public class ServerWorldMixin {

    ServerWorld serverworld = (ServerWorld) (Object) this;
    private int start = 1;


    @Inject(at = @At("HEAD"), method = "tick")
    public void tick(BooleanSupplier shouldKeepTicking, CallbackInfo info) {
        if(start != 0){
            start = 0;
            FVM.serverworld.add(serverworld);
            FVM.minecraftServer = serverworld.getServer();
            System.out.println("Printed : " + serverworld.getServer().getName());
        }
    }

    @Inject(at = @At("HEAD"), method = "onPlayerConnected")
    public void onPlayerConnected(ServerPlayerEntity player, CallbackInfo info) {
        FVM.dataBaseManager.addNewPlayer(player.getEntityName());
        Objects.requireNonNull(player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH)).setBaseValue(FVM.dataBaseManager.getPlayer(player.getEntityName()).getHeart());
    }

    @Inject(at = @At("HEAD"), method = "onPlayerRespawned")
    public void onPlayerRespawned(ServerPlayerEntity player, CallbackInfo info) {
        Objects.requireNonNull(player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH)).setBaseValue(FVM.dataBaseManager.getPlayer(player.getEntityName()).getHeart());
    }

}