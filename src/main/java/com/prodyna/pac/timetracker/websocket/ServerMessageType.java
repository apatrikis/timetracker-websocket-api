/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodyna.pac.timetracker.websocket;

/**
 * Enumeration of message types that the server may send to the client.
 *
 * @author apatrikis
 */
public enum ServerMessageType {

    /**
     * An general message: {@code servermessage}
     */
    GENRAL("servermessage"),
    /**
     * A reponse to a received message: {@code response}
     */
    RESPONSE("response"),
    /**
     * Registration of the client: {@code register}
     */
    REGISTER_EMAIL("register"),
    /**
     * Unregistration of the client: {@code unregister}
     */
    UNREGISTER_EMAIL("unregister");

    private final String typeName;

    /**
     * Constructor.
     *
     * @param name The type name to use for the {@link #toString()} mehod.
     */
    private ServerMessageType(String name) {
        typeName = name;
    }

    @Override
    public String toString() {
        return typeName;
    }
}
