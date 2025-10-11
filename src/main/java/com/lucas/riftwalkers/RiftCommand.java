package com.lucas.riftwalkers;

import com.mojang.brigadier.CommandDispatcher;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.World;

public class RiftCommand {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) ->
                dispatcher.register(CommandManager.literal("riftwarp").executes(ctx -> {
                    ServerCommandSource source = ctx.getSource();
                    ServerPlayerEntity player = source.getPlayer();
                    if (player == null) return 0;

                    RegistryKey<World> riftWorldKey = RegistryKey.of(RegistryKey.ofRegistry(World.DIMENSION_KEY.getValue()), new Identifier("riftwalkers", "rift_dimension"));
                    World riftWorld = source.getServer().getWorld(riftWorldKey);

                    if (riftWorld == null) {
                        source.sendFeedback(() -> Text.of("Rift dimension not found!"), false);
                        return 0;
                    }

                    player.teleport((net.minecraft.server.world.ServerWorld) riftWorld, 0, 100, 0, player.getYaw(), player.getPitch());
                    source.sendFeedback(() -> Text.of("Teleported to Rift Dimension!"), false);

                    return 1;
                }))
        );
    }
}
