import java.util.Scanner;

public class OneBhk {

        private double roomArea;
        private double hallArea;
        private double price;

        OneBhk(){
            roomArea=0;
            hallArea=0;
            price=0;
        }

        OneBhk(double roomArea, double hallArea, double price){
            this.roomArea=roomArea;
            this.hallArea=hallArea;
            this.price=price;
        }

        void show(){
            System.out.println("\nRoom Area: "+roomArea+"\nHall Area: "+hallArea+"\nprice: "+price);
        }
    }

    class TwoBhk extends OneBhk{
        private double room2Area;

        TwoBhk(double roomArea, double hallArea, double price, double room2Area){
            super(roomArea, hallArea, price);
            this.room2Area = room2Area;
        }

        void show(){
            super.show();
            System.out.println("Room 2 Area: "+room2Area);
        }
    }

    class bhk{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            TwoBhk obj1 = new TwoBhk(12,14,1500,15);
            TwoBhk obj2 = new TwoBhk(15,13,1000,20);
            TwoBhk obj3 = new TwoBhk(14,20,2000,15);
            obj1.show();
            obj2.show();
            obj3.show();
        }
    }

