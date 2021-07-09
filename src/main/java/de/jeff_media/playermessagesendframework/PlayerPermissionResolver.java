package de.jeff_media.playermessagesendframework;

import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permissible;

/**
 * Original code by yakovliam // https://www.spigotmc.org/members/yakovliam.235587/
 */
@RequiredArgsConstructor
class PlayerPermissionResolver {

    private final String permission;

    public boolean hasPermission(Player context) {
        return ((Permissible)context).hasPermission(permission);
    }
}