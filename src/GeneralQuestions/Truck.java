//Java Program to Show Inheritance in Class 
/*Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
It is an important part of OOPs (Object Oriented programming system). */

package GeneralQuestions;

//Parent class
class Truck{
    void driveTruck(){
        System.out.println("Driving the truck");
    }
}  

//Single inheritance
class Car extends Truck{
    void driveCar(){
        System.out.println("Driving the car");
    }
}

//Multilevel Inheritance
class EV extends Car{
    void driveEV(){
        System.out.println("Driving the Electric car");
    }
}

//Hierarchical Inheritance
class bike extends Truck{
    void driveBike(){
        System.out.println("Driving the Bike");
    }
}
