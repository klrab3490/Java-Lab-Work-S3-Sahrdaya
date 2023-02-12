abstract class Shape
{
        public abstract void Noofsides();
}

class Rectangle extends Shape
{
        public void Noofsides()
        {
                System.out.println("No. Of Sides In Rectangle : 4");
        }
}
class Triangle extends Shape
{
        public void Noofsides()
        {
                System.out.println("No. Of Sides In Triangle : 3");
        }
}
class Hexagon extends Shape
{
        public void Noofsides()
        {
                System.out.println("No. Of Sides In Hexagon : 6");
        }
}

class Polymorphism
{
        public static void main(String[] args)
        {
                Rectangle r = new Rectangle();
                Triangle t = new Triangle();
                Hexagon h = new Hexagon();
                r.Noofsides();
                t.Noofsides();
                h.Noofsides();
        }
}
