package com.techelevator;

public class Exercises {

    /**
     * For the purposes of this exercise, the following naming rules are tested:
     *
     * Variable names:
     *  - must start with a lowercase character a-z.
     *  - underscore ('_') characters are not allowed.
     *  - dollar sign ('$') characters are not allowed.
     *  - must be at least two characters in length.
     *  - You are encouraged to create descriptive names and are required to camel case them as appropriate.
     *
     * Constant names:
     *  - must start with an uppercase character A-Z.
     *  - dollar sign ('$') characters are not allowed.
     *  - must be at least two characters in length.
     *  - You are encouraged to create descriptive names and are required to upper case them as appropriate.
     *
     * Due to practical limitations, camel case and pascal case are not tested other than checking the first
     * character of the name is lower case for variables and upper case for constants. Your instructor will
     * manually review your solution checking for the correct casing.
     */

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsPlayingInWoods = 3;
		int raccoonsEatingDinner = 2;
		int numberOfRacoonsInWoods = raccoonsPlayingInWoods - raccoonsEatingDinner;



        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfExactBees = numberOfFlowers - numberOfBees;


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int pigeonAlreadyEating = 1;
		int pigeonThatAlsoJoined = 1;
		int numberOfPigeonSeating = pigeonAlreadyEating + pigeonThatAlsoJoined;




        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsSittingOnFence = 3;
		int owlsThatJoined = 2;
		int totalOwlsOnFence = owlsSittingOnFence + owlsThatJoined;



        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorkingOnHome = 2;
		int beaversSwimming = 1;
		int totalStillWorking = beaversWorkingOnHome - beaversSwimming;



        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int sittingAlready = 2;
		int toucansJoining = 1;
		int totalToucan = sittingAlready + toucansJoining;



        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int totalDifference = numberOfSquirrels - numberOfNuts;



        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = 0.25;
		double dime = 0.10;
		double nickle = 0.05;
		double totalAmount = quarter + dime + nickle + nickle;


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brierMuffins = 18;
		int macAdamsMuffins = 20;
		int flanneryMuffins = 17;
		int totalMuffins = brierMuffins + macAdamsMuffins + flanneryMuffins;




        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo = 0.24;
		double whistle = 0.14;
		double totalAmountSpend = yoyo + whistle;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int riceKrispies = 5;
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int mrsHiltSnow = 29;
		int brecknockSnow = 17;
		int totalSnow = mrsHiltSnow - brecknockSnow;




        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2.50 on a pencil
        case. How much money does she have left?
        */
		double startingAmount = 10.00;
		double toyTruck = 3.00;
		double pencilCase = 2.50;
		double amountLeft = startingAmount - toyTruck - pencilCase;


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshMarbles= 16;
		int lostMarbles = 7;
		int newCollection = joshMarbles - lostMarbles;



        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganSeashells = 19;
		int collectionSeashells = 25;
		int amountOfSeashells = collectionSeashells - meganSeashells;


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradBalloons = 17;
		int red = 8;
		int green = bradBalloons - red;



        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int alreadyOnShelf = 38;
		int newBooks = 10;
		int booksOnShelf = alreadyOnShelf + newBooks;




        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int amountOfBees = 8;
		int amountOfLegs = beeLegs * amountOfBees;



        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamCone = 0.99;
		int amountOfCones = 2;
		double costOfIceCream = iceCreamCone * amountOfCones;



        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalRocks = 125;
		int amountSheHas = 64;
		int amountSheNeeds = totalRocks - amountSheHas;



        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltsMarbles = 38;
		int marblesLost = 15;
		int marblesLeft = hiltsMarbles - marblesLost;



        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int concertMiles = 78;
		int milesDriven = 32;
		int milesLeft = concertMiles - milesDriven;



        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int satMorning = 90;
		int satAfternoon = 45;
		int totalTime = satAfternoon + satMorning;



        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int totalHotDogs = 6;
		double costOfHotDogs = 0.50;
		double totalCost = totalHotDogs * costOfHotDogs;




        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int startingCents = 50;
		int pencilCost = 7;
		int sheCanBuy = startingCents /  pencilCost;



        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterflies = 33;
		int orangeBf = 20;
		int redBf = butterflies - orangeBf;



        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double clerk = 1.00;
		double candy = 0.54;
		double kate = clerk - candy;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int backyardTrees = 13;
		int plant = 12;
		int tree = backyardTrees + plant;


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hoursADay = 24;
		int days = 2;
		int grandma = hoursADay * days;



        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
		int piecesOfGum = 5;
		int totalGum = cousins * piecesOfGum;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double dan = 3.00;
		double candyBar = 1.00;
		double moneyLeft = dan - candyBar;


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boats = 5;
		int people = 3;
		int totalPeople = boats * people;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legos = 380;
		int legosLost = 57;
		int legosTotal = legos - legosLost;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsBaked = 35;
		int muffinGoal = 83;
		int muffinLeft = muffinGoal - muffinsBaked;



        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willy = 1400;
		int lucy = 290;
		int willyCrayons = willy - lucy;




        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickers = 10;
		int pages = 22;
		int totalStickers = stickers * pages;


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakes = 100;
		int children = 8;
		double cupcakesEqually = (double) cupcakes / children;


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookies = 47;
		int jar = 6;
		int remainingCookies = gingerbreadCookies % jar;



        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissants = 59;
		int neighbors = 8;
		int remainingCroissants = croissants % neighbors;



        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesOnTray = 12;
		int cookies = 276;
		int traysNeeded = cookies / cookiesOnTray;


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int biteSizePretzels = 480;
		int servingSize = 12;
		int amountPrepared = biteSizePretzels / servingSize;


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakes = 53;
		int home = 2;
		int boxes = 3;
		int totalBoxes = (lemonCupcakes - home)/ boxes;


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotsSticks = 74;
		int amountOfPeople = 12;
		int carrotsUneaten = carrotsSticks % amountOfPeople;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBear = 98;
		int bearsOnShelves = 7;
		int totalShelves =  teddyBear / bearsOnShelves;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int pictures = 480;
		int picturesInAlbum = 20;
		int albumsNeeded = pictures / picturesInAlbum;



        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int cards = 94;
		int cardsInBox = 8;
		int filledBoxes = cards / cardsInBox;
		int cardsUsed = filledBoxes * cardsInBox;
		int remainingCards = cards - cardsUsed;



        /* Exercise 49
        49. The Milky Way galaxy contains 300 billion stars. The Andromeda galaxy
        contains 1 trillion stars. How many stars do the two galaxies contain combined?
        */
		long milkyWayGalaxy = 300000000000L;
		long andromedaGalaxy = 1000000000000L;
		long totalStars = milkyWayGalaxy + andromedaGalaxy;




        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int bakedCroissants = 17;
		int numberOfGuest = 7;
		double totalCroissants = (double)bakedCroissants / numberOfGuest;







	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */
		double billsRate = 2.15;
		double jillsRate = 1.90;
		int rooms = 5;
		double hours = rooms / ((1/billsRate) + (1/jillsRate));





     

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		char middleInitial = 'B';
		String fullName = lastName + "," + " " + firstName + " " + middleInitial + ".";



	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		float newYorkToChicago = 800f;
		float trainTraveled = 537f;
		int percentageCompleted =(int)((trainTraveled / newYorkToChicago) * 100);




	}

}
