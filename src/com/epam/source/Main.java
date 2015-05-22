package com.epam.source;

import java.util.ArrayList;

/**
 * Created by Ruzhkov Nikolay on 22.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList SubscribersList = new ArrayList();
        Services RealUnlimit = new Services("RealUnlimit-25",(int) 3300);
        Services AccessibelUnlimit = new Services("AccessibleUnlimit",(int) 2000);
        Subscribers User1 = new Subscribers("Ivanov I.I.", "Pobedy 12/1 - 38p");
        ConnectedSubscribers ConUser1 = new ConnectedSubscribers(User1.adres, User1.nameSubscriber, RealUnlimit.nameService, RealUnlimit.cost);
        Subscribers User2 = new Subscribers("Userov U.U.", "Dymitrova 39 - 9");
        ConnectedSubscribers ConUser2 = new ConnectedSubscribers(User2.adres, User2.nameSubscriber, AccessibelUnlimit.nameService, AccessibelUnlimit.cost);
        
    }
}
