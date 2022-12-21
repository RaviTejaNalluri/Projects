public class Q
{
  public static void book(Short a)
  {
    System.out.println("SHORT");
  }
  public static void book(short a)
  {
    System.out.println("short");
  }
  public static void book(Long a)
  {
    System.out.println("LONG");
  }
  public static void book(long a)
  {
    System.out.println("Long");
  }
  public static void main(String args[])
  {
    short shortroom=1;
    int introom=2;
    book(introom);
  }
}
