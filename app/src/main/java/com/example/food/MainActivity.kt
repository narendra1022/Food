package com.example.food

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // on below line we are creating variables for
    // our swipe to refresh layout, recycler view,
    // adapter and list.
    private lateinit var courseRV: RecyclerView
    private lateinit var courseRVAdapter: CouseRVAdapter
    private lateinit var courseList: ArrayList<CourseRVModal>

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        courseRV = findViewById(R.id.recyclerview)
        courseRV.layoutManager = LinearLayoutManager(this)
        courseList = ArrayList()

        courseList.add(
            CourseRVModal(
                R.drawable.bajji,

                " \n  Hot Bajji\n\n\n INGREDIENTS REQUIRED\n\n    4 green chilli (large)\n" +
                        "   ▢ 2 cup gram flour / besan\n" +
                        "   ▢ 2 tbsp rice flour\n" +
                        "   ▢ ¼ tsp ajwain / carom seeds\n" +
                        "   ▢ ¼ tsp baking soda\n" +
                        "   ▢ ½ tsp salt\n" +
                        "   ▢ ¾ cup water\n" +
                        "   ▢ 1 tbsp oil\n" +
                        "   ▢ oil for frying\n\n" +
                        " PREPARATION PROCESS\n\n" +
                        "   1. firstly, take long green chilis and slit at the centre and remove seeds\n" +
                        "   2. now prepare the bajji batter by taking 2 cup besan and 2 tbsp rice flour in large mixing bowl.\n" +
                        "   3. also add ¼ tsp ajwain, ¼ tsp baking soda and ½ tsp salt.\n" +
                        "   4. mix well making sure everything is combined well.\n" +
                        "   5. now add ½ cup of water and mix well.\n" +
                        "   6. add water as requried and prepare a lump free thick batter.\n" +
                        "   7. further pour 1 tbsp of hot oil over the batter and mix well.\n" +
                        "   8. mix well to smooth and silky batter.\n" +
                        "   9. now dip the green chilli and coat it with besan batter completely.\n" +
                        "   10. wipe off slightly, exposing green chilli slightly.\n" +
                        "   11. deep fry in hot oil dropping batter coated chillis slowly.\n" +
                        "   12. keeping the flame on medium, flip over and fry all the sides.\n" +
                        "   13. fry until the bajjis turn crisp and golden brown.\n" +
                        "   14. finally enjoy mirchi bajji with sauce or chutney."

            )
        )
        courseList.add(
            CourseRVModal( R.drawable.paratta,


                " \n  Paratta\n\n\n  INGREDIENTS \n\n  All purpose flour/Maida  2cups\n" +
                        "  Luke warm water as required\n  Veg oil :1tbsp\n  Salt to taste\n" +
                        "\n  PROCEDURE \n\n   1. Mix all the ingredients in a bowl and knead well to make a dough by adding water little by little, like chappathi dough consistency.\n" +
                        "   2. Knead the dough for 10-minutes to get a nice layered parotta. Cover it with a wet towel, keep it aside for 1 hour.\n" +
                        "   3. Divide the dough into balls in size of your closed palm. Keep the balls under the wet cloth so that it won’t get dry.\n" +
                        "   4. Take a portion and apply some oil on it and roll the ball as thin as possible;apply a little more oil over the rolled dough.(Note: While spreading the dough use enough oil on the surface, so that it wont stick together when you folds).\n" +
                        "   5. Hold the two ends of the dough straight and make pleates layers on the rolled dough starting from one end.\n" +
                        "   6. Holding at one end of the layered dough ,rotate it round and keep aside,again cover with wet towel.\n" +
                        "   7. Place the folded dough on the table, use your hand to spread it.Parotta should be a medium thick round.\n" +
                        "   8. Heat a nonstick pan on medium heat,pour a spoon oil and fry the parotta turning frequently,until speckled brown and firm.\n" +
                        "   9. Keep the cooked porotta in a air tight container.\n" +
                        "   10. When 4-5 parottas are done,place them in a flat surface and tap from the both sides.This is to help the layers to separate.(Note: Do not beat them soo hard,this tapping has to be done when the parotta is hot if not it will break).\n" +
                        "   11. Yummy Kerala Parotta is ready serve with Chiili Chicken,Chicken Curry or Vegetable Kurma and Enjoy"
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.dosa,

                " \n  Dosa\n\n\n    This Masala Dosa Recipe will help you make tasty, aromatic and just the perfect masala dosa at home.    \n One of the most popular South Indian dishes, this Masala Dosa recipe is perfect for beginners. \n    The batter for masala dosas is made with soaked lentils and rice. \n    Then, potatoes and spices are mashed together to prepare a spicy filling for the masala dosa. \n    If you want to learn how to make the batter for crispy masala dosa or how to make spicy masala dosa filling, you are in the right place.\n  Masala Dosa recipe is simply the Indian version of pancakes.\n  This crispy and spicy Dosa recipe is often served with coconut chutney and Sambhar.\n   Make sure that the batter is fermented well and your Masala Dosa will surely taste divine! Pair it with different chutneys and some Payasam for a complete meal. \n   This dish makes for a nice appetiser, so if you have guests dropping by who are fond of South Indian food, then this is a perfect go-to recipe. \n    To make it even tastier, you can add ingredients as per your taste and preference. \n   You can make it more appealing by adding some finely chopped coriander leaves, green chilies and sprinkle some crushed pepper. \n   This simple yet quick recipe can be even packed for picnics as it is not messy and is easy to carry. \n   Moreover, if you are fond of South Indian food, then this one is certainly going to please your taste buds with its amazing flavours. \n   So, the next time when you plan to treat your friends and family with something healthy, try this delicacy and we are sure that they will love this delightful surprise! You can also try: Set Dosa, Ragi Dosa, Neer Dosa and Oats Dosa."
            )
        )
        courseList.add(
            CourseRVModal(

                R.drawable.idli,
                " \n  Hot Idli\n\n\n  PROCEDURE\n\n   Step 1 Soak the rice & dal and grind into a paste & combine\n" +
                        "   To prepare this popular South Indian recipe, wash rice and urad dal separately until the water runs clean and add fenugreek seeds to the rice. Soak it in water for 4-6 hours. Soak the urad dal too for the same amount of time. Drain all the water from the urad dal and grind it to a fine paste. Add water accordingly. Grind the rice to a coarse paste (add water as needed) and then mix both the pastes together in a large bowl and whisk them well. Make sure that the consistency is thick.\n" +
                        "\n" +
                        "   Step 2 Let the batter ferment, then add salt\n" +
                        "   Now, the idli batter needs to be well-fermented. This step is very important to get soft and fluffy idlis. Keep the batter in a warm place to ferment. Once the batter has risen, add salt to it and whisk to mix it well.\n" +
                        "\n" +
                        "   Step 3 Transfer the idli batter in the idli stand\n" +
                        "   Grease the idli stand with oil and take a ladleful of batter and fill the idli mould. Add ½ cup of water in the idli steamer and let it boil. Put the idli stand inside and close the lid. Let the steam build for 8-10 minutes before switching off the gas.\n" +
                        "\n" +
                        "   Step 4 Wait for the utensil to cool a bit before scooping the idlis out\n" +
                        "   If you are using a cooker, use it without a vent and steam it for 10 minutes and then switch the gas off. In both cases, wait till the steam is released before you take the idli stand out. Wait for another 5 minutes and then use a sharp knife to scoop the idlis out. Serve warm with coconut chutney and sambhar.\n" +
                        "\n" +
                        "  Tips\n" +
                        "   If you have a stone mortar and pestle, grind your idli paste in it for a nice flavour.\n" +
                        "   Use urad dal harvested in the same year in the recipe for best taste. New urad would be white without any tints of yellow.\n" +
                        "   Do not used an iodised salt in this recipe as it would not let the batter ferment properly."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.wada,
                "\n   Vada\n\n\n  PROCEDURE\n\n   Always use whole Urad dal for vadai\n" +
                        "   If you can’t grind the dal after soaked for 5 hours(soft press stage), refrigerate till you grind else Vadai will drink oil\n" +
                        "   Always keep cold water handy. Instead of pouring water, sprinkle water little by little mix and grind into a smooth batter\n" +
                        "   The amount of water depends on the Urad dal you might need around 3 tablespoon of water\n" +
                        "   Avoid excess grinding as batter might turn hot and batter texture will also turn into a paste\n" +
                        "   If you are grinding the batter in a wet grinder it approximately takes around 15 minutes. For mixie grinding, give intervals in between the grinding\n" +
                        "   Grinder batter quantity is more compared to the mixie batter\n" +
                        "   If you are planning to grind the batter in mixie you can add 1 teaspoon of toor dal /rice along with Urad dal for easy grinding\n" +
                        "   Refrigerating vadai better is optional but it helps for easy shaping. Always cover and refrigerate\n" +
                        "   If the batter becomes slightly thin you can add a little rice flour/ Rava/ poha/ maida while frying but you need to consume the Vadai soon as it will become hard over time\n" +
                        "   always deep Fry urad dal vadai in medium flame. avoid low /high flame\n" +
                        "   Before making every batch always grease your hands with water to easily shape Vadai. Avoid dripping water as oil might spill\n" +
                        "   Carefully drop the vadai in oil. Make sure you don't add excess water to shaping as high chance of oil to spill when you add to batter with water\n" +
                        "   Always add salt and onion only before frying as they might ooze put watery\n" +
                        "   For proper cooking, always check the heat of the oil by dropping a bit of batter. If it rises immediately without browning, oil is at the correct temperature\n" +
                        "   Always add enough oil else the batter might stick to the pan\n" +
                        "   Deep fry in medium-low flame for crispy Vadai. If you are preparing onion Medu Vadai, remove it when the Vadai turns golden brown. For Milagu ulundhu Vadai remove when the sound ceases and Vadai turns golden brown\n" +
                        "   For shaping the Vadai if you are a beginner you can use parchment paper or a plastic sheet\n" +
                        "   If vadai is not turning crisp add a pinch of baking soda to the batter\n"
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.noodles,

                " \n  Noodles\n\n\n Recipe Tip You can also add ginger-garlic paste for an extra kick of flavour. \n    Share your version of this recipe How do you make Egg Noodles at home? Do you use any different ingredients? Share your version with us! You can check out our range of Egg recipes here. \n    Frequently Asked Questions Can I use the usual noodles for this recipe? Yes.\n  If the egg noodles are not available, then you can use any noodles of your choice.  \n  Can I add Vinegar and Chilli Sauce to this recipe? The recipe includes paprika to make it spicy.\n  Yet, if you want to increase the spice factor then you can add chilli sauce as required.\n  You can also add Vinegar to this recipe."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.chicken,
                "\n  Chicken\n\n\n  1.Heat oil in a pan and sauté the onion paste, garlic and ginger paste till golden brown.\n  2.Add tomato puree. When the tomato puree dries up, add coriander powder, cumin powder, garam masala, red chilli powder, turmeric powder and salt. Let the spices cook.\n  3.Add chicken pieces into the masala. Stir well and cook till they are golden brown.\n  4.Add 1/2 cup of water and stir. Cover with a lid and let it simmer till the chicken is cooked.\n   5.Garnish with chopped coriander and serve."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.bajji,

                " \n  Hot Bajji\n\n\n INGREDIENTS REQUIRED\n\n    4 green chilli (large)\n" +
                        "   ▢ 2 cup gram flour / besan\n" +
                        "   ▢ 2 tbsp rice flour\n" +
                        "   ▢ ¼ tsp ajwain / carom seeds\n" +
                        "   ▢ ¼ tsp baking soda\n" +
                        "   ▢ ½ tsp salt\n" +
                        "   ▢ ¾ cup water\n" +
                        "   ▢ 1 tbsp oil\n" +
                        "   ▢ oil for frying\n\n" +
                        " PREPARATION PROCESS\n\n" +
                        "   1. firstly, take long green chilis and slit at the centre and remove seeds\n" +
                        "   2. now prepare the bajji batter by taking 2 cup besan and 2 tbsp rice flour in large mixing bowl.\n" +
                        "   3. also add ¼ tsp ajwain, ¼ tsp baking soda and ½ tsp salt.\n" +
                        "   4. mix well making sure everything is combined well.\n" +
                        "   5. now add ½ cup of water and mix well.\n" +
                        "   6. add water as requried and prepare a lump free thick batter.\n" +
                        "   7. further pour 1 tbsp of hot oil over the batter and mix well.\n" +
                        "   8. mix well to smooth and silky batter.\n" +
                        "   9. now dip the green chilli and coat it with besan batter completely.\n" +
                        "   10. wipe off slightly, exposing green chilli slightly.\n" +
                        "   11. deep fry in hot oil dropping batter coated chillis slowly.\n" +
                        "   12. keeping the flame on medium, flip over and fry all the sides.\n" +
                        "   13. fry until the bajjis turn crisp and golden brown.\n" +
                        "   14. finally enjoy mirchi bajji with sauce or chutney."

            )
        )
        courseList.add(
            CourseRVModal( R.drawable.paratta,


                " \n  Paratta\n\n\n  INGREDIENTS \n\n  All purpose flour/Maida  2cups\n" +
                        "  Luke warm water as required\n  Veg oil :1tbsp\n  Salt to taste\n" +
                        "\n  PROCEDURE \n\n   1. Mix all the ingredients in a bowl and knead well to make a dough by adding water little by little, like chappathi dough consistency.\n" +
                        "   2. Knead the dough for 10-minutes to get a nice layered parotta. Cover it with a wet towel, keep it aside for 1 hour.\n" +
                        "   3. Divide the dough into balls in size of your closed palm. Keep the balls under the wet cloth so that it won’t get dry.\n" +
                        "   4. Take a portion and apply some oil on it and roll the ball as thin as possible;apply a little more oil over the rolled dough.(Note: While spreading the dough use enough oil on the surface, so that it wont stick together when you folds).\n" +
                        "   5. Hold the two ends of the dough straight and make pleates layers on the rolled dough starting from one end.\n" +
                        "   6. Holding at one end of the layered dough ,rotate it round and keep aside,again cover with wet towel.\n" +
                        "   7. Place the folded dough on the table, use your hand to spread it.Parotta should be a medium thick round.\n" +
                        "   8. Heat a nonstick pan on medium heat,pour a spoon oil and fry the parotta turning frequently,until speckled brown and firm.\n" +
                        "   9. Keep the cooked porotta in a air tight container.\n" +
                        "   10. When 4-5 parottas are done,place them in a flat surface and tap from the both sides.This is to help the layers to separate.(Note: Do not beat them soo hard,this tapping has to be done when the parotta is hot if not it will break).\n" +
                        "   11. Yummy Kerala Parotta is ready serve with Chiili Chicken,Chicken Curry or Vegetable Kurma and Enjoy"
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.dosa,

                " \n  Dosa\n\n\n    This Masala Dosa Recipe will help you make tasty, aromatic and just the perfect masala dosa at home.    \n One of the most popular South Indian dishes, this Masala Dosa recipe is perfect for beginners. \n    The batter for masala dosas is made with soaked lentils and rice. \n    Then, potatoes and spices are mashed together to prepare a spicy filling for the masala dosa. \n    If you want to learn how to make the batter for crispy masala dosa or how to make spicy masala dosa filling, you are in the right place.\n  Masala Dosa recipe is simply the Indian version of pancakes.\n  This crispy and spicy Dosa recipe is often served with coconut chutney and Sambhar.\n   Make sure that the batter is fermented well and your Masala Dosa will surely taste divine! Pair it with different chutneys and some Payasam for a complete meal. \n   This dish makes for a nice appetiser, so if you have guests dropping by who are fond of South Indian food, then this is a perfect go-to recipe. \n    To make it even tastier, you can add ingredients as per your taste and preference. \n   You can make it more appealing by adding some finely chopped coriander leaves, green chilies and sprinkle some crushed pepper. \n   This simple yet quick recipe can be even packed for picnics as it is not messy and is easy to carry. \n   Moreover, if you are fond of South Indian food, then this one is certainly going to please your taste buds with its amazing flavours. \n   So, the next time when you plan to treat your friends and family with something healthy, try this delicacy and we are sure that they will love this delightful surprise! You can also try: Set Dosa, Ragi Dosa, Neer Dosa and Oats Dosa."
            )
        )
        courseList.add(
            CourseRVModal(

                R.drawable.idli,
                " \n  Hot Idli\n\n\n  PROCEDURE\n\n   Step 1 Soak the rice & dal and grind into a paste & combine\n" +
                        "   To prepare this popular South Indian recipe, wash rice and urad dal separately until the water runs clean and add fenugreek seeds to the rice. Soak it in water for 4-6 hours. Soak the urad dal too for the same amount of time. Drain all the water from the urad dal and grind it to a fine paste. Add water accordingly. Grind the rice to a coarse paste (add water as needed) and then mix both the pastes together in a large bowl and whisk them well. Make sure that the consistency is thick.\n" +
                        "\n" +
                        "   Step 2 Let the batter ferment, then add salt\n" +
                        "   Now, the idli batter needs to be well-fermented. This step is very important to get soft and fluffy idlis. Keep the batter in a warm place to ferment. Once the batter has risen, add salt to it and whisk to mix it well.\n" +
                        "\n" +
                        "   Step 3 Transfer the idli batter in the idli stand\n" +
                        "   Grease the idli stand with oil and take a ladleful of batter and fill the idli mould. Add ½ cup of water in the idli steamer and let it boil. Put the idli stand inside and close the lid. Let the steam build for 8-10 minutes before switching off the gas.\n" +
                        "\n" +
                        "   Step 4 Wait for the utensil to cool a bit before scooping the idlis out\n" +
                        "   If you are using a cooker, use it without a vent and steam it for 10 minutes and then switch the gas off. In both cases, wait till the steam is released before you take the idli stand out. Wait for another 5 minutes and then use a sharp knife to scoop the idlis out. Serve warm with coconut chutney and sambhar.\n" +
                        "\n" +
                        "  Tips\n" +
                        "   If you have a stone mortar and pestle, grind your idli paste in it for a nice flavour.\n" +
                        "   Use urad dal harvested in the same year in the recipe for best taste. New urad would be white without any tints of yellow.\n" +
                        "   Do not used an iodised salt in this recipe as it would not let the batter ferment properly."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.wada,
                "\n   Vada\n\n\n  PROCEDURE\n\n   Always use whole Urad dal for vadai\n" +
                        "   If you can’t grind the dal after soaked for 5 hours(soft press stage), refrigerate till you grind else Vadai will drink oil\n" +
                        "   Always keep cold water handy. Instead of pouring water, sprinkle water little by little mix and grind into a smooth batter\n" +
                        "   The amount of water depends on the Urad dal you might need around 3 tablespoon of water\n" +
                        "   Avoid excess grinding as batter might turn hot and batter texture will also turn into a paste\n" +
                        "   If you are grinding the batter in a wet grinder it approximately takes around 15 minutes. For mixie grinding, give intervals in between the grinding\n" +
                        "   Grinder batter quantity is more compared to the mixie batter\n" +
                        "   If you are planning to grind the batter in mixie you can add 1 teaspoon of toor dal /rice along with Urad dal for easy grinding\n" +
                        "   Refrigerating vadai better is optional but it helps for easy shaping. Always cover and refrigerate\n" +
                        "   If the batter becomes slightly thin you can add a little rice flour/ Rava/ poha/ maida while frying but you need to consume the Vadai soon as it will become hard over time\n" +
                        "   always deep Fry urad dal vadai in medium flame. avoid low /high flame\n" +
                        "   Before making every batch always grease your hands with water to easily shape Vadai. Avoid dripping water as oil might spill\n" +
                        "   Carefully drop the vadai in oil. Make sure you don't add excess water to shaping as high chance of oil to spill when you add to batter with water\n" +
                        "   Always add salt and onion only before frying as they might ooze put watery\n" +
                        "   For proper cooking, always check the heat of the oil by dropping a bit of batter. If it rises immediately without browning, oil is at the correct temperature\n" +
                        "   Always add enough oil else the batter might stick to the pan\n" +
                        "   Deep fry in medium-low flame for crispy Vadai. If you are preparing onion Medu Vadai, remove it when the Vadai turns golden brown. For Milagu ulundhu Vadai remove when the sound ceases and Vadai turns golden brown\n" +
                        "   For shaping the Vadai if you are a beginner you can use parchment paper or a plastic sheet\n" +
                        "   If vadai is not turning crisp add a pinch of baking soda to the batter\n"
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.noodles,

                " \n  Noodles\n\n\n Recipe Tip You can also add ginger-garlic paste for an extra kick of flavour. \n    Share your version of this recipe How do you make Egg Noodles at home? Do you use any different ingredients? Share your version with us! You can check out our range of Egg recipes here. \n    Frequently Asked Questions Can I use the usual noodles for this recipe? Yes.\n  If the egg noodles are not available, then you can use any noodles of your choice.  \n  Can I add Vinegar and Chilli Sauce to this recipe? The recipe includes paprika to make it spicy.\n  Yet, if you want to increase the spice factor then you can add chilli sauce as required.\n  You can also add Vinegar to this recipe."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.chicken,
                "\n  Chicken\n\n\n  1.Heat oil in a pan and sauté the onion paste, garlic and ginger paste till golden brown.\n  2.Add tomato puree. When the tomato puree dries up, add coriander powder, cumin powder, garam masala, red chilli powder, turmeric powder and salt. Let the spices cook.\n  3.Add chicken pieces into the masala. Stir well and cook till they are golden brown.\n  4.Add 1/2 cup of water and stir. Cover with a lid and let it simmer till the chicken is cooked.\n   5.Garnish with chopped coriander and serve."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.bajji,

                " \n  Hot Bajji\n\n\n INGREDIENTS REQUIRED\n\n    4 green chilli (large)\n" +
                        "   ▢ 2 cup gram flour / besan\n" +
                        "   ▢ 2 tbsp rice flour\n" +
                        "   ▢ ¼ tsp ajwain / carom seeds\n" +
                        "   ▢ ¼ tsp baking soda\n" +
                        "   ▢ ½ tsp salt\n" +
                        "   ▢ ¾ cup water\n" +
                        "   ▢ 1 tbsp oil\n" +
                        "   ▢ oil for frying\n\n" +
                        " PREPARATION PROCESS\n\n" +
                        "   1. firstly, take long green chilis and slit at the centre and remove seeds\n" +
                        "   2. now prepare the bajji batter by taking 2 cup besan and 2 tbsp rice flour in large mixing bowl.\n" +
                        "   3. also add ¼ tsp ajwain, ¼ tsp baking soda and ½ tsp salt.\n" +
                        "   4. mix well making sure everything is combined well.\n" +
                        "   5. now add ½ cup of water and mix well.\n" +
                        "   6. add water as requried and prepare a lump free thick batter.\n" +
                        "   7. further pour 1 tbsp of hot oil over the batter and mix well.\n" +
                        "   8. mix well to smooth and silky batter.\n" +
                        "   9. now dip the green chilli and coat it with besan batter completely.\n" +
                        "   10. wipe off slightly, exposing green chilli slightly.\n" +
                        "   11. deep fry in hot oil dropping batter coated chillis slowly.\n" +
                        "   12. keeping the flame on medium, flip over and fry all the sides.\n" +
                        "   13. fry until the bajjis turn crisp and golden brown.\n" +
                        "   14. finally enjoy mirchi bajji with sauce or chutney."

            )
        )
        courseList.add(
            CourseRVModal( R.drawable.paratta,


                " \n  Paratta\n\n\n  INGREDIENTS \n\n  All purpose flour/Maida  2cups\n" +
                        "  Luke warm water as required\n  Veg oil :1tbsp\n  Salt to taste\n" +
                        "\n  PROCEDURE \n\n   1. Mix all the ingredients in a bowl and knead well to make a dough by adding water little by little, like chappathi dough consistency.\n" +
                        "   2. Knead the dough for 10-minutes to get a nice layered parotta. Cover it with a wet towel, keep it aside for 1 hour.\n" +
                        "   3. Divide the dough into balls in size of your closed palm. Keep the balls under the wet cloth so that it won’t get dry.\n" +
                        "   4. Take a portion and apply some oil on it and roll the ball as thin as possible;apply a little more oil over the rolled dough.(Note: While spreading the dough use enough oil on the surface, so that it wont stick together when you folds).\n" +
                        "   5. Hold the two ends of the dough straight and make pleates layers on the rolled dough starting from one end.\n" +
                        "   6. Holding at one end of the layered dough ,rotate it round and keep aside,again cover with wet towel.\n" +
                        "   7. Place the folded dough on the table, use your hand to spread it.Parotta should be a medium thick round.\n" +
                        "   8. Heat a nonstick pan on medium heat,pour a spoon oil and fry the parotta turning frequently,until speckled brown and firm.\n" +
                        "   9. Keep the cooked porotta in a air tight container.\n" +
                        "   10. When 4-5 parottas are done,place them in a flat surface and tap from the both sides.This is to help the layers to separate.(Note: Do not beat them soo hard,this tapping has to be done when the parotta is hot if not it will break).\n" +
                        "   11. Yummy Kerala Parotta is ready serve with Chiili Chicken,Chicken Curry or Vegetable Kurma and Enjoy"
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.dosa,

                " \n  Dosa\n\n\n    This Masala Dosa Recipe will help you make tasty, aromatic and just the perfect masala dosa at home.    \n One of the most popular South Indian dishes, this Masala Dosa recipe is perfect for beginners. \n    The batter for masala dosas is made with soaked lentils and rice. \n    Then, potatoes and spices are mashed together to prepare a spicy filling for the masala dosa. \n    If you want to learn how to make the batter for crispy masala dosa or how to make spicy masala dosa filling, you are in the right place.\n  Masala Dosa recipe is simply the Indian version of pancakes.\n  This crispy and spicy Dosa recipe is often served with coconut chutney and Sambhar.\n   Make sure that the batter is fermented well and your Masala Dosa will surely taste divine! Pair it with different chutneys and some Payasam for a complete meal. \n   This dish makes for a nice appetiser, so if you have guests dropping by who are fond of South Indian food, then this is a perfect go-to recipe. \n    To make it even tastier, you can add ingredients as per your taste and preference. \n   You can make it more appealing by adding some finely chopped coriander leaves, green chilies and sprinkle some crushed pepper. \n   This simple yet quick recipe can be even packed for picnics as it is not messy and is easy to carry. \n   Moreover, if you are fond of South Indian food, then this one is certainly going to please your taste buds with its amazing flavours. \n   So, the next time when you plan to treat your friends and family with something healthy, try this delicacy and we are sure that they will love this delightful surprise! You can also try: Set Dosa, Ragi Dosa, Neer Dosa and Oats Dosa."
            )
        )
        courseList.add(
            CourseRVModal(

                R.drawable.idli,
                " \n  Hot Idli\n\n\n  PROCEDURE\n\n   Step 1 Soak the rice & dal and grind into a paste & combine\n" +
                        "   To prepare this popular South Indian recipe, wash rice and urad dal separately until the water runs clean and add fenugreek seeds to the rice. Soak it in water for 4-6 hours. Soak the urad dal too for the same amount of time. Drain all the water from the urad dal and grind it to a fine paste. Add water accordingly. Grind the rice to a coarse paste (add water as needed) and then mix both the pastes together in a large bowl and whisk them well. Make sure that the consistency is thick.\n" +
                        "\n" +
                        "   Step 2 Let the batter ferment, then add salt\n" +
                        "   Now, the idli batter needs to be well-fermented. This step is very important to get soft and fluffy idlis. Keep the batter in a warm place to ferment. Once the batter has risen, add salt to it and whisk to mix it well.\n" +
                        "\n" +
                        "   Step 3 Transfer the idli batter in the idli stand\n" +
                        "   Grease the idli stand with oil and take a ladleful of batter and fill the idli mould. Add ½ cup of water in the idli steamer and let it boil. Put the idli stand inside and close the lid. Let the steam build for 8-10 minutes before switching off the gas.\n" +
                        "\n" +
                        "   Step 4 Wait for the utensil to cool a bit before scooping the idlis out\n" +
                        "   If you are using a cooker, use it without a vent and steam it for 10 minutes and then switch the gas off. In both cases, wait till the steam is released before you take the idli stand out. Wait for another 5 minutes and then use a sharp knife to scoop the idlis out. Serve warm with coconut chutney and sambhar.\n" +
                        "\n" +
                        "  Tips\n" +
                        "   If you have a stone mortar and pestle, grind your idli paste in it for a nice flavour.\n" +
                        "   Use urad dal harvested in the same year in the recipe for best taste. New urad would be white without any tints of yellow.\n" +
                        "   Do not used an iodised salt in this recipe as it would not let the batter ferment properly."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.wada,
                "\n   Vada\n\n\n  PROCEDURE\n\n   Always use whole Urad dal for vadai\n" +
                        "   If you can’t grind the dal after soaked for 5 hours(soft press stage), refrigerate till you grind else Vadai will drink oil\n" +
                        "   Always keep cold water handy. Instead of pouring water, sprinkle water little by little mix and grind into a smooth batter\n" +
                        "   The amount of water depends on the Urad dal you might need around 3 tablespoon of water\n" +
                        "   Avoid excess grinding as batter might turn hot and batter texture will also turn into a paste\n" +
                        "   If you are grinding the batter in a wet grinder it approximately takes around 15 minutes. For mixie grinding, give intervals in between the grinding\n" +
                        "   Grinder batter quantity is more compared to the mixie batter\n" +
                        "   If you are planning to grind the batter in mixie you can add 1 teaspoon of toor dal /rice along with Urad dal for easy grinding\n" +
                        "   Refrigerating vadai better is optional but it helps for easy shaping. Always cover and refrigerate\n" +
                        "   If the batter becomes slightly thin you can add a little rice flour/ Rava/ poha/ maida while frying but you need to consume the Vadai soon as it will become hard over time\n" +
                        "   always deep Fry urad dal vadai in medium flame. avoid low /high flame\n" +
                        "   Before making every batch always grease your hands with water to easily shape Vadai. Avoid dripping water as oil might spill\n" +
                        "   Carefully drop the vadai in oil. Make sure you don't add excess water to shaping as high chance of oil to spill when you add to batter with water\n" +
                        "   Always add salt and onion only before frying as they might ooze put watery\n" +
                        "   For proper cooking, always check the heat of the oil by dropping a bit of batter. If it rises immediately without browning, oil is at the correct temperature\n" +
                        "   Always add enough oil else the batter might stick to the pan\n" +
                        "   Deep fry in medium-low flame for crispy Vadai. If you are preparing onion Medu Vadai, remove it when the Vadai turns golden brown. For Milagu ulundhu Vadai remove when the sound ceases and Vadai turns golden brown\n" +
                        "   For shaping the Vadai if you are a beginner you can use parchment paper or a plastic sheet\n" +
                        "   If vadai is not turning crisp add a pinch of baking soda to the batter\n"
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.noodles,

                " \n  Noodles\n\n\n Recipe Tip You can also add ginger-garlic paste for an extra kick of flavour. \n    Share your version of this recipe How do you make Egg Noodles at home? Do you use any different ingredients? Share your version with us! You can check out our range of Egg recipes here. \n    Frequently Asked Questions Can I use the usual noodles for this recipe? Yes.\n  If the egg noodles are not available, then you can use any noodles of your choice.  \n  Can I add Vinegar and Chilli Sauce to this recipe? The recipe includes paprika to make it spicy.\n  Yet, if you want to increase the spice factor then you can add chilli sauce as required.\n  You can also add Vinegar to this recipe."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.chicken,
                "\n  Chicken\n\n\n  1.Heat oil in a pan and sauté the onion paste, garlic and ginger paste till golden brown.\n  2.Add tomato puree. When the tomato puree dries up, add coriander powder, cumin powder, garam masala, red chilli powder, turmeric powder and salt. Let the spices cook.\n  3.Add chicken pieces into the masala. Stir well and cook till they are golden brown.\n  4.Add 1/2 cup of water and stir. Cover with a lid and let it simmer till the chicken is cooked.\n   5.Garnish with chopped coriander and serve."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.bajji,

                " \n  Hot Bajji\n\n\n INGREDIENTS REQUIRED\n\n    4 green chilli (large)\n" +
                        "   ▢ 2 cup gram flour / besan\n" +
                        "   ▢ 2 tbsp rice flour\n" +
                        "   ▢ ¼ tsp ajwain / carom seeds\n" +
                        "   ▢ ¼ tsp baking soda\n" +
                        "   ▢ ½ tsp salt\n" +
                        "   ▢ ¾ cup water\n" +
                        "   ▢ 1 tbsp oil\n" +
                        "   ▢ oil for frying\n\n" +
                        " PREPARATION PROCESS\n\n" +
                        "   1. firstly, take long green chilis and slit at the centre and remove seeds\n" +
                        "   2. now prepare the bajji batter by taking 2 cup besan and 2 tbsp rice flour in large mixing bowl.\n" +
                        "   3. also add ¼ tsp ajwain, ¼ tsp baking soda and ½ tsp salt.\n" +
                        "   4. mix well making sure everything is combined well.\n" +
                        "   5. now add ½ cup of water and mix well.\n" +
                        "   6. add water as requried and prepare a lump free thick batter.\n" +
                        "   7. further pour 1 tbsp of hot oil over the batter and mix well.\n" +
                        "   8. mix well to smooth and silky batter.\n" +
                        "   9. now dip the green chilli and coat it with besan batter completely.\n" +
                        "   10. wipe off slightly, exposing green chilli slightly.\n" +
                        "   11. deep fry in hot oil dropping batter coated chillis slowly.\n" +
                        "   12. keeping the flame on medium, flip over and fry all the sides.\n" +
                        "   13. fry until the bajjis turn crisp and golden brown.\n" +
                        "   14. finally enjoy mirchi bajji with sauce or chutney."

            )
        )
        courseList.add(
            CourseRVModal( R.drawable.paratta,


                " \n  Paratta\n\n\n  INGREDIENTS \n\n  All purpose flour/Maida  2cups\n" +
                        "  Luke warm water as required\n  Veg oil :1tbsp\n  Salt to taste\n" +
                        "\n  PROCEDURE \n\n   1. Mix all the ingredients in a bowl and knead well to make a dough by adding water little by little, like chappathi dough consistency.\n" +
                        "   2. Knead the dough for 10-minutes to get a nice layered parotta. Cover it with a wet towel, keep it aside for 1 hour.\n" +
                        "   3. Divide the dough into balls in size of your closed palm. Keep the balls under the wet cloth so that it won’t get dry.\n" +
                        "   4. Take a portion and apply some oil on it and roll the ball as thin as possible;apply a little more oil over the rolled dough.(Note: While spreading the dough use enough oil on the surface, so that it wont stick together when you folds).\n" +
                        "   5. Hold the two ends of the dough straight and make pleates layers on the rolled dough starting from one end.\n" +
                        "   6. Holding at one end of the layered dough ,rotate it round and keep aside,again cover with wet towel.\n" +
                        "   7. Place the folded dough on the table, use your hand to spread it.Parotta should be a medium thick round.\n" +
                        "   8. Heat a nonstick pan on medium heat,pour a spoon oil and fry the parotta turning frequently,until speckled brown and firm.\n" +
                        "   9. Keep the cooked porotta in a air tight container.\n" +
                        "   10. When 4-5 parottas are done,place them in a flat surface and tap from the both sides.This is to help the layers to separate.(Note: Do not beat them soo hard,this tapping has to be done when the parotta is hot if not it will break).\n" +
                        "   11. Yummy Kerala Parotta is ready serve with Chiili Chicken,Chicken Curry or Vegetable Kurma and Enjoy"
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.dosa,

                " \n  Dosa\n\n\n    This Masala Dosa Recipe will help you make tasty, aromatic and just the perfect masala dosa at home.    \n One of the most popular South Indian dishes, this Masala Dosa recipe is perfect for beginners. \n    The batter for masala dosas is made with soaked lentils and rice. \n    Then, potatoes and spices are mashed together to prepare a spicy filling for the masala dosa. \n    If you want to learn how to make the batter for crispy masala dosa or how to make spicy masala dosa filling, you are in the right place.\n  Masala Dosa recipe is simply the Indian version of pancakes.\n  This crispy and spicy Dosa recipe is often served with coconut chutney and Sambhar.\n   Make sure that the batter is fermented well and your Masala Dosa will surely taste divine! Pair it with different chutneys and some Payasam for a complete meal. \n   This dish makes for a nice appetiser, so if you have guests dropping by who are fond of South Indian food, then this is a perfect go-to recipe. \n    To make it even tastier, you can add ingredients as per your taste and preference. \n   You can make it more appealing by adding some finely chopped coriander leaves, green chilies and sprinkle some crushed pepper. \n   This simple yet quick recipe can be even packed for picnics as it is not messy and is easy to carry. \n   Moreover, if you are fond of South Indian food, then this one is certainly going to please your taste buds with its amazing flavours. \n   So, the next time when you plan to treat your friends and family with something healthy, try this delicacy and we are sure that they will love this delightful surprise! You can also try: Set Dosa, Ragi Dosa, Neer Dosa and Oats Dosa."
            )
        )
        courseList.add(
            CourseRVModal(

                R.drawable.idli,
                " \n  Hot Idli\n\n\n  PROCEDURE\n\n   Step 1 Soak the rice & dal and grind into a paste & combine\n" +
                        "   To prepare this popular South Indian recipe, wash rice and urad dal separately until the water runs clean and add fenugreek seeds to the rice. Soak it in water for 4-6 hours. Soak the urad dal too for the same amount of time. Drain all the water from the urad dal and grind it to a fine paste. Add water accordingly. Grind the rice to a coarse paste (add water as needed) and then mix both the pastes together in a large bowl and whisk them well. Make sure that the consistency is thick.\n" +
                        "\n" +
                        "   Step 2 Let the batter ferment, then add salt\n" +
                        "   Now, the idli batter needs to be well-fermented. This step is very important to get soft and fluffy idlis. Keep the batter in a warm place to ferment. Once the batter has risen, add salt to it and whisk to mix it well.\n" +
                        "\n" +
                        "   Step 3 Transfer the idli batter in the idli stand\n" +
                        "   Grease the idli stand with oil and take a ladleful of batter and fill the idli mould. Add ½ cup of water in the idli steamer and let it boil. Put the idli stand inside and close the lid. Let the steam build for 8-10 minutes before switching off the gas.\n" +
                        "\n" +
                        "   Step 4 Wait for the utensil to cool a bit before scooping the idlis out\n" +
                        "   If you are using a cooker, use it without a vent and steam it for 10 minutes and then switch the gas off. In both cases, wait till the steam is released before you take the idli stand out. Wait for another 5 minutes and then use a sharp knife to scoop the idlis out. Serve warm with coconut chutney and sambhar.\n" +
                        "\n" +
                        "  Tips\n" +
                        "   If you have a stone mortar and pestle, grind your idli paste in it for a nice flavour.\n" +
                        "   Use urad dal harvested in the same year in the recipe for best taste. New urad would be white without any tints of yellow.\n" +
                        "   Do not used an iodised salt in this recipe as it would not let the batter ferment properly."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.wada,
                "\n   Vada\n\n\n  PROCEDURE\n\n   Always use whole Urad dal for vadai\n" +
                        "   If you can’t grind the dal after soaked for 5 hours(soft press stage), refrigerate till you grind else Vadai will drink oil\n" +
                        "   Always keep cold water handy. Instead of pouring water, sprinkle water little by little mix and grind into a smooth batter\n" +
                        "   The amount of water depends on the Urad dal you might need around 3 tablespoon of water\n" +
                        "   Avoid excess grinding as batter might turn hot and batter texture will also turn into a paste\n" +
                        "   If you are grinding the batter in a wet grinder it approximately takes around 15 minutes. For mixie grinding, give intervals in between the grinding\n" +
                        "   Grinder batter quantity is more compared to the mixie batter\n" +
                        "   If you are planning to grind the batter in mixie you can add 1 teaspoon of toor dal /rice along with Urad dal for easy grinding\n" +
                        "   Refrigerating vadai better is optional but it helps for easy shaping. Always cover and refrigerate\n" +
                        "   If the batter becomes slightly thin you can add a little rice flour/ Rava/ poha/ maida while frying but you need to consume the Vadai soon as it will become hard over time\n" +
                        "   always deep Fry urad dal vadai in medium flame. avoid low /high flame\n" +
                        "   Before making every batch always grease your hands with water to easily shape Vadai. Avoid dripping water as oil might spill\n" +
                        "   Carefully drop the vadai in oil. Make sure you don't add excess water to shaping as high chance of oil to spill when you add to batter with water\n" +
                        "   Always add salt and onion only before frying as they might ooze put watery\n" +
                        "   For proper cooking, always check the heat of the oil by dropping a bit of batter. If it rises immediately without browning, oil is at the correct temperature\n" +
                        "   Always add enough oil else the batter might stick to the pan\n" +
                        "   Deep fry in medium-low flame for crispy Vadai. If you are preparing onion Medu Vadai, remove it when the Vadai turns golden brown. For Milagu ulundhu Vadai remove when the sound ceases and Vadai turns golden brown\n" +
                        "   For shaping the Vadai if you are a beginner you can use parchment paper or a plastic sheet\n" +
                        "   If vadai is not turning crisp add a pinch of baking soda to the batter\n"
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.noodles,

                " \n  Noodles\n\n\n Recipe Tip You can also add ginger-garlic paste for an extra kick of flavour. \n    Share your version of this recipe How do you make Egg Noodles at home? Do you use any different ingredients? Share your version with us! You can check out our range of Egg recipes here. \n    Frequently Asked Questions Can I use the usual noodles for this recipe? Yes.\n  If the egg noodles are not available, then you can use any noodles of your choice.  \n  Can I add Vinegar and Chilli Sauce to this recipe? The recipe includes paprika to make it spicy.\n  Yet, if you want to increase the spice factor then you can add chilli sauce as required.\n  You can also add Vinegar to this recipe."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.chicken,
                "\n  Chicken\n\n\n  1.Heat oil in a pan and sauté the onion paste, garlic and ginger paste till golden brown.\n  2.Add tomato puree. When the tomato puree dries up, add coriander powder, cumin powder, garam masala, red chilli powder, turmeric powder and salt. Let the spices cook.\n  3.Add chicken pieces into the masala. Stir well and cook till they are golden brown.\n  4.Add 1/2 cup of water and stir. Cover with a lid and let it simmer till the chicken is cooked.\n   5.Garnish with chopped coriander and serve."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.bajji,

                " \n  Hot Bajji\n\n\n INGREDIENTS REQUIRED\n\n    4 green chilli (large)\n" +
                        "   ▢ 2 cup gram flour / besan\n" +
                        "   ▢ 2 tbsp rice flour\n" +
                        "   ▢ ¼ tsp ajwain / carom seeds\n" +
                        "   ▢ ¼ tsp baking soda\n" +
                        "   ▢ ½ tsp salt\n" +
                        "   ▢ ¾ cup water\n" +
                        "   ▢ 1 tbsp oil\n" +
                        "   ▢ oil for frying\n\n" +
                        " PREPARATION PROCESS\n\n" +
                        "   1. firstly, take long green chilis and slit at the centre and remove seeds\n" +
                        "   2. now prepare the bajji batter by taking 2 cup besan and 2 tbsp rice flour in large mixing bowl.\n" +
                        "   3. also add ¼ tsp ajwain, ¼ tsp baking soda and ½ tsp salt.\n" +
                        "   4. mix well making sure everything is combined well.\n" +
                        "   5. now add ½ cup of water and mix well.\n" +
                        "   6. add water as requried and prepare a lump free thick batter.\n" +
                        "   7. further pour 1 tbsp of hot oil over the batter and mix well.\n" +
                        "   8. mix well to smooth and silky batter.\n" +
                        "   9. now dip the green chilli and coat it with besan batter completely.\n" +
                        "   10. wipe off slightly, exposing green chilli slightly.\n" +
                        "   11. deep fry in hot oil dropping batter coated chillis slowly.\n" +
                        "   12. keeping the flame on medium, flip over and fry all the sides.\n" +
                        "   13. fry until the bajjis turn crisp and golden brown.\n" +
                        "   14. finally enjoy mirchi bajji with sauce or chutney."

            )
        )
        courseList.add(
            CourseRVModal( R.drawable.paratta,


                " \n  Paratta\n\n\n  INGREDIENTS \n\n  All purpose flour/Maida  2cups\n" +
                        "  Luke warm water as required\n  Veg oil :1tbsp\n  Salt to taste\n" +
                        "\n  PROCEDURE \n\n   1. Mix all the ingredients in a bowl and knead well to make a dough by adding water little by little, like chappathi dough consistency.\n" +
                        "   2. Knead the dough for 10-minutes to get a nice layered parotta. Cover it with a wet towel, keep it aside for 1 hour.\n" +
                        "   3. Divide the dough into balls in size of your closed palm. Keep the balls under the wet cloth so that it won’t get dry.\n" +
                        "   4. Take a portion and apply some oil on it and roll the ball as thin as possible;apply a little more oil over the rolled dough.(Note: While spreading the dough use enough oil on the surface, so that it wont stick together when you folds).\n" +
                        "   5. Hold the two ends of the dough straight and make pleates layers on the rolled dough starting from one end.\n" +
                        "   6. Holding at one end of the layered dough ,rotate it round and keep aside,again cover with wet towel.\n" +
                        "   7. Place the folded dough on the table, use your hand to spread it.Parotta should be a medium thick round.\n" +
                        "   8. Heat a nonstick pan on medium heat,pour a spoon oil and fry the parotta turning frequently,until speckled brown and firm.\n" +
                        "   9. Keep the cooked porotta in a air tight container.\n" +
                        "   10. When 4-5 parottas are done,place them in a flat surface and tap from the both sides.This is to help the layers to separate.(Note: Do not beat them soo hard,this tapping has to be done when the parotta is hot if not it will break).\n" +
                        "   11. Yummy Kerala Parotta is ready serve with Chiili Chicken,Chicken Curry or Vegetable Kurma and Enjoy"
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.dosa,

                " \n  Dosa\n\n\n    This Masala Dosa Recipe will help you make tasty, aromatic and just the perfect masala dosa at home.    \n One of the most popular South Indian dishes, this Masala Dosa recipe is perfect for beginners. \n    The batter for masala dosas is made with soaked lentils and rice. \n    Then, potatoes and spices are mashed together to prepare a spicy filling for the masala dosa. \n    If you want to learn how to make the batter for crispy masala dosa or how to make spicy masala dosa filling, you are in the right place.\n  Masala Dosa recipe is simply the Indian version of pancakes.\n  This crispy and spicy Dosa recipe is often served with coconut chutney and Sambhar.\n   Make sure that the batter is fermented well and your Masala Dosa will surely taste divine! Pair it with different chutneys and some Payasam for a complete meal. \n   This dish makes for a nice appetiser, so if you have guests dropping by who are fond of South Indian food, then this is a perfect go-to recipe. \n    To make it even tastier, you can add ingredients as per your taste and preference. \n   You can make it more appealing by adding some finely chopped coriander leaves, green chilies and sprinkle some crushed pepper. \n   This simple yet quick recipe can be even packed for picnics as it is not messy and is easy to carry. \n   Moreover, if you are fond of South Indian food, then this one is certainly going to please your taste buds with its amazing flavours. \n   So, the next time when you plan to treat your friends and family with something healthy, try this delicacy and we are sure that they will love this delightful surprise! You can also try: Set Dosa, Ragi Dosa, Neer Dosa and Oats Dosa."
            )
        )
        courseList.add(
            CourseRVModal(

                R.drawable.idli,
                " \n  Hot Idli\n\n\n  PROCEDURE\n\n   Step 1 Soak the rice & dal and grind into a paste & combine\n" +
                        "   To prepare this popular South Indian recipe, wash rice and urad dal separately until the water runs clean and add fenugreek seeds to the rice. Soak it in water for 4-6 hours. Soak the urad dal too for the same amount of time. Drain all the water from the urad dal and grind it to a fine paste. Add water accordingly. Grind the rice to a coarse paste (add water as needed) and then mix both the pastes together in a large bowl and whisk them well. Make sure that the consistency is thick.\n" +
                        "\n" +
                        "   Step 2 Let the batter ferment, then add salt\n" +
                        "   Now, the idli batter needs to be well-fermented. This step is very important to get soft and fluffy idlis. Keep the batter in a warm place to ferment. Once the batter has risen, add salt to it and whisk to mix it well.\n" +
                        "\n" +
                        "   Step 3 Transfer the idli batter in the idli stand\n" +
                        "   Grease the idli stand with oil and take a ladleful of batter and fill the idli mould. Add ½ cup of water in the idli steamer and let it boil. Put the idli stand inside and close the lid. Let the steam build for 8-10 minutes before switching off the gas.\n" +
                        "\n" +
                        "   Step 4 Wait for the utensil to cool a bit before scooping the idlis out\n" +
                        "   If you are using a cooker, use it without a vent and steam it for 10 minutes and then switch the gas off. In both cases, wait till the steam is released before you take the idli stand out. Wait for another 5 minutes and then use a sharp knife to scoop the idlis out. Serve warm with coconut chutney and sambhar.\n" +
                        "\n" +
                        "  Tips\n" +
                        "   If you have a stone mortar and pestle, grind your idli paste in it for a nice flavour.\n" +
                        "   Use urad dal harvested in the same year in the recipe for best taste. New urad would be white without any tints of yellow.\n" +
                        "   Do not used an iodised salt in this recipe as it would not let the batter ferment properly."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.wada,
                "\n   Vada\n\n\n  PROCEDURE\n\n   Always use whole Urad dal for vadai\n" +
                        "   If you can’t grind the dal after soaked for 5 hours(soft press stage), refrigerate till you grind else Vadai will drink oil\n" +
                        "   Always keep cold water handy. Instead of pouring water, sprinkle water little by little mix and grind into a smooth batter\n" +
                        "   The amount of water depends on the Urad dal you might need around 3 tablespoon of water\n" +
                        "   Avoid excess grinding as batter might turn hot and batter texture will also turn into a paste\n" +
                        "   If you are grinding the batter in a wet grinder it approximately takes around 15 minutes. For mixie grinding, give intervals in between the grinding\n" +
                        "   Grinder batter quantity is more compared to the mixie batter\n" +
                        "   If you are planning to grind the batter in mixie you can add 1 teaspoon of toor dal /rice along with Urad dal for easy grinding\n" +
                        "   Refrigerating vadai better is optional but it helps for easy shaping. Always cover and refrigerate\n" +
                        "   If the batter becomes slightly thin you can add a little rice flour/ Rava/ poha/ maida while frying but you need to consume the Vadai soon as it will become hard over time\n" +
                        "   always deep Fry urad dal vadai in medium flame. avoid low /high flame\n" +
                        "   Before making every batch always grease your hands with water to easily shape Vadai. Avoid dripping water as oil might spill\n" +
                        "   Carefully drop the vadai in oil. Make sure you don't add excess water to shaping as high chance of oil to spill when you add to batter with water\n" +
                        "   Always add salt and onion only before frying as they might ooze put watery\n" +
                        "   For proper cooking, always check the heat of the oil by dropping a bit of batter. If it rises immediately without browning, oil is at the correct temperature\n" +
                        "   Always add enough oil else the batter might stick to the pan\n" +
                        "   Deep fry in medium-low flame for crispy Vadai. If you are preparing onion Medu Vadai, remove it when the Vadai turns golden brown. For Milagu ulundhu Vadai remove when the sound ceases and Vadai turns golden brown\n" +
                        "   For shaping the Vadai if you are a beginner you can use parchment paper or a plastic sheet\n" +
                        "   If vadai is not turning crisp add a pinch of baking soda to the batter\n"
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.noodles,

                " \n  Noodles\n\n\n Recipe Tip You can also add ginger-garlic paste for an extra kick of flavour. \n    Share your version of this recipe How do you make Egg Noodles at home? Do you use any different ingredients? Share your version with us! You can check out our range of Egg recipes here. \n    Frequently Asked Questions Can I use the usual noodles for this recipe? Yes.\n  If the egg noodles are not available, then you can use any noodles of your choice.  \n  Can I add Vinegar and Chilli Sauce to this recipe? The recipe includes paprika to make it spicy.\n  Yet, if you want to increase the spice factor then you can add chilli sauce as required.\n  You can also add Vinegar to this recipe."
            )
        )
        courseList.add(
            CourseRVModal(
                R.drawable.chicken,
                "\n  Chicken\n\n\n  1.Heat oil in a pan and sauté the onion paste, garlic and ginger paste till golden brown.\n  2.Add tomato puree. When the tomato puree dries up, add coriander powder, cumin powder, garam masala, red chilli powder, turmeric powder and salt. Let the spices cook.\n  3.Add chicken pieces into the masala. Stir well and cook till they are golden brown.\n  4.Add 1/2 cup of water and stir. Cover with a lid and let it simmer till the chicken is cooked.\n   5.Garnish with chopped coriander and serve."
            )
        )



        courseRVAdapter = CouseRVAdapter(courseList)
        courseRV.adapter = courseRVAdapter


        courseRVAdapter.onclick= {
            val intent = Intent(this, Details::class.java)
            intent.putExtra("food", it)
            startActivity(intent)
        }

    }

    // calling on create option menu
    // layout to inflate our menu file.
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // below line is to get our inflater
        val inflater = menuInflater

        // inside inflater we are inflating our menu file.
        inflater.inflate(R.menu.search_menu, menu)

        // below line is to get our menu item.
        val searchItem: MenuItem = menu.findItem(R.id.actionSearch)

        // getting search view of our item.
        val searchView: SearchView = searchItem.getActionView() as SearchView

        // below line is to call set on query text listener method.
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(msg: String): Boolean {
                // inside on query text change method we are
                // calling a method to filter our recycler view.
                filter(msg)
                return false
            }
        })
        return true
    }

    private fun filter(text: String) {
        // creating a new array list to filter our data.
        val filteredlist: ArrayList<CourseRVModal> = ArrayList()

        // running a for loop to compare elements.
        for (item in courseList) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.courseName.toLowerCase().contains(text.toLowerCase())) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item)
            }
        }
        if (filteredlist.isEmpty()) {
            // if no item is added in filtered list we are
            // displaying a toast message as no data found.
            Toast.makeText(this, "No Item Found..", Toast.LENGTH_SHORT).show()
        } else {
            // at last we are passing that filtered
            // list to our adapter class.
            courseRVAdapter.filterList(filteredlist)
        }
    }
}
