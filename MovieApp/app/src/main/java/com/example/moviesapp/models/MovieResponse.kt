package com.example.moviesapp.models

data class MovieResponse(
    val result: List<Movie> = mutableListOf(
        Movie(
            id = 1,
            name = "Fast and Furious: Tokyo Drift",
            description = "In order to avoid jail time, an errant car racer" +
                    "is sent to live with his father in Tokyo." +
                    "However, he finds himself in trouble once again when he becomes a major competitor in drifting.",
            director = "Justin Lin",
            actors = listOf(
                "Lucas Black",
                "Bow Wow",
                "Sung Kang",
                "Brian Tee"
            )
        ),
        Movie(
            id = 2,
            name = "Oppenheimer",
            description = "During World War II, Lt. Gen. Leslie Groves Jr." +
                    "appoints physicist J. Robert Oppenheimer to work on the top-secret Manhattan Project." +
                    "Oppenheimer and a team of scientists spend years developing and designing the atomic bomb." +
                    "Their work comes to fruition on July 16, 1945, as they witness the world's first nuclear explosion," +
                    "forever changing the course of history.",
            director = "Christopher Nolan",
            actors = listOf(
                "Cillian Murphy",
                "Emily Blunt",
                "Matt Damon",
                "Robert Downey Jr."
            )
        ),
        Movie(
            id = 3,
            name = "The Dark Knight",
            description = "Batman has a new foe, the Joker, who is an accomplished criminal hell-bent on decimating Gotham City." +
                    "Together with Gordon and Harvey Dent, Batman struggles to thwart the Joker before it is too late.",
            director = "Christopher Nolan",
            actors = listOf(
                "Christian Bale",
                "Michael Caine",
                "Heath Ledger",
                "Gary Oldman"
            )
        )
    )
)
