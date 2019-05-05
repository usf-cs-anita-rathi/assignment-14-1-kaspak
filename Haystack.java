public class Haystack
{
    public static boolean contains(String haystack, String needle)
    {
        return (contains(haystack, needle, 0, 0));
    }

    public static boolean contains(String haystack, String needle, int i, int j)
    {
        if(j>=needle.length())
            return true;

        if(i>=haystack.length())
            return false;

        char c = haystack.charAt(i);

        if (c == needle.charAt(j))
            return contains(haystack, needle, i+1, j+1);

        else
            return contains(haystack, needle, i+1, 0);
    }

    public static void main(String[] args)
    {
        System.out.println(contains("Java Programming", "Pro"));
        System.out.println(contains("Java Programming", "grammy"));
    }
}
