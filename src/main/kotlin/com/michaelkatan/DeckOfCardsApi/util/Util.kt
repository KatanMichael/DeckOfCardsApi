package com.michaelkatan.DeckOfCardsApi.util

import com.michaelkatan.DeckOfCardsApi.models.Card

import java.util.ArrayList
import java.util.Random

object Util
{

    fun getNewDeck(isShuffled: Boolean,
                   onlyCards: String, numberOfDecks: Int): ArrayList<Card> {
        val resDeck = ArrayList<Card>()

        val tempDeck = ArrayList<Card>()

        for (i in 0 until numberOfDecks) {
            tempDeck.addAll(newDeck())
        }

        if (isShuffled) {
            var randomCard = 0
            val random = Random()

            while (tempDeck.size > 0) {
                randomCard = random.nextInt(tempDeck.size)

                resDeck.add(tempDeck[randomCard])
                tempDeck.removeAt(randomCard)
                tempDeck.trimToSize()
            }
        } else {
            resDeck.addAll(tempDeck)
        }

        return resDeck
    }


    private fun newDeck(): ArrayList<Card> {
        val resNewDeck = ArrayList<Card>()

        val AS = Card("https://deckofcardsapi.com/static/img/AS.png", "ACE", "SPADES", "AS")
        val twoS = Card("https://deckofcardsapi.com/static/img/2S.png", "2", "SPADES", "2S")
        val threeS = Card("https://deckofcardsapi.com/static/img/3S.png", "3", "SPADES", "3S")
        val fourS = Card("https://deckofcardsapi.com/static/img/4S.png", "4", "SPADES", "4S")
        val fiveS = Card("https://deckofcardsapi.com/static/img/5S.png", "5", "SPADES", "5S")
        val sixS = Card("https://deckofcardsapi.com/static/img/6S.png", "6", "SPADES", "6S")
        val sevenS = Card("https://deckofcardsapi.com/static/img/7S.png", "7", "SPADES", "7S")
        val eightS = Card("https://deckofcardsapi.com/static/img/8S.png", "8", "SPADES", "8S")
        val nineS = Card("https://deckofcardsapi.com/static/img/9S.png", "9", "SPADES", "9S")
        val tenS = Card("https://deckofcardsapi.com/static/img/0S.png", "10", "SPADES", "0S")
        val JS = Card("https://deckofcardsapi.com/static/img/JS.png", "JACK", "SPADES", "JS")
        val QS = Card("https://deckofcardsapi.com/static/img/QS.png", "QUEEN", "SPADES", "QS")
        val KS = Card("https://deckofcardsapi.com/static/img/KS.png", "KING", "SPADES", "KS")
        val AD = Card("https://deckofcardsapi.com/static/img/AD.png", "ACE", "DIAMONDS", "AD")
        val twoD = Card("https://deckofcardsapi.com/static/img/2D.png", "2", "DIAMONDS", "2D")
        val threeD = Card("https://deckofcardsapi.com/static/img/3D.png", "3", "DIAMONDS", "3D")
        val fourD = Card("https://deckofcardsapi.com/static/img/4D.png", "4", "DIAMONDS", "4D")
        val fiveD = Card("https://deckofcardsapi.com/static/img/5D.png", "5", "DIAMONDS", "5D")
        val sixD = Card("https://deckofcardsapi.com/static/img/6D.png", "6", "DIAMONDS", "6D")
        val sevenD = Card("https://deckofcardsapi.com/static/img/7D.png", "7", "DIAMONDS", "7D")
        val eightD = Card("https://deckofcardsapi.com/static/img/8D.png", "8", "DIAMONDS", "8D")
        val nineD = Card("https://deckofcardsapi.com/static/img/9D.png", "9", "DIAMONDS", "9D")
        val tenD = Card("https://deckofcardsapi.com/static/img/0D.png", "10", "DIAMONDS", "0D")
        val JD = Card("https://deckofcardsapi.com/static/img/JD.png", "JACK", "DIAMONDS", "JD")
        val QD = Card("https://deckofcardsapi.com/static/img/QD.png", "QUEEN", "DIAMONDS", "QD")
        val KD = Card("https://deckofcardsapi.com/static/img/KD.png", "KING", "DIAMONDS", "KD")
        val AC = Card("https://deckofcardsapi.com/static/img/AC.png", "ACE", "CLUBS", "AC")
        val twoC = Card("https://deckofcardsapi.com/static/img/2C.png", "2", "CLUBS", "2C")
        val threeC = Card("https://deckofcardsapi.com/static/img/3C.png", "3", "CLUBS", "3C")
        val fourC = Card("https://deckofcardsapi.com/static/img/4C.png", "4", "CLUBS", "4C")
        val fiveC = Card("https://deckofcardsapi.com/static/img/5C.png", "5", "CLUBS", "5C")
        val sixC = Card("https://deckofcardsapi.com/static/img/6C.png", "6", "CLUBS", "6C")
        val sevenC = Card("https://deckofcardsapi.com/static/img/7C.png", "7", "CLUBS", "7C")
        val eightC = Card("https://deckofcardsapi.com/static/img/8C.png", "8", "CLUBS", "8C")
        val nineC = Card("https://deckofcardsapi.com/static/img/9C.png", "9", "CLUBS", "9C")
        val tenC = Card("https://deckofcardsapi.com/static/img/0C.png", "10", "CLUBS", "0C")
        val JC = Card("https://deckofcardsapi.com/static/img/JC.png", "JACK", "CLUBS", "JC")
        val QC = Card("https://deckofcardsapi.com/static/img/QC.png", "QUEEN", "CLUBS", "QC")
        val KC = Card("https://deckofcardsapi.com/static/img/KC.png", "KING", "CLUBS", "KC")
        val AH = Card("https://deckofcardsapi.com/static/img/AH.png", "ACE", "HEARTS", "AH")
        val twoH = Card("https://deckofcardsapi.com/static/img/2H.png", "2", "HEARTS", "2H")
        val threeH = Card("https://deckofcardsapi.com/static/img/3H.png", "3", "HEARTS", "3H")
        val fourH = Card("https://deckofcardsapi.com/static/img/4H.png", "4", "HEARTS", "4H")
        val fiveH = Card("https://deckofcardsapi.com/static/img/5H.png", "5", "HEARTS", "5H")
        val sixH = Card("https://deckofcardsapi.com/static/img/6H.png", "6", "HEARTS", "6H")
        val sevenH = Card("https://deckofcardsapi.com/static/img/7H.png", "7", "HEARTS", "7H")
        val eightH = Card("https://deckofcardsapi.com/static/img/8H.png", "8", "HEARTS", "8H")
        val nineH = Card("https://deckofcardsapi.com/static/img/9H.png", "9", "HEARTS", "9H")
        val tenH = Card("https://deckofcardsapi.com/static/img/0H.png", "10", "HEARTS", "0H")
        val JH = Card("https://deckofcardsapi.com/static/img/JH.png", "JACK", "HEARTS", "JH")
        val QH = Card("https://deckofcardsapi.com/static/img/QH.png", "QUEEN", "HEARTS", "QH")
        val KH = Card("https://deckofcardsapi.com/static/img/KH.png", "KING", "HEARTS", "KH")


        resNewDeck.add(AS)
        resNewDeck.add(twoS)
        resNewDeck.add(threeS)
        resNewDeck.add(fourS)
        resNewDeck.add(fiveS)
        resNewDeck.add(sixS)
        resNewDeck.add(sevenS)
        resNewDeck.add(eightS)
        resNewDeck.add(nineS)
        resNewDeck.add(tenS)
        resNewDeck.add(JS)
        resNewDeck.add(QS)
        resNewDeck.add(KS)

        resNewDeck.add(AD)
        resNewDeck.add(twoD)
        resNewDeck.add(threeD)
        resNewDeck.add(fourD)
        resNewDeck.add(fiveD)
        resNewDeck.add(sixD)
        resNewDeck.add(sevenD)
        resNewDeck.add(eightD)
        resNewDeck.add(nineD)
        resNewDeck.add(tenD)
        resNewDeck.add(JD)
        resNewDeck.add(QD)
        resNewDeck.add(KD)

        resNewDeck.add(AC)
        resNewDeck.add(twoC)
        resNewDeck.add(threeC)
        resNewDeck.add(fourC)
        resNewDeck.add(fiveC)
        resNewDeck.add(sixC)
        resNewDeck.add(sevenC)
        resNewDeck.add(eightC)
        resNewDeck.add(nineC)
        resNewDeck.add(tenC)
        resNewDeck.add(JC)
        resNewDeck.add(QC)
        resNewDeck.add(KC)

        resNewDeck.add(AH)
        resNewDeck.add(twoH)
        resNewDeck.add(threeH)
        resNewDeck.add(fourH)
        resNewDeck.add(fiveH)
        resNewDeck.add(sixH)
        resNewDeck.add(sevenH)
        resNewDeck.add(eightH)
        resNewDeck.add(nineH)
        resNewDeck.add(tenH)
        resNewDeck.add(JH)
        resNewDeck.add(QH)
        resNewDeck.add(KH)

        return resNewDeck
    }


}

