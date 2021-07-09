package de.jeff_media.playermessagesendframework;

import lombok.RequiredArgsConstructor;

/**
 * Original code by yakovliam // https://www.spigotmc.org/members/yakovliam.235587/
 */
@RequiredArgsConstructor
public class StringMessageComputer {

    private final String message;

    public String compute() {
        return message;
    }
}
