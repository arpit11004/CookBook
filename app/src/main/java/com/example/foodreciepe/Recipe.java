package com.example.foodreciepe;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Recipe extends AppCompatActivity {

    private static final String[] items = {"Kakori Kababs", "Chilli Chicken", "Paneer Tikka",
            "Cheese Balls", "Chicken Wings", "French Fries","Grilled Veg Pesto Sandwich",
            "Albuquerque Atomic Mushrooms" , "Clotted Cottage Cheese Croquettes" , "Kalmi Kebab",
            "Oyseter Lamb", "Apple Crumb Pie", "Strawberry Chia Pudding",
            "Jaggery Panna Cotta", "Trio of Mousse", "Chocolate Blueberry Torte"};

    private static final String[] ingredients ={"mutton/lamb (minced), ginger- garlic paste, salt, black pepper, green coriander, green chillies, raw papaya, Cloves, Black cardamom seeds, cinnamon, cumin seeds, Black mace, nutmeg, onions (browned crisp in 1/2 cup ghee), bhuna chana, Egg, Ghee for brushing some chaat masala, onion rings and lemon wedges",
            "oil, garlic cloves, red and green chillies, chicken (cut into bite sized uniform pieces), chilli sauce, tomato puree, sugar, basil leaves",
            "paneer cubes (about 3 cm/1.5\" each), garlic paste, ginger paste, chaat masala, chilli powder, black pepper, salt, vinegar , Oil for brushing, Lemon (quartered), Onion (sliced into rings for garnish)",
            "Cheese, Eggs, Salt, Chilli Powder, Baking Powder",
            "chicken wings, onions, tomatoes , capsicum, ginger-garlic paste, turmeric powder, red chili powder, coriander powder, cumin powder, Dry red chili, coriander seeds, sugar, water, lime juice, salt, refined oil, olive oil",
            "1 russet potato, cut into evenly sized strips,1 quart vegetable oil for frying,salt to taste",
            "Yellow bell pepper, Green bell pepper, Red bell pepper, Green zucchini , Red zucchini, Tomato, Pesto sauce, Cheese, White sauce, Salt, Garlic, Onion, Celery, Oil, Bread, Butter, Mayonnaise, Mushroom, Basil leaves, Cashew nuts, Garlic, Parmesan cheese, Salt and oil",
            "button mushrooms, vegetable oil, tomato paste, paprika powder, red chilli powder, salt, Red fresh jalapeno\n",
            "black pepper, black salt, bread crumb, corn flour, refined oil, jalapeno, jeera powder, maida, cottage cheese, parsley, salt, For thousand island dressing:, mayonnaise, tomato ketchup, minced garlic, celery, black pepper",
            "Chicken thigh leg, Yogurt, Ginger-garlic paste, Lemon juice, Turmeric powder, Caraway seeds, Cashew nut powder, Green cardamom powder, Black pepper (crushed), Fresh cream, Refined oil",
            "Vegetable oil, Garlic, Ginger, Lamb, Stock, Oyster sauce, Dry sherry, Sugar, Celery, Salt, Bokchoy, Shitake mushroom",

            "pie shell (par baked and cooled), Golden apples (peeled and cut into ½ inch chunks), all-purpose flour, nutmeg, cinnamon, sugar, brown sugar, cinnamon crumb topping",
            "low fat milk, chia seeds, strawberries , Star anise",
            "whole/full fat milk, jaggery, gelatine, Cardamom pods, cardamom powder (optional), cinnamon powder",
            "Egg yolk, sugar, whipped cream, white chocolate, cooking cream, orange puree, kiwi puree",
            "bittersweet or semisweet chocolate, unsalted butter, Eggs (separated), brandy (optional), granulated sugar, almond flour/ground almonds, salt, blueberry jam, Cocoa powder (for dusting)"};

        private static final String[] recipe ={"1.Mix all ingredients except ghee and garnishes to marinate for about 4 hours, then grind to form a smooth, thick paste.\n" +
                "2.Knead this mixture well and mix in the roasted gram and the egg.\n" +
                "3.Cover and refrigerate for another hour.\n" +
                "4.About 25 minutes before serving, shape the meat around the skewers and place the kebabs on to a grill over a drip tray, or in a pre-heated oven (also on a drip tray).\n" +
                "5.If cooking them over a charcoal grill, you will have to keep rotating them so that they brown and cook evenly.\n" +
                "6.They should take 15-20 minutes to cook.\n" +
                "7.Brush with ghee and cook another 2 minutes.\n" +
                "8.Serve garnished with chaat masala onions and the lemon and serve with green chutney.",
                "1.In a pan add oil. Add chopped garlic, chillies. Saute.\n" +
                        "2.Add the chopped chicken and let it cook for a minute. Coat the chicken with all the garlic and chillies. Add a little salt in that. Toss.\n" +
                        "3.Once the chicken is almost cooked add chilli sauce, tomato puree, soy sauce and sugar. Cook till the sauce starts to reduce.\n" +
                        "4.Add basil. Stir.\n" +
                        "5.Serve.",
                "1.Mix the masalas in the yoghurt and leave for 20-30 minutes.\n" +
                        "2.Place a saucer like plate, greased in a bigger plate.\n" +
                        "3.Arrange the paneer pieces along the edge and cook, uncovered on HI for 4 minutes.\n" +
                        "4.Turn over, brush with a little oil and cook again on HI for 4 minutes and serve.",
                "1.Mix all the ingredients except the oil, and beat to a fluffy batter.\n" +
                        "2.Rest in a cool place about 15 minutes.\n" +
                        "3.Heat the oil and deep fry spoonfuls of the batter to a golden color, first at high then medium.",
                "1.Marinate the chicken wings.\n" +
                        "2.Drizzle the chicken wings with olive oil. Then add ginger-garlic paste, turmeric powder, chili powder, coriander powder, and cumin powder, salt to taste and massage the chicken wings gently.\n" +
                        "3.Heat up the pan and drizzle with one tsp oil and sear the wings in it, add salt to taste.\n" +
                        "Prepare bhuna masala:\n" +
                        "1.Heat up the pan and drizzle it with 1 tsp of oil and add dry red chili, cumin seeds and coriander seeds.\n" +
                        "2.Saute it lightly. Then mix chicken wings with the bhuna masala.\n" +
                        "3.Add onions and saute it till golden brown.\n" +
                        "4.Add tomatoes and cook for 2-3 minutes. Then add sugar, water, lime and capsicum and let it cook away for 2-3 minutes more.\n" +
                        "5.Sprinkle chopped coriander leaves to garnish.",
                "1.Soak potatoes in a large bowl of water for about 30 minutes. Pat dry thoroughly with paper towels.\n" +
                        "2.Heat oil in a deep-fryer or large saucepan to 275 degrees F (135 degrees C). Gently add the potatoes in the hot oil for about 5 minutes, stirring and flipping the potatoes occasionally. Remove potatoes from oil with a slotted spoon to drain on paper towel and to cool completely.\n" +
                        "3.Heat oil in a deep-fryer or large saucepan to 350 degrees F (175 degrees C). Fry the potatoes again until golden brown, 5 to 6 minutes. Blot with a paper towel. Sprinkle with salt to serve." ,
                "1.Cut all the bell peppers, zucchini, onion, garlic and mushrooms.\n" +
                        "2.Heat oil in a pan add the garlic, onion, bell peppers and toss it well. Now add the mushrooms and zucchini and toss is again.\n" +
                        "3.Add the pesto sauce and white sauce and mix well. Add the cheese and give it a nice stir. Add salt as per your taste and give it a good mix.\n" +
                        "4.Remove the mixture from the heat and keep aside. Add mayonnaise and celery. Mix it well.\n" +
                        "5.Now toast or grill the bread slices on a pan. Apply butter to it and the mixture.\n" +
                        "6.Add butter to the second slice as well and place it over, completing a sandwich.",
                "1.Wash, clean and de-stalk mushrooms.\n" +
                        "2.In a round bottomed bowl add the rest of the ingredients. Whisk lightly.\n" +
                        "3.Add mushrooms and marinate for 30 minutes.\n" +
                        "4.Grill over a medium serrated griddle. Do not overcook as paprika powder will turn brown and become bitter.\n" +
                        "5.Serve hot sprinkled with black pepper crushed.",
                "1.Roast the cottage cheese in oven, to evaporate moisture from it. Mash it and add salt, pepper, jalapeno, roasted jeera powder, corn flour and maida.\n" +
                        "2.Mix and mash it nicely. Make equal size croquettes.\n" +
                        "3.Apply the corn flour and maida batter and roll on the bread crumb.\n" +
                        "4.Deep fry and serve hot with thousand island dressing.",
                "1.Take yogurt in a bowl. Add ginger garlic paste, lemon juice, turmeric powder with cashew nut powder and mix it well.\n" +
                        "2.Add cardamom powder, crushed peppercorns, caraway seeds and cream and mix well with the above paste.\n" +
                        "3.Afterwards take chicken coat it well, place in refrigerator to marinate for 24 hours.\n" +
                        "4.Heat oil in a pan. Take chicken, place on it and fry till turns golden in colour. Flip and cook other side too for at least 10-12 minutes.\n" +
                        "5.Lastly, serve hot with mint chutney, pickled onions and side salad.",
                "1.Cut lamb into thin slices and marinade with vegetable oil, dry sherry, sugar and salt.\n" +
                        "2.Heat wok and add oil.\n" +
                        "3.Toss garlic, ginger, bokchoy and mushroom into it. Stir for 2-3 minutes.\n" +
                        "4.Add marinated lamb and stir fry for 3-4 minutes. Add oyster sauce and stock.\n" +
                        "5.Simmer for 1-2 minutes until thick.\n" +
                        "6.Garnish with celery.",

                "1.Pre-heat oven to 425 degrees. Place the oven rack on the middle shelf. Line a baking sheet with foil.\n" +
                        "2.In a small bowl, whisk together the flour, sugars, cinnamon and nutmeg.\n" +
                        "3.Peel, core and cube the apples into ½ - 1” pieces and place in a large bowl. You should end up with about 8 cups of cut apples (1000grams or 2 pounds).\n" +
                        "4.Toss the apple with the sugar mixture until thoroughly coated. Place in the prepared pie pan.\n" +
                        "5.Cover the apples with large clumps of the crumb mixture by pinching the crumb topping with your fingers.\n" +
                        "6.Place the pie on the foil lined pan. Bake on the middle rack for 45-55 until the apples are al dente and the crumbs are toasted. At 45 minutes keep a close eye on your pie. You may need to cover it with a pie shield if it starts to brown too quickly.\n" +
                        "7.Place on a cooling rack for at least an hour. This pie is great served warm. To reheat, place in a 350-degree oven for 20 minutes.",
                "1.Soak chia seeds in water for about 2 hours.\n" +
                        "2.Boil milk and star anise and reduce to about 50 %.\n" +
                        "3.Add chia seeds and give a boil. Let it cool down.\n" +
                        "4.Make puree of half the strawberry and add to the chia mixture when it is cold.\n" +
                        "5.Garnish with fresh strawberries on top and serve chilled.",
                "1.Take 2 tbsp of water in a bowl. Sprinkle gelatine on top and leave for 5 minutes.\n" +
                        "2.Take milk and jaggery in a pan. Open the cardamom pods and put in the milk, both seeds and peels. Heat on a low flame.\n" +
                        "3.Once the jaggery has dissolved and milk is hot, add the gelatine, cardamom powder, if using and the cinnamon powder. Stir and cook for about 5 minutes.\n" +
                        "4.Leave to cool for a while. Strain and pour into pudding moulds and refrigerate for at least 2 hours to set. Overnight is best.\n" +
                        "5.Demould chilled panna cotta onto a serving plate, drizzle with cranberry sauce and serve.",
                "1.Boil the cooking cream and set aside.\n" +
                        "2.Mix egg yolk and sugar.\n" +
                        "3.Add egg yolk and sugar mixture into boiled cooking cream.\n" +
                        "4.Add white melted chocolate to the mixture.\n" +
                        "5.Fold the whipped cream gently and mix.\n" +
                        "6.Divide the mixture into three bowls.\n" +
                        "7.Add orange puree to one bowl.\n" +
                        "8.Add kiwi puree to another and let the third remain as it is.\n" +
                        "9.Arrange the mixture in tri colour pattern in a serving bowl/glass.\n" +
                        "10.Serve chilled.\n" +
                        "11.Garnish with cherry on top.",
                "1.Preheat oven to 350F/180C. Grease the bottom and sides of an 8-inch/20cm (or a 9-inch/23 cm) springform pan. Wrap the outside bottom and sides of the pan with aluminium foil to prevent leaking.\n" +
                        "2.Place chocolate and butter in a medium heat-proof bowl and microwave in 20 to 30-second increments, stirring between each, until melted. Alternatively, you can set the bowl over a saucepan of simmering water, making sure the water doesn’t touch the bowl and stir occasionally until melted. Set aside.\n" +
                        "3.In a large bowl, place egg yolks and ½ cup (100g) sugar, and whisk by hand for a minute until pale and thick. Stir in chocolate mixture, brandy, almonds, blueberry jam and salt.\n" +
                        "4.In a mixer bowl fitted with a whisk attachment, whisk eggs and the remaining ½ cup of sugar on high speed until thick, shiny, soft peaks form.\n" +
                        "5.Using a spatula, fold one-third of egg white mixture into chocolate mixture until mixed. Fold in the remaining mixture in 2 additions until combined.\n" +
                        "6.Pour batter into the prepared cake pan and smooth the top. Bake for 30-35 minutes, until a toothpick inserted into the centre, comes out with moist crumbs. The cake should be set on the sides but still wobbly in the centre.\n" +
                        "7.Allow to cool on a wire rack, then refrigerate for at least 4 hours until completely set.\n" +
                        "8.Sift cocoa powder over the cake before serving. Serve chilled or at room temperature.\n" +
                        "9.Keep the cake well wrapped in the refrigerator for up to 4 days. It also freezes well."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciepe);
        Intent intent = getIntent();
        String item = intent.getExtras().getString("item");
        for(int i=0;i<items.length;i++) {
            if(item.contentEquals(items[i])) {
                TextView ing = findViewById(R.id.ingredients);
                ing.setText("Key Ingredients: " + ingredients[i]);
                TextView rec = findViewById(R.id.recipe);
                rec.setText("Recipe: " + recipe[i]);
            }
        }

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();

    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();

    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();

    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
