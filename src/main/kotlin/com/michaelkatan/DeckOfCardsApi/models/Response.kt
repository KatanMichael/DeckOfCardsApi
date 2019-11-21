package com.michaelkatan.DeckOfCardsApi.models

data class Response(val code: Int, val deckId: String,
                    val shuffled: Boolean, val remainingCards : Int)
