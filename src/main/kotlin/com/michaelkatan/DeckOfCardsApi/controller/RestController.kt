package com.michaelkatan.DeckOfCardsApi.controller

import com.google.gson.Gson
import com.michaelkatan.DeckOfCardsApi.models.Card
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController
{
    val gson = Gson()

    @GetMapping(path = ["/{id}"])
    fun index(@PathVariable id: Int = 0) : String
    {
        return "Hello, World! $id"
    }

    @GetMapping(path = ["/deck/new/shuffle"])
    fun getNewDeck(@RequestParam(name = "count") count: String) : String
    {
        //TODO Add feature
        return "New deck with count of ${count}"
    }

    @GetMapping(path = ["/deck/{deckId}/draw/"])
    fun getCardsFromDeck(@RequestParam(name = "count", required = true) count: Int,
                         @PathVariable(name = "deckId") deckId : String) : String
    {

        val card = Card(deckId,"ace","club","ac")

        //TODO Add feature
        return gson.toJson(card)
    }

    @GetMapping(path = ["/deck/{deckId}/shuffle"])
    fun shuffleDeck(@PathVariable(name = "deckId") deckId : String) : String
    {
        //TODO Add feature
        return "Deck $deckId was shuffled"
    }

    @GetMapping(path = ["/deck/new"])
    fun getBrandNewDeck() : String
    {
    
        //TODO Add feature
        return "This is a brand new deck"
    }


}