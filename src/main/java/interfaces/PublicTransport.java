package interfaces;

import data.Stop;

/**
 * defines the basic behavior of a public transport.
 * Allows getting and setting the stop associated with the transport.
 */
public interface PublicTransport {

    /**
     * Gets the current stop.
     *
     * @return a {@link Stop} object representing the current stop.
     */
    Stop getStop();

    /**
     * Sets the stop of the public transport.
     *
     * @param stop a {@link Stop} object representing the new stop.
     */
    void setStop(Stop stop);
}
