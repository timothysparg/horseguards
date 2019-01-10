package com.jessitron.hg;


import java.io.IOException;


class HorseguardsController {

    public String storingResponse() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        HorseguardsResponse response = client.get("https://bananas.com")
            .execute();

        return "App running: Served from " + getClass().getName() +
                " got " + response.statusCode();
    }

    public String storingStatusCode() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        int statusCode = client.get("https://bananas.com")
                .execute()
                .statusCode();

        return "App running: Served from " + getClass().getName() +
                " got " + statusCode;
    }

}
