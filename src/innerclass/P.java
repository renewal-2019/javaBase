package innerclass;

public interface P {
    default void ha() {
        System.out.println("haah");
    }
}

interface X {
     default void ha(){
         System.out.println("aaa");
     }

}

interface P1 extends P, X {
    @Override
    default void ha() {

    }
}