package com.jessitron.hg;


import java.io.IOException;


class HorseguardsController {

    public String root() throws IOException {

        HorseguardsClient client = new HorseguardsClient();

        HorseguardsResponse response = client.get("https://bananas.com")
            .execute();

        return "App running: Served from " + getClass().getName() +
                " got " + response.statusCode;
    }

}
