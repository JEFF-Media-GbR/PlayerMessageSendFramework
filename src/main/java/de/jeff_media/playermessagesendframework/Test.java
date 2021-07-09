package de.jeff_media.playermessagesendframework;

import de.jeff_media.playermessagesendframework.PlayerMessageSendFramework;
import de.jeff_media.playermessagesendframework.PlayerPermissionResolver;
import de.jeff_media.playermessagesendframework.StringMessageComputer;

public class Test {

    private static void test() {
        StringMessageComputer stringMessageComputer = new StringMessageComputer("This is my message");
        PlayerPermissionResolver playerPermissionResolver = new PlayerPermissionResolver("the.permission");
        PlayerMessageSendFramework worker = new PlayerMessageSendFramework(stringMessageComputer, playerPermissionResolver);
        worker.sendMessageToPlayersWithPermission();
    }
}
