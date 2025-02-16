package src.models;

public class Book extends Product{

    public Book(String title, double price){
        super(title, price);
    }
    @Override
    public void displayInfo(){
        System.out.println(getTitle() + getPrice() + " : azn" );
    }

}


