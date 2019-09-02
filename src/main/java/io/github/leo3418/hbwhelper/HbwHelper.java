/*
 * HBW Helper: Hypixel Bed Wars Helper Minecraft Forge Mod
 * Copyright (C) 2019 Leo3418
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.leo3418.hbwhelper;

import com.mojang.brigadier.CommandDispatcher;
import io.github.leo3418.hbwhelper.command.CommandManager;
import io.github.leo3418.hbwhelper.command.ConfigCommand;
import net.minecraft.command.CommandSource;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * The main class of HBW Helper mod.
 *
 * @author Leo
 */
@Mod(HbwHelper.MOD_ID)
public final class HbwHelper {
    public static final String NAME = "HBW Helper";
    public static final String MOD_ID = "hbwhelper";

    public HbwHelper() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::clientSetup);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        ConfigManager.getInstance().initConfig();
        EventManager.getInstance().registerOnEventBus();
        KeyBindings.registerBindings();
        CommandDispatcher<CommandSource> commandDispatcher =
                CommandManager.getInstance().getDispatcher();
        ConfigCommand.register(commandDispatcher);
    }
}
