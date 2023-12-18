package com.example.pokedex_app.pokeapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.pokedex_app.models.PokemonRespuesta;


public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);

}
