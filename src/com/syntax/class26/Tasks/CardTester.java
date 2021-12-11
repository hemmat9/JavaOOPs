package com.syntax.class26.Tasks;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardTester {
    public static void main(String[] args) {
        LinkedList<Card>linkedList = new LinkedList<>();
        linkedList.add(new Visa("Visa"));
        linkedList.add(new MasterCard("MasterCard"));
        linkedList.add(new AmericanExpress("AmericanExpress"));

        for(Card card: linkedList){
            card.interest();
            card.payment();
        }
        System.out.println(linkedList);
    }
}
