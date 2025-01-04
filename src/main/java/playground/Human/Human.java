package playground.Human;


public class Human {
        String firstName;
        String lastName;
        int age;
        int balance;

        public Human(String firstName, String lastName, int age, int balance){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.balance = balance;
        }

        String getFirstName(){
            return this.firstName;
        }

        String getLastName(){
            return this.lastName;
        }

        int getAge(){
            return this.age;
        }

        void getInfo(){
            System.out.println("First Name:" + firstName + " Last Name: " + lastName + " Age: " + age + " Balance " + this.balance);
        }

        void say(String words){
            System.out.println(this.firstName + " is saying: " + words);
        }

        void repeatAfterMe(String str){
            System.out.println("Repeating: " + str);
        }

}
