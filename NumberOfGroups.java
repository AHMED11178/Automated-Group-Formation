import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class NumberOfGroups {

    public static void main(String[] args) {

    

        try (Scanner input = new Scanner(new File("ListOfNames.txt"))) {

            ArrayList<String> ArrayList = new ArrayList<>();

            int numberOfStudents = 0;

            
            while (input.hasNext()) {

                ArrayList.add(input.next());

                numberOfStudents = numberOfStudents + 1;

            }

            Scanner inputNumberOfGroups = new Scanner(System.in);

            System.out.println("Enter the number of groups");
            int numberOfGroups = inputNumberOfGroups.nextInt();
            System.out.println("");

            if ((numberOfStudents % numberOfGroups) == 0) {

                int average = numberOfStudents / numberOfGroups;
                

                for (int i = 1; i <= numberOfGroups; i++) {

                    ArrayList<String> ArrayListGroup = new ArrayList<>();

                    for (int j = 0; j < average; j++) {

                        int randomIndex = (int) (Math.random() * ArrayList.size());

                        ArrayListGroup.add(ArrayList.remove(randomIndex));


                    }

                    System.out.println("Group" + i);
                    System.out.println("");
                    System.out.println(ArrayListGroup);
                    System.out.println("");
                }

                
            }

            else {

                int remainder = numberOfStudents % numberOfGroups;

                int average = numberOfStudents / numberOfGroups;
                

                for (int i = 1; i <= numberOfGroups; i++) {

                    ArrayList<String> ArrayListGroup = new ArrayList<>();

                    for (int j = 0; j < average; j++) {

                        int randomIndex = (int) (Math.random() * ArrayList.size());

                        ArrayListGroup.add(ArrayList.remove(randomIndex));

                    }

                    if (remainder != 0) {

                        int randomIndex = (int) (Math.random() * ArrayList.size());

                        ArrayListGroup.add(ArrayList.remove(randomIndex));

                        remainder = remainder - 1;
                    }
                    

                    System.out.println("Group" + i);
                    System.out.println("");
                    System.out.println(ArrayListGroup);
                    System.out.println("");
                }

            }

            inputNumberOfGroups.close();

        } 
        
        
        catch (FileNotFoundException e) {
    
            e.printStackTrace();
        }

    }
    
}