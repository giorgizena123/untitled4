//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     //1)
        human a=new human("zaza","yvavidze",52);
        System.out.println("name:"+a.getName()+" "+a.getSurname()+", age:"+a.getAge());
        coworker b=new coworker("luka","mebuke",15,"i42s");
        System.out.println("name:"+b.getName()+" "+b.getSurname()+", age:"+ a.getAge()+", id:"+b.getId());
        manager c=new manager("olegi","birchadze",15,"aleko123");
        System.out.println("name:"+c.getName()+" "+c.getSurname()+", age:"+c.getAge()+", id2:"+c.getId2());

//2)
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Diagonal: " + rectangle.getDiagonal());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
//3)
        Milk milk1 = new Milk(2.5, "2025-12-31", 1.5);
        Cake cake1 = new Cake(15.0, "2025-01-15", 500);
        Sandwich sandwich1 = new Sandwich(5.0, "2024-06-30", 30);

        Product[] products = {milk1, cake1, sandwich1};

        Store store = new Store(products);

        for (Product product : store.getProducts()) {
            System.out.println("Product Price: " + product.getPrice() + " USD");
            System.out.println("Expiration Date: " + product.getExpirationDate());

            if (product instanceof Milk) {
                System.out.println("Milk Volume: " + ((Milk) product).getVolume() + " liters");
            } else if (product instanceof Cake) {
                System.out.println("Cake Weight: " + ((Cake) product).getWeight() + " grams");
            } else if (product instanceof Sandwich) {
                System.out.println("Sandwich Length: " + ((Sandwich) product).getLength() + " cm");
            }
            System.out.println("------");
        }
    }
}


