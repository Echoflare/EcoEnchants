package com.willfp.ecoenchants.v1_16_R1;

import com.willfp.ecoenchants.nms.API.OpenInventoryWrapper;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class OpenInventory implements OpenInventoryWrapper {
    @Override
    public Object getOpenInventory(Player player) {
        return ((CraftPlayer) player).getHandle().activeContainer;
    }
}
