
    package day27_staticKeyword;

    public class Deneme {
        static  int count=0;
        public void increment(){
            count++;

        }

        public static void main(String[] args) {
            Deneme obj1=new Deneme();
            Deneme obj2=new Deneme();

            obj1.increment();

            obj2.increment();

            System.out.println("obj1 : count is=" + obj1.count);
            System.out.println("obj2 : count is=" + obj2.count);

        }
    }

