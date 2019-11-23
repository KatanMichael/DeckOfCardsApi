package com.michaelkatan.DeckOfCardsApi.models

data class Response(var code: Int, var deckId: String,
                    var shuffled: Boolean, var remainingCards: Int,
                    var drawCards: ArrayList<Card>? = null,
                    var message : String? = null)
