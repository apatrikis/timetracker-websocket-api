/*
 * PRODYNA PAC 2015 - Time Tracker
 * Anastasios Patrikis
 */
package com.prodyna.pac.timetracker.websocket;

import com.prodyna.pac.timetracker.cluster.ClusterMessage;
import com.prodyna.pac.timetracker.server.event.BookingForApporvalEvent;
import com.prodyna.pac.timetracker.server.event.BookingForReworkEvent;

/**
 * {@code Interface} definition for classes that will handle events.
 *
 * @author apatrikis
 */
public interface MessageBrokerAPI {

    /**
     * Processing of {@link BookingForApporvalEvent}s.
     *
     * @param event The {@code Event} to handle.
     */
    public void sendApproval(BookingForApporvalEvent event);

    /**
     * Processing of {@link BookingForReworkEvent}s.
     *
     * @param event The {@code Event} to handle.
     */
    public void sendRework(BookingForReworkEvent event);

    /**
     * Processing of a received {@link ClusterMessage}.
     *
     * @param message The message to handle.
     */
    public void receive(ClusterMessage message);
}
