package com.michaelkatan.DeckOfCardsApi.Util;

import com.michaelkatan.DeckOfCardsApi.models.Card;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Random;

public class Util {
    private static Util ourInstance = new Util();

    public static Util getInstance() {
        if (ourInstance == null) {
            ourInstance = new Util();
        }
        return ourInstance;
    }

    private Util()
    { }

    public ArrayList<Card> getNewDeck(boolean isShuffled,
                                      String onlyCards,int numberOfDecks)
    {
        ArrayList<Card> resDeck = new ArrayList<>();

        ArrayList<Card> tempDeck = new ArrayList<>();

        for(int i = 0; i < numberOfDecks; i++)
        {
            tempDeck.addAll(newDeck());
        }

        if(isShuffled)
        {
            int randomCard = 0;
            Random random = new Random();

            while(tempDeck.size() > 0)
            {
                randomCard = random.nextInt(tempDeck.size());

                resDeck.add(tempDeck.get(randomCard));
                tempDeck.remove(randomCard);
                tempDeck.trimToSize();
            }
        }else
        {
            resDeck.addAll(tempDeck);
        }

        return resDeck;
    }


    private ArrayList<Card> newDeck()
    {
        ArrayList<Card> resNewDeck = new ArrayList<>();

        Card AS = new Card( "https://deckofcardsapi.com/static/img/AS.png", "ACE","SPADES", "AS");
        Card twoS = new Card( "https://deckofcardsapi.com/static/img/2S.png", "2","SPADES", "2S");
        Card threeS = new Card( "https://deckofcardsapi.com/static/img/3S.png", "3","SPADES", "3S");
        Card fourS = new Card( "https://deckofcardsapi.com/static/img/4S.png", "4","SPADES", "4S");
        Card fiveS = new Card( "https://deckofcardsapi.com/static/img/5S.png", "5","SPADES", "5S");
        Card sixS = new Card( "https://deckofcardsapi.com/static/img/6S.png", "6","SPADES", "6S");
        Card sevenS = new Card( "https://deckofcardsapi.com/static/img/7S.png", "7","SPADES", "7S");
        Card eightS = new Card( "https://deckofcardsapi.com/static/img/8S.png", "8","SPADES", "8S");
        Card nineS = new Card( "https://deckofcardsapi.com/static/img/9S.png", "9","SPADES", "9S");
        Card tenS = new Card( "https://deckofcardsapi.com/static/img/0S.png", "10","SPADES", "0S");
        Card JS = new Card( "https://deckofcardsapi.com/static/img/JS.png", "JACK","SPADES", "JS");
        Card QS = new Card( "https://deckofcardsapi.com/static/img/QS.png", "QUEEN","SPADES", "QS");
        Card KS = new Card( "https://deckofcardsapi.com/static/img/KS.png", "KING","SPADES", "KS");
        Card AD = new Card( "https://deckofcardsapi.com/static/img/AD.png", "ACE","DIAMONDS", "AD");
        Card twoD = new Card( "https://deckofcardsapi.com/static/img/2D.png", "2","DIAMONDS", "2D");
        Card threeD = new Card( "https://deckofcardsapi.com/static/img/3D.png", "3","DIAMONDS", "3D");
        Card fourD = new Card( "https://deckofcardsapi.com/static/img/4D.png", "4","DIAMONDS", "4D");
        Card fiveD = new Card( "https://deckofcardsapi.com/static/img/5D.png", "5","DIAMONDS", "5D");
        Card sixD = new Card( "https://deckofcardsapi.com/static/img/6D.png", "6","DIAMONDS", "6D");
        Card sevenD = new Card( "https://deckofcardsapi.com/static/img/7D.png", "7","DIAMONDS", "7D");
        Card eightD = new Card( "https://deckofcardsapi.com/static/img/8D.png", "8","DIAMONDS", "8D");
        Card nineD = new Card( "https://deckofcardsapi.com/static/img/9D.png", "9","DIAMONDS", "9D");
        Card tenD = new Card( "https://deckofcardsapi.com/static/img/0D.png", "10","DIAMONDS", "0D");
        Card JD = new Card( "https://deckofcardsapi.com/static/img/JD.png", "JACK","DIAMONDS", "JD");
        Card QD = new Card( "https://deckofcardsapi.com/static/img/QD.png", "QUEEN","DIAMONDS", "QD");
        Card KD = new Card( "https://deckofcardsapi.com/static/img/KD.png", "KING","DIAMONDS", "KD");
        Card AC = new Card( "https://deckofcardsapi.com/static/img/AC.png", "ACE","CLUBS", "AC");
        Card twoC = new Card( "https://deckofcardsapi.com/static/img/2C.png", "2","CLUBS", "2C");
        Card threeC = new Card( "https://deckofcardsapi.com/static/img/3C.png", "3","CLUBS", "3C");
        Card fourC = new Card( "https://deckofcardsapi.com/static/img/4C.png", "4","CLUBS", "4C");
        Card fiveC = new Card( "https://deckofcardsapi.com/static/img/5C.png", "5","CLUBS", "5C");
        Card sixC = new Card( "https://deckofcardsapi.com/static/img/6C.png", "6","CLUBS", "6C");
        Card sevenC = new Card( "https://deckofcardsapi.com/static/img/7C.png", "7","CLUBS", "7C");
        Card eightC = new Card( "https://deckofcardsapi.com/static/img/8C.png", "8","CLUBS", "8C");
        Card nineC = new Card( "https://deckofcardsapi.com/static/img/9C.png", "9","CLUBS", "9C");
        Card tenC = new Card( "https://deckofcardsapi.com/static/img/0C.png", "10","CLUBS", "0C");
        Card JC = new Card( "https://deckofcardsapi.com/static/img/JC.png", "JACK","CLUBS", "JC");
        Card QC = new Card( "https://deckofcardsapi.com/static/img/QC.png", "QUEEN","CLUBS", "QC");
        Card KC = new Card( "https://deckofcardsapi.com/static/img/KC.png", "KING","CLUBS", "KC");
        Card AH = new Card( "https://deckofcardsapi.com/static/img/AH.png", "ACE","HEARTS", "AH");
        Card twoH = new Card( "https://deckofcardsapi.com/static/img/2H.png", "2","HEARTS", "2H");
        Card threeH = new Card( "https://deckofcardsapi.com/static/img/3H.png", "3","HEARTS", "3H");
        Card fourH = new Card( "https://deckofcardsapi.com/static/img/4H.png", "4","HEARTS", "4H");
        Card fiveH = new Card( "https://deckofcardsapi.com/static/img/5H.png", "5","HEARTS", "5H");
        Card sixH = new Card( "https://deckofcardsapi.com/static/img/6H.png", "6","HEARTS", "6H");
        Card sevenH = new Card( "https://deckofcardsapi.com/static/img/7H.png", "7","HEARTS", "7H");
        Card eightH = new Card( "https://deckofcardsapi.com/static/img/8H.png", "8","HEARTS", "8H");
        Card nineH = new Card( "https://deckofcardsapi.com/static/img/9H.png", "9","HEARTS", "9H");
        Card tenH = new Card( "https://deckofcardsapi.com/static/img/0H.png", "10","HEARTS", "0H");
        Card JH = new Card( "https://deckofcardsapi.com/static/img/JH.png", "JACK","HEARTS", "JH");
        Card QH = new Card( "https://deckofcardsapi.com/static/img/QH.png", "QUEEN","HEARTS", "QH");
        Card KH = new Card( "https://deckofcardsapi.com/static/img/KH.png", "KING","HEARTS", "KH");


        resNewDeck.add(AS);
        resNewDeck.add(twoS);
        resNewDeck.add(threeS);
        resNewDeck.add(fourS);
        resNewDeck.add(fiveS);
        resNewDeck.add(sixS);
        resNewDeck.add(sevenS);
        resNewDeck.add(eightS);
        resNewDeck.add(nineS);
        resNewDeck.add(tenS);
        resNewDeck.add(JS);
        resNewDeck.add(QS);
        resNewDeck.add(KS);

        resNewDeck.add(AD);
        resNewDeck.add(twoD);
        resNewDeck.add(threeD);
        resNewDeck.add(fourD);
        resNewDeck.add(fiveD);
        resNewDeck.add(sixD);
        resNewDeck.add(sevenD);
        resNewDeck.add(eightD);
        resNewDeck.add(nineD);
        resNewDeck.add(tenD);
        resNewDeck.add(JD);
        resNewDeck.add(QD);
        resNewDeck.add(KD);

        resNewDeck.add(AC);
        resNewDeck.add(twoC);
        resNewDeck.add(threeC);
        resNewDeck.add(fourC);
        resNewDeck.add(fiveC);
        resNewDeck.add(sixC);
        resNewDeck.add(sevenC);
        resNewDeck.add(eightC);
        resNewDeck.add(nineC);
        resNewDeck.add(tenC);
        resNewDeck.add(JC);
        resNewDeck.add(QC);
        resNewDeck.add(KC);

        resNewDeck.add(AH);
        resNewDeck.add(twoH);
        resNewDeck.add(threeH);
        resNewDeck.add(fourH);
        resNewDeck.add(fiveH);
        resNewDeck.add(sixH);
        resNewDeck.add(sevenH);
        resNewDeck.add(eightH);
        resNewDeck.add(nineH);
        resNewDeck.add(tenH);
        resNewDeck.add(JH);
        resNewDeck.add(QH);
        resNewDeck.add(KH);

        return resNewDeck;
    }

}

