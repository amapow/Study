package chapter7.polymorphism;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {
        System.out.println("먹습니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void humting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘로 날아갑니다.");
    }

    public void flight() {
        System.out.println("독수리가 비행을 날개도 펴고 합니다.");
    }
}

public class AnimalTest {

    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);

//        for(Animal animal : animalList) {
//            animal.move();
//        }





    }

    public void testDownCasting(ArrayList<Animal> list){

        for(int i = 0 ; i < list.size() ; i++) {
            Animal animal = list.get(i);

            if ( animal instanceof Human) {
                Human human = (Human)animal;
                human.readBooks();
            }

            else if ( animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.humting();
            }
            else if ( animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.flight();
            }
            else
                System.out.println("error");
        }
    }
    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
