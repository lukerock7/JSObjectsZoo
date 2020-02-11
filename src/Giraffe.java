public class Giraffe extends Animal{

    public Giraffe(String name){
        super(name, "fruit");
    }

    public void eat(String food){
        if(food == favoriteFood){
            System.out.println(name + " eats " + food);
            System.out.println("they're GREAT!!! " + name + " wants more " + food);
            this.sleep();
        } else {
            System.out.println("EWW!!! " + name + " will not eat " + food);
        }
    }
}