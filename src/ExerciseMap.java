import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ExerciseMap {
    public static void main(String[] args) {

        Map<String, Integer> votes = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the full file path");
        String filePath = sc.next();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)) {
                    int votesSoFar = votes.get(name);
                    count += votesSoFar;

                    votes.put(name, count);
                } else {
                    votes.put(name, count);
                }
                line = reader.readLine();
            }
            for( String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
