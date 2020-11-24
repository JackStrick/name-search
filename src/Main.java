import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.File;
import java.util.stream.Stream;


public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
      Scanner read = new Scanner(new File("names.txt"));
      List<String> namesList = new ArrayList<>();
      while (read.hasNextLine()){
          namesList.add(read.nextLine());
      }
      read.close();
      String[] namesArray = namesList.toArray(new String[0]);
      //TEST LIST IS CREATED CORRECTLY System.out.println(namesArray[4]);
      namesArray = Stream.of(namesArray).sorted().toArray(String[]::new);

      /* TESTING LIST SUCCESSFULLY SORTS
      for (int i = 0; i < 65; i++){
          System.out.println(namesArray[i]);
      }*/
      Scanner searchValue = new Scanner(System.in);
      String nameSearch;
      System.out.print("Enter a name to search for: ");
      nameSearch = searchValue.nextLine();

      int result;
      result = RecursiveBinarySearcher.search(namesArray, nameSearch);

      if (result == -1){
          System.out.println(nameSearch + " was not found.");
      }
      else{
          System.out.println(nameSearch + " was found at " + "element " + result);
      }
    }
}



