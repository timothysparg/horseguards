package com.jessitron.hg;


import java.io.IOException;


class HorseguardsController {

    public String root() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        String response = client.get("https://bananas.com")
            .execute();

        return "App running: Served from " + getClass().getName();
    }

}
