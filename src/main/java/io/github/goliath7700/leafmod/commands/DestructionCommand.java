package io.github.goliath7700.leafmod.commands;

import com.mojang.brigadier.Command;
import net.minecraft.commands.CommandSourceStack;

public class DestructionCommand {
    public DestructionCommand() {
        Command<CommandSourceStack> command = context -> {
            CommandSourceStack source = context.getSource();
            return 0;
        };
    }
}
