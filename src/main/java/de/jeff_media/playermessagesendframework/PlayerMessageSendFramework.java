package de.jeff_media.playermessagesendframework;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayerMessageSendFramework {

    private final StringMessageComputer computer;
    private final PlayerPermissionResolver resolver;

    public PlayerMessageSendFramework(StringMessageComputer computer, PlayerPermissionResolver resolver) {
        this.computer = computer;
        this.resolver = resolver;
    }

    public void sendMessageToPlayersWithPermission() {
        // player iterator
        Iterator<? extends Player> playerIterator = Bukkit.getOnlinePlayers().iterator();

        // players with permission
        List<Player> playersWithPermission = new ArrayList<>();

        // iterate
        while (playerIterator.hasNext()) {
            Player current = playerIterator.next();
            PlayerPermissionResolver playerPermissionResolver = resolver;

            if (playerPermissionResolver.hasPermission(current)) {
                playersWithPermission.add(current);
            }
        }

        StringMessageComputer stringMessageComputer = computer;

        // loop through the players and send a message
        for (Player player : playersWithPermission) {
            // send them a message
            try {
                Method sendMessage = Player.class.getMethod("sendMessage", String.class);
                sendMessage.invoke(player, stringMessageComputer.compute());
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

}