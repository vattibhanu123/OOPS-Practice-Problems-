// Recipe Management System
// Problem Statement:
// Design a system to manage recipes in a cooking application.

// Classes:
// Base Class: Recipe (attributes like name and ingredients)
// Subclasses: VegetarianRecipe, NonVegetarianRecipe (with cooking time)
// Methods:
// A method to display recipe details and calculate total preparation time.
class Recipe{
    private String name;
    private String[] ingredients;
    private int cookingTime;
 public Recipe(String name,String[] ingredients,int cookingTime){
    this.name=name;
    this.ingredients=ingredients;
    this.cookingTime=cookingTime;
 }
 public String getName(){
    return name;
 }
 public String[] getIngredients(){
    return ingredients;
 }
 public int getCookingTime(){
    return cookingTime;
 } 
 public void display(){
    System.out.println("Recipe Name: "+getName());
    System.out.print("Ingredients :");
    for(String ingredient:ingredients){
        System.out.print(ingredient+" ");
    }
    System.out.println();
    System.out.println("Cooking Time: "+getCookingTime()+" minutes");
 }

}
class VegetarianRecipe extends Recipe{
    public VegetarianRecipe(String name,String[] ingredients,int cookingTime){
        super(name,ingredients,cookingTime);
    }
    public void display(){
        System.out.println("VegetarianRecipe");
        super.display();
        
    }

}
class NonVegetarianRecipe extends Recipe{
    public NonVegetarianRecipe(String name,String[] ingredients,int cookingTime){
        super(name,ingredients,cookingTime);
    }
    public void display(){
        System.out.println("NonVegetarianRecipe");
        super.display();
        
    }
}
public class RecipeManagement{
    public static void main(String args[]){
        String[] vegIngredients={"veggies","MaggiMasala","Eggs"};
        VegetarianRecipe vegRecipe=new VegetarianRecipe("Maggie",vegIngredients
        ,20);
        vegRecipe.display();
System.out.println();
        String[] nonVegIngredients={"Chicken","Masalas","Eggs"};
        NonVegetarianRecipe nonVegRecipe=new NonVegetarianRecipe("ChickenGravy",nonVegIngredients
        ,50);
        nonVegRecipe.display();


    }

}