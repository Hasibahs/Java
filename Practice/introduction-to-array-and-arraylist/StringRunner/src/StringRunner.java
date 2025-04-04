public class StringRunner {
    public static void main(String[] args) {
        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        String dayWithMostCharacter = "";

        for (String day : dayOfWeek) {
            if (day.length() > dayWithMostCharacter.length()) {
                dayWithMostCharacter = day;
            }
        }
        System.out.println("Day with Most number of characters "+ dayWithMostCharacter);

        for(int i = dayOfWeek.length-1; i >=0; i--){
            System.out.println(dayOfWeek[i]);
        }

    }
}
