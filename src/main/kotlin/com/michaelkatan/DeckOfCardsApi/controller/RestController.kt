package com.michaelkatan.DeckOfCardsApi.controller

import com.google.gson.Gson
import com.michaelkatan.DeckOfCardsApi.util.Util
import com.michaelkatan.DeckOfCardsApi.models.Card
import com.michaelkatan.DeckOfCardsApi.models.Response
import com.michaelkatan.DeckOfCardsApi.repository.Repository
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController
{
    val util = Util
    val gson = Gson()
    val repository = Repository

    @GetMapping(path = ["/{id}"])
    fun index(@PathVariable id: Int = 0) : String
    {
        return "Hello, World! $id"
    }


    @GetMapping(path = ["/deck/new/shuffle"])
    fun getNewDeck(@RequestParam(name = "count", defaultValue = "1") count: String) : String
    {
        val newDeck = util.getNewDeck(true, "", Integer.parseInt(count))

        val newDeckInRepository = repository.addNewDeckToRepository(newDeck, true)

        newDeckInRepository.numberOfDecks = Integer.parseInt(count)

        return gson.toJson(Response(201,newDeckInRepository.deckId,true,newDeckInRepository.remaningCards,null))
    }

    @GetMapping(path = ["/deck/{deckId}/draw/"])
    fun getCardsFromDeck(@RequestParam(name = "count", required = true) count: Int,
                         @PathVariable(name = "deckId") deckId : String) : String
    {
        var response = Response(0,"",false,0,null)

        val deck = repository.allDecks.get(deckId)

        if(deck != null)
        {
            val cards: ArrayList<Card>? = repository.getCardsFromDeck(deck.deckId,count)

            if(cards != null)
            {
                response.code = 200
                response.deckId = deck.deckId
                response.drawCards = cards
                response.remainingCards = deck.remaningCards
            }else
            {
                response.code = 204
                response.deckId = deck.deckId
                response.remainingCards = deck.remaningCards
                response.message = "Deck $deckId is empty"
            }


        }else
        {
            response.code = 410
            response.deckId = deckId
            response.message = "No deck with Id: $deckId was found"
        }


        //TODO Add feature
        return gson.toJson(response)
    }


    @GetMapping(path = ["/deck/{deckId}/shuffle"])
    fun shuffleDeck(@PathVariable(name = "deckId") deckId : String) : String
    {
        val deck = repository.allDecks.get(deckId)
        val response = Response(0,deckId,false,0)

        if(deck != null)
        {
            repository.reshuffleDeck(deckId)
            response.remainingCards = deck.remaningCards
            response.code = 200
            response.shuffled = deck.isShuffeld
            response.message = "Deck $deckId Was Reshuffled"
        }else
        {
            response.code = 404
            response.message = "No deck with Id: $deckId was found"
        }

        return gson.toJson(response)
    }

    @GetMapping(path = ["/deck/new"])
    fun getBrandNewDeck() : String
    {
        val newCards = Util.getNewDeck(false, "", 1)

        val newDeck = repository.addNewDeckToRepository(newCards, false)

        val response = Response(201,newDeck.deckId,newDeck.isShuffeld,newDeck.remaningCards,null,null)

        return gson.toJson(response)
    }


}