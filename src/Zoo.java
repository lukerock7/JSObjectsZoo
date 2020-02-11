import java.util.*;

public class Zoo {
    public static void main(String args[]){

        Bee berry = new Bee("Berry");
        berry.eat("honey");
        berry.eat("pollen");

        Bear boog = new Bear("Boog");
        boog.eat("fish");
        boog.eat("meat");

        Giraffe melman = new Giraffe("Melman");
        melman.eat("fruit");
        melman.eat("leaves");

        Tiger benny = new Tiger("Benny");
        benny.eat("meat");
        benny.eat("skin");

        Unicorn rainbow = new Unicorn("Rainbow");
        rainbow.eat("marshmallows");
        rainbow.eat("white chocolate chips");


        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(berry);
        berry.populationCount();
        animals.add(boog);
        boog.populationCount();
        animals.add(melman);
        melman.populationCount();
        animals.add(benny);
        benny.populationCount();
        animals.add(rainbow);
        rainbow.populationCount();

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "Corn");
    }
}