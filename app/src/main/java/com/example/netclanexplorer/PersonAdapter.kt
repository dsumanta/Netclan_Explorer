import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.netclanexplorer.R

import androidx.recyclerview.widget.RecyclerView
import com.example.netclanexplorer.People_details

class PersonAdapter(private val person: Array<People_details>) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.people_details, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val currentPerson = person[position]
        holder.nameTextView.text = currentPerson.name
        holder.About1.text=currentPerson.about1
        holder.About2.text=currentPerson.about2
        holder.Distance.text=currentPerson.distance
        holder.Hobbie1.text=currentPerson.hobie1
        holder.Hobbie2.text=currentPerson.hobie2
        holder.Hobbie3.text=currentPerson.hobie3
        holder.Hobbie4.text=currentPerson.hobie4
        holder.Hobbie5.text=currentPerson.hobie5
        holder.Community.text=currentPerson.community
        holder.Image.text=currentPerson.image
    }

    override fun getItemCount(): Int {
        return person.size
    }

    inner class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.name)
        val About1:TextView=itemView.findViewById(R.id.about_1)
        val About2:TextView=itemView.findViewById(R.id.about_2)
        val Distance:TextView=itemView.findViewById(R.id.distance)
        val Hobbie1 :TextView=itemView.findViewById(R.id.hobbie_1)
        val Hobbie2 :TextView=itemView.findViewById(R.id.hobbie_2)
        val Hobbie3 :TextView=itemView.findViewById(R.id.hobbie_3)
        val Hobbie4 :TextView=itemView.findViewById(R.id.hobbie_4)
        val Hobbie5 :TextView=itemView.findViewById(R.id.hobbie_5)
        val Community:TextView=itemView.findViewById(R.id.community)
        val Image:TextView=itemView.findViewById(R.id.image)
    }
}
