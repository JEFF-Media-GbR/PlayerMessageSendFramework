package de.jeff_media.playermessagesendframework;

import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permissible;

@RequiredArgsConstructor
class PlayerPermissionResolver {

    private final String permission;

    public boolean hasPermission(Player context) {
        return ((Permissible)context).hasPermission(permission);
    }
}