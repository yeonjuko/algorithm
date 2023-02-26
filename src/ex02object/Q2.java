package ex02object;
import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        int durability[] = {5, 3, 4, 1, 3, 8, 3};
        dog[] dogsArrayList = {
                new dog("루비독", "95년생", 3, 4),
                new dog("피치독", "95년생", 3, 3),
                new dog("씨-독", "72년생", 2, 1),
                new dog("코볼독", "59년생", 1, 1)
        };

        solution(durability, dogsArrayList);
    }

    public static void solution(int[] durability, dog[] dogsArrayList) {
        ArrayList<String> answer = new ArrayList<String>();

        for (dog i : dogsArrayList) {
            int position = 0;
            boolean flag = true;

            while (position < durability.length) {
                position += i.jump;

                if (position > durability.length) {
                    break;
                }

                durability[position - 1] -= i.weight;

                if (durability[position - 1] < 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer.add(i.name);
            }
        }
        System.out.println(answer);
    }
}

class dog {
    String name;
    String age;
    int jump;
    int weight;

    public dog (String name, String age, int jump, int weight) {
        this.name = name;
        this.age = age;
        this.jump = jump;
        this.weight = weight;
    }
}