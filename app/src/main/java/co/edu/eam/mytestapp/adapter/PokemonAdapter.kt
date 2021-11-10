package co.edu.eam.mytestapp.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import co.edu.eam.mytestapp.databinding.ItemPokemonBinding
import co.edu.eam.mytestapp.model.pokemon.Pokemon
import com.bumptech.glide.Glide
import co.edu.eam.mytestapp.R

class PokemonAdapter(var lista:Array<Pokemon?>):RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = ItemPokemonBinding.inflate( LayoutInflater.from(parent.context), parent, false )
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindPokemon(lista.get(position))
    }

    override fun getItemCount(): Int = lista.size

    inner class ViewHolder(var view:ItemPokemonBinding):RecyclerView.ViewHolder(view.root){

        fun bindPokemon(pokemon: Pokemon?){
            if(pokemon!=null) {
                Glide.with(view.imgPoke.context)
                    .load(pokemon.image)
                    .into(view.imgPoke)
                view.numPoke.text = pokemon.id.toString()
                view.namePoke.text = pokemon.name
                Log.v("TIPES", pokemon.toString())

                Glide.with(view.typePoke.context)
                    .load("https://raw.githubusercontent.com/GilberttValentine/practica-app-movil/master/sprites/types/${pokemon.types[0].type.name}.png")
                    .into(view.typePoke)


                //view.contenedorPokemon.setBackgroundColor(R.color.type_normal)

                /*when (pokemon.types[0].type.name) {
                    "normal" -> {
                        view.contenedorPokemon.setBackgroundColor(R.color.type_normal)
                        Log.v("NORMAl", pokemon.toString())
                    }

                    "fighting" -> view.contenedorPokemon.setBackgroundColor(R.color.type_fighting)

                    "flying" -> view.contenedorPokemon.setBackgroundColor(R.color.type_flying)

                    "poison" -> view.contenedorPokemon.setBackgroundColor(R.color.type_poison)

                    "ground" -> view.contenedorPokemon.setBackgroundColor(R.color.type_ground)

                    "rock" -> view.contenedorPokemon.setBackgroundColor(R.color.type_rock)

                    "bug" -> view.contenedorPokemon.setBackgroundColor(R.color.type_bug)

                    "steel" -> view.contenedorPokemon.setBackgroundColor(R.color.type_steel)

                    "ghost" -> view.contenedorPokemon.setBackgroundColor(R.color.type_ghost)

                    "fire" -> view.contenedorPokemon.setBackgroundColor(R.color.type_fire)

                    "water" -> view.contenedorPokemon.setBackgroundColor(R.color.type_water)

                    "grass" -> view.contenedorPokemon.setBackgroundColor(R.color.type_grass)

                    "electric" -> view.contenedorPokemon.setBackgroundColor(R.color.type_electric)

                    "psychic" -> view.contenedorPokemon.setBackgroundColor(R.color.type_psychic)

                    "ice" -> view.contenedorPokemon.setBackgroundColor(R.color.type_ice)

                    "dragon" -> view.contenedorPokemon.setBackgroundColor(R.color.type_dragon)

                    "dark" -> view.contenedorPokemon.setBackgroundColor(R.color.type_dark)

                    "fairy" -> view.contenedorPokemon.setBackgroundColor(R.color.type_fairy)

                    else -> view.contenedorPokemon.setBackgroundColor(R.color.rojo)

                }*/
                //view.contenedorPokemon.setBackgroundColor(R.color.type_normal)
            }
        }
    }

}