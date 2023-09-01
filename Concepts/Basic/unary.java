class Unary
{
public static void main(String []args)
{
a=20;
b=a++ + ++a - a-- - --a + a++ + --a -a++ + ++a - a--;
System.out.println(a);
System.out.println(b);
}
}
