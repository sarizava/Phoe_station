package com.epam.source;

/**
 * Created by Ruzhkov Nikolay on 22.05.2015.
 */
public class ConnectedSubscribers {
    String adres;
    String nameSubscriber;
    String nameService;
    int cost;
    ConnectedSubscribers(String adres, String nameSubscriber, String nameService, int cost){
        this.adres = adres;
        this.nameSubscriber = nameSubscriber;
        this.nameService = nameService;
        this.cost = cost;
    }
}
