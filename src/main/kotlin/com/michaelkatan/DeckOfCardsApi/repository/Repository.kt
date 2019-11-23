package com.michaelkatan.DeckOfCardsApi.repository

import com.michaelkatan.DeckOfCardsApi.Util.Util
import com.michaelkatan.DeckOfCardsApi.models.Card
import com.michaelkatan.DeckOfCardsApi.models.Deck
import java.util.*
import kotlin.collections.HashMap
import java.util.Stack


object Repository
{
    val allDecks : HashMap<String, Deck> = HashMap()
    val cardsOfDecks : HashMap<String ,Stack<Card>> = HashMap()
    val util = Util.getInstance()


    fun addNewDeckToRepository(cards: ArrayList<Card>,isSuffeld: Boolean):Deck
    {
        val newId = UUID.randomUUID().toString().subSequence(0,8).toString()
        val newDeck = Deck(newId,isSuffeld,cards.size)
        allDecks[newId] = newDeck

        cardsOfDecks[newId] = Stack<Card>()
        cardsOfDecks[newId]?.addAll(cards)

        return newDeck
    }

    fun getCardsFromDeck(deckId: String, count: Int): ArrayList<Card>?
    {
        val deck = cardsOfDecks.get(deckId)
        var resList = ArrayList<Card>()

        if(deck?.size == 0)
        {
            return null
        }

        for(i in 0 until count)
        {
            if (deck != null)
            {
                if(deck.size > 0)
                {
                    resList.add(deck.pop())
                }
            }
        }

        allDecks.get(deckId)?.remaningCards = deck!!.size

        return resList
    }

    fun reshuffleDeck(deckId: String)
    {
        val deck = allDecks.get(deckId)
        val newCards = util.getNewDeck(deck!!.isShuffeld, "", deck.numberOfDecks)

        cardsOfDecks[deckId] = Stack<Card>()
        cardsOfDecks[deckId]?.addAll(newCards)

        deck.remaningCards = newCards.size
    }

}