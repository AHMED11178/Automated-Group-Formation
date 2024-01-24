import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class NumberOfMaxStudent {

    public static void main(String[] args) {

    

        try (Scanner input = new Scanner(new File("ListOfNames.txt"))) {

            ArrayList<String> ArrayList = new ArrayList<>();

            int numberOfStudents = 0;

            
            while (input.hasNext()) {

                ArrayList.add(input.next());

                numberOfStudents = numberOfStudents + 1;

            }

            Scanner inputNumberOfMaxStudents = new Scanner(System.in);

            System.out.println("Enter the number of maximum Students in each group");
            int numberOfMaxStudents = inputNumberOfMaxStudents.nextInt();
            System.out.println("");

            if (numberOfStudents % numberOfMaxStudents == 0) {

                int numberOfGroups = numberOfStudents / numberOfMaxStudents;

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

                int numberOfGroups = numberOfStudents / numberOfMaxStudents;
                int remainder = numberOfStudents % numberOfMaxStudents;
                

                for (int i = 1; i <= numberOfGroups; i++) {

                    ArrayList<String> ArrayListGroup = new ArrayList<>();

                    for (int j = 0; j < numberOfMaxStudents; j++) {

                        int randomIndex = (int) (Math.random() * ArrayList.size());

                        ArrayListGroup.add(ArrayList.remove(randomIndex));

                    }
                    
                    System.out.println("Group" + i);
                    System.out.println("");
                    System.out.println(ArrayListGroup);
                    System.out.println("");
                }

                ArrayList<String> ArrayListGroup2 = new ArrayList<>();

                for (int i = numberOfGroups + 1; remainder > 0; i++) {
                
                    int randomIndex = (int) (Math.random() * ArrayList.size());
                
                    ArrayListGroup2.add(ArrayList.remove(randomIndex));
                
                    remainder = remainder - 1;
                        
                }

                System.out.println("Group" + (numberOfGroups+1));
                System.out.println("");
                System.out.println(ArrayListGroup2);
                System.out.println("");
                
            }

            

            inputNumberOfMaxStudents.close();

        }

        catch (FileNotFoundException e) {
    
            e.printStackTrace();
        }
        
    }

}