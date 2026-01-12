import java.util.Scanner;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Wpisz liczbę cakowitą:");
    int liczba = sc.nextInt();

    if (liczba > 0){
      System.out.println("Liczba jest dodatnia");
    } else if (liczba < 0){
      System.out.println("Liczba jest ujemna");
    } else{
      System.out.println("Liczba jest równa zero");
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}