// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StringRunner {
    public static void main(String[] args) {
        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };


        String dayWithMostCharacters = "";
        for(String day:dayOfWeek){
            if(day.length() > dayWithMostCharacters.length()){
                dayWithMostCharacters = day;
            }
        }
        System.out.println("Days with most number of characters is: " + dayWithMostCharacters);

//        for (int i=0; i<dayOfWeek.length; i++){
//            System.out.println(dayOfWeek[i]);
//        }

        for(int i=dayOfWeek.length-1; i>=0; i--){
            System.out.println(dayOfWeek[i]);
        }
    }
}