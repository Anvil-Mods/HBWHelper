/*
 * HBW Helper: Hypixel Bed Wars Helper Minecraft Forge Mod
 * Copyright (C) 2018 Leo3418
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

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * The client proxy of this mod, which powers almost all functions of this mod
 * because this mod is designed for a physical client.
 *
 * @author Leo
 * @see <a href="http://mcforge.readthedocs.io/en/latest/concepts/sides/">
 *     Minecraft Forge documentation on sides</a>
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void onFMLPreInitialization(FMLPreInitializationEvent event) {
        super.onFMLPreInitialization(event);
    }

    @Override
    public void onFMLInitialization(FMLInitializationEvent event) {
        super.onFMLInitialization(event);
        EventManager.getInstance();
    }

    @Override
    public void onFMLPostInitialization(FMLPostInitializationEvent event) {
        super.onFMLPostInitialization(event);
    }
}
