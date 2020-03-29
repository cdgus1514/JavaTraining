package Chapter7.Polymorhisim;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직인다.");
    }
}

class Human extends Animal{
    public void move(){ // 오버라이딩
        System.out.println("사람이 두발로 걷는다.");
    }

    public void readBooks(){ // 다운캐스팅이 필요한 메서드
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{
    public void move(){ // 오버라이딩
        System.out.println("호랑이가 네 발로 뛴다.");
    }

    public void hunting(){  // 다운캐스팅이 필요한 메서드
        System.out.println("호랑이가 사냥을 한다.");
    }
}

class Eagle extends Animal{
    public void move(){ // 오버라이딩
        System.out.println("독수리가 하늘은 난다.");
    }

    public void flying(){ // 다운캐스팅이 필요한 메서드
        System.out.println("독수리가 날개를 핀다");
   }
}


public class AnimalTest {
    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        // 다형성1 메소드를 사용한 결과 출력
        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);
        System.out.println("\n");

        // 다형성2 ArrayList를 사용하여 결과 출력
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for (Animal animal : animalList){
            System.out.println(animal);
            animal.move();
        }
        System.out.println("\n");

        // 다운캐스팅
//        if (hAnimal instanceof Human){
//            Human human = (Human)hAnimal;
//            human.readBooks();
//        }
//        Tiger tiger = (Tiger)tAnimal;
//        Eagle eagle = (Eagle)eAnimal;
//
//        tiger.hunting();
//        eagle.flying();

        // 다형성3 다운캐스팅(명시적 형변환) + ArrayList + 메소드를 사용
        test.testDownCasting(animalList);



    }

    public void moveAnimal(Animal animal){
        animal.move();
    }

    public void testDownCasting(ArrayList<Animal> list){
        for (int i=0; i<list.size(); i++){
            Animal animal = list.get(i);

            if (animal instanceof Human){
                Human human = (Human)animal;
                human.readBooks();
            }
            else if (animal instanceof Tiger){
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }
            else if(animal instanceof Eagle){
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            }
            else {
                System.out.println("ERROR");
            }
        }
    }
}
