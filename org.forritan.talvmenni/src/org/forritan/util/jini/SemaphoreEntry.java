package org.forritan.util.jini;

import net.jini.core.entry.Entry;

public class SemaphoreEntry implements Entry {
    public String resource;

    public SemaphoreEntry() {
    }
    
    public SemaphoreEntry(String resource) {
        this.resource = resource;
    }
}
