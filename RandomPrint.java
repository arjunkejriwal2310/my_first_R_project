public class RandomPrint
{
    public static void main (String[] args)
    {
        // First Sentence
        System.out.print("I go for a run " + ((int) (Math.random() * 8)) + " time(s) a week.\n");
        System.out.println("FITNESS IS KEY! But sometimes I get lazy.");

        System.out.print("\n");

        // Second Sentence
        System.out.println("I flipped a coin 20 times.");
        System.out.print("I got " + ((int)(Math.random() * 21)) + " head(s).\n");
        System.out.println("Theoretical probability " + "is not always the same as" + " experimental probability");
    }
}
