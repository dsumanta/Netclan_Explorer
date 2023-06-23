package com.example.netclanexplorer

import PersonAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

val person = arrayOf(
    People_details(
       "SURAJ KUMAR BEHERA",
        "Rourkela ",
        "Business",
        "9.0 k.m",
        "Coffee",
        "Dating",
        "Business",
        "Reading",
        "Traveling",
        "Hi im open to new connections",
        "SB"
    ),
    People_details(
        "SUMANTA DAS",
        "Balasore Tourist Center",
        "Business",
        "15.0 k.m",
        "Cricket",
        "Designing",
        "Trading",
        "Reading",
        "Traveling",
        "Hi im open to new connections",
        "SD"
    ),
    People_details(
        "MANASAH BARAL",
        "Bhubaneswar Smart City",
        "Teaching",
        "34.0 k.m",
        "Coffee",
        "Mentorship",
        "Business",
        "Reading",
        "Singing",
        "Hi im open to new connections",
        "MB"
    ),
    People_details(
        "Pritam Agarwal",
        "Cuttack Silver City",
        "Entrepreneur",
        "31.0 k.m",
        "Tea",
        "Dating",
        "Business",
        "Public speaking",
        "Traveling",
        "Hi im open to new connections",
        "PA"
    ),
    People_details(
        "Ankit Sharma",
        "Bengaluru",
        "Entrepreneur",
        "3.2 k.m",
        "Tea",
        "Dating",
        "Business",
        "Public speaking",
        "Traveling",
        "Hi im open to new connections",
        "AS"
    ),
    People_details(
        "Swati Gupta",
        "Chennai",
        "Entrepreneur",
        "9.7 k.m",
        "Tea",
        "Dating",
        "Business",
        "Public speaking",
        "Traveling",
        "Hi im open to new connections",
        "SG"
    ),
    People_details(
        "John Smith",
        "New York City",
        "Engineer",
        "15.0 k.m",
        "Coffee",
        "Reading",
        "Technology",
        "Photography",
        "Hiking",
        "Looking for career opportunities",
        "JS"
    ),
    People_details(
        "Emily Johnson",
        "Los Angeles",
        "Artist",
        "10.5 k.m",
        "Matcha",
        "Painting",
        "Art",
        "Writing",
        "Yoga",
        "Passionate about creativity",
        "EJ"
    ),
    People_details(
        "Michael Davis",
        "Chicago",
        "Teacher",
        "8.2 k.m",
        "Herbal tea",
        "Cooking",
        "Education",
        "Music",
        "Gardening",
        "Lifelong learner",
        "MD"
    ),
    People_details(
        "Sophia Anderson",
        "San Francisco",
        "Marketing Executive",
        "20.3 k.m",
        "Iced coffee",
        "Photography",
        "Marketing",
        "Networking",
        "Traveling",
        "Passionate about branding",
        "SA"
    ),
    People_details(
        "Ethan Martinez",
        "Miami",
        "Surgeon",
        "5.6 k.m",
        "Green tea",
        "Playing guitar",
        "Medicine",
        "Volunteering",
        "Scuba diving",
        "Saving lives is my passion",
        "EM"
    ),
    People_details(
        "Olivia Thompson",
        "Seattle",
        "Writer",
        "15.7 k.m",
        "Chai",
        "Writing",
        "Literature",
        "Blogging",
        "Hiking",
        "Dreaming in words",
        "OT"
    ),
    People_details(
        "Ava Lee",
        "Toronto",
        "Graphic Designer",
        "6.4 k.m",
        "Cappuccino",
        "Illustration",
        "Design",
        "Photography",
        "Yoga",
        "Seeking artistic collaborations",
        "AL"
    ),
    People_details(
        "Mia Clark",
        "Sydney",
        "Entrepreneur",
        "3.2 k.m",
        "Bubble tea",
        "Traveling",
        "Business",
        "Networking",
        "Surfing",
        "Building my own empire",
        "MC"
    ),
    People_details(
        "Shreya Patel",
        "Surat",
        "Entrepreneur",
        "18.9 k.m",
        "Tea",
        "Dating",
        "Business",
        "Public speaking",
        "Traveling",
        "Hi im open to new connections",
        "SP"
    ),
    People_details(
        "UMER QUURESHY",
        "Cuttack Silver City",
        "SALESPERSON",
        "20.0 k.m",
        "Traveling",
        "Dating",
        "Business",
        "Public speaking",
        "Running",
        "Hi im open to new connections",
        "UQ"
    )
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PersonAdapter(person)
        val refine:Button=findViewById(R.id.refine_Screen)
        refine.setOnClickListener{
            val intent = Intent(this@MainActivity, RefineActivity::class.java)
            startActivity(intent)
        }


    }
}
