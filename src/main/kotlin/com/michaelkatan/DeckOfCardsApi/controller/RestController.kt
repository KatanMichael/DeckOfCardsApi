package com.michaelkatan.DeckOfCardsApi.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController
{
    @GetMapping(path = "/")
    fun index() : String
    {
        return "Hello, World!"
    }
}