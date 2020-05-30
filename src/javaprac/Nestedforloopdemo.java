package javaprac;

public class Nestedforloopdemo {
    public static void main(String[] args) {
//its for loop in a for loop
        String[][] fancycolors = {{"red", "yellow", "blue"},
                {"cyan", "Magenta", "Turquoise"}};
        for (int i = 0; i < 2; i++) {//looping throw rows 6 and 7
            for (int j = 0; j < 3; j++) {//looping throw columsh
                System.out.println(fancycolors[i][j]);
            }
        }
    }
}