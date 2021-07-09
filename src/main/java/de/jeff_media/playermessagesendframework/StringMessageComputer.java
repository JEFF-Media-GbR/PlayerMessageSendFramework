package de.jeff_media.playermessagesendframework;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StringMessageComputer {

    private final String message;

    public String compute() {
        return message;
    }
}
