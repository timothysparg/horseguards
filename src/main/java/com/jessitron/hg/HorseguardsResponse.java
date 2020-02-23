package com.jessitron.hg;

public class HorseguardsResponse {

    private final int theStatusCode;

    public HorseguardsResponse(int theStatusCode) {
        this.theStatusCode = theStatusCode;
    }

    public int theStatusCode() {
        return theStatusCode;
    }

    public void close() {
        // good job
    }
}
