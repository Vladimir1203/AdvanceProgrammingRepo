/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.ai.maventransportappclient.sesija;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author Vladimir
 */
public class BuildGson {

    public static Gson buildGson() {
        GsonBuilder builder = new GsonBuilder();
        builder.setDateFormat("MMM d, yyyy");
        builder.setPrettyPrinting();
        return builder.create();
    }

}
