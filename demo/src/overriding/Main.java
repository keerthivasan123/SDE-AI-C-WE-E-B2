package overriding;

public class Main {

    static void change(int x){
        x = 100;
    }
    static void main() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int[] row : array){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println();

        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 + " , " + s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("Banana".compareTo("Apple"));

        String p = "Java Programming";

        System.out.println(p.startsWith("Pro"));
        System.out.println(p.endsWith("ing"));

        String programs = "    Java,C,Python    ";
        programs = programs.trim();
        System.out.println(programs);

        String[] programArr = programs.split(",");
        for(String program : programArr){
            System.out.println(program);
        }

        String result = String.join("-", "2026", "01", "01");
        System.out.println(result);

        String asdf = "Java is Easy";
        System.out.println("No of Words : " + asdf.split(" ").length);
        System.out.println(new StringBuffer(asdf).reverse().toString());

        int[] arr = {10, 100, 20, 343, 30, 40};
        int sum = 0;
        for(int a : arr){
            sum += a;
        }

        System.out.println("Sum of arr is : " + sum);


        int maxEle = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
        }

        System.out.println("Max Ele : " + maxEle);
    }
}
