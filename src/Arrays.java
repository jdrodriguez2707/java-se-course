public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17]; // Misuse
        int[] days = new int[7]; // Good use

        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */
        //String[][] cities = new String[4][2]; // rows and columns 4 * 2 = 8
        String[][] cities = {
                {"Colombia", "Medellín"},
                {"Colombia", "Bogotá"},
                {"México", "Guadalajara"},
                {"México", "CDMX"}
        };

        for (String[] countriesCities : cities) {
            for (String name : countriesCities) {
                System.out.println(name);
            }
        }

        System.out.println();

        //int[][][] numbers = new int[2][2][2]; // it's advisable to use database
        //int[][][][] numbers = new int[2][2][2][2];

        int[][][][] numbers = {
                {
                        {
                                {1, 2},
                                {3, 4}
                        },
                        {
                                {5, 6},
                                {7, 8}
                        }
                },
                {
                        {
                                {9, 10},
                                {11, 12}
                        },
                        {
                                {13, 14},
                                {15, 16}
                        }
                }
        };

        for (int[][][] numbers1 : numbers) {
            for (int[][] numbers2 : numbers1) {
                for (int[] numbers3 : numbers2) {
                    for (int number : numbers3) {
                        System.out.println(number);
                    }
                }
            }
        }

        int[][] nums = {{1, 2, 3}, {4, 5, 6}};
        for (int[] subNumbers : nums) {
            for (int number : subNumbers) {
                System.out.println(number);
            }
        }
        //System.out.println(numbers[1][2]);


        char[] letters = {'a', 'b', 'c', 'd'};
        //System.out.println(letters[3]);
        //System.out.println();


        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for (String androidVersion : androidVersions) {
            if (androidVersion == null) {
                continue;
            }
            System.out.println(androidVersion);
        }

        /*
        for (int i = 0; i < androidVersions.length; i++) {
            if (androidVersions[i] == null) {
                continue;
            }
            System.out.println(androidVersions[i]);
        }
        */




        /*
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
        */

        System.out.println();
        System.out.println();

        /*
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";
        */

        /*
        for (String[] countryCity : cities) {
            for (String name : countryCity) {
                System.out.println(name);
            }
        }
        */


        /*
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }
        */



        /*
        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
        */

        System.out.println();
        System.out.println();

        //String[][][][] animals = new String[2][3][2][2];
        //animals[1][0][0][1] = "Frosty";
        String[][][][] animals = {
                {
                        {{"Fifi", "Fifi"}, {"Fifi", "Fifi"}},
                        {{"Fifi", "Fifi"}, {"Fifi", "Fifi"}},
                        {{"Fifi", "Fifi"}, {"Fifi", "Fifi"}}
                },
                {
                        {{"Max", "Frosty"}, {"Max", "Max"}},
                        {{"Max", "Max"}, {"Max", "Max"}},
                        {{"Max", "Max"}, {"Max", "Max"}}
                }
        };

        System.out.println("My dog's name is: " + animals[1][0][0][1]);

        for (String[][][] domestic : animals) {
            for (String[][] dogs : domestic) {
                for (String[] frenchPoodles : dogs) {
                    for (String name : frenchPoodles) {
                        if (name == null) {
                            continue;
                        }
                        System.out.println(name);
                    }
                }
            }
        }

        /*
        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                for (int k = 0; k < animals[i][j].length; k++) {
                    for (int l = 0; l < animals[i][j][k].length; l++) {
                        if (animals[i][j][k][l] == null) {
                            continue;
                        }
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
        */

        String[][][][] monkeys = {
                {
                        {
                                {},
                                {}
                        },
                        {
                                {},
                                {}
                        }
                },
                {
                        {
                                {"King Kong", "Changuito"},
                                {}
                        },
                        {
                                {},
                                {}
                        }
                }

        };

        System.out.println(monkeys[1][0][0][1]);

        for (String[][][] monkeys3 : monkeys) {
            for (String[][] monkeys2 : monkeys3) {
                for (String[] monkeys1 : monkeys2) {
                    for (String monkey : monkeys1) {
                        System.out.println(monkey);
                    }
                }
            }
        }
    }
}
