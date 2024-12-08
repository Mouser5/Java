class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
    //1
    public void speak (int i){
        for (int k=0;k<i;k++){
            System.out.println("Animal speak");
        }
    }
}
//2 Если тип возврата не совпадает - ошибка 
class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
    //3
    @Override 
    public void MakeSound(){ //- ошибка

    }

}
