import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));
//        heroes.add(blackWidow);
//        heroes.add(captainAmerica);
//        heroes.add(vision);
//        heroes.add(ironMan);
//        heroes.add(scarlettWitch);
//        heroes.add(thor);
//        heroes.add(hulk);
//        heroes.add(doctorStrange);
        // TODO 3 : It's Thor birthday, now he's 1501
        heroes.get(5).setAge(1501);
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        // TODO 5 : Keep only the half of the list
        List<Hero> halfOfHeroes = heroes.subList(0, 4);
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (int i = 0; i < halfOfHeroes.size(); i++) {
            Hero hero = halfOfHeroes.get(i);
            System.out.printf("Hero name: %s, age: %d%n", hero.getName(), hero.getAge());
        }
    }
}
