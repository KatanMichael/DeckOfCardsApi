package com.michaelkatan.DeckOfCardsApi.models

class Deck(val deckId: String, val isShuffeld: Boolean, var remaningCards: Int,
           @Transient var numberOfDecks: Int = 1) {


}