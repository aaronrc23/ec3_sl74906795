package com.example.myapplication
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityCardpersBinding


class RvAvatarListAdapter(val personajes: List<Personajes>): RecyclerView.Adapter<PersonajesVH>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesVH {
        val binding = ActivityCardpersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonajesVH(binding)
    }

    override fun getItemCount(): Int  = personajes.size

    override fun onBindViewHolder(holder: PersonajesVH, position: Int) {
        holder.bind(personajes.run { get(position) })
    }


}

class PersonajesVH(private val binding: ActivityCardpersBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(person: Personajes) {
        Glide.with(binding.root.context)
            .load(person.photoUrl)
            .into(binding.imagenView)
        binding.txtname.text = person.name
        binding.txtalies.text = person.allies.toString()

    }

}