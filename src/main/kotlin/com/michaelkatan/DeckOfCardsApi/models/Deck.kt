package com.michaelkatan.DeckOfCardsApi.models

data class Deck(val id: String, val shuffled: Boolean,
                val remaining: Int)