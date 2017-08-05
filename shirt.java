public class shirt{
public static void main(String args[])
{
String color="red";
String shirt="shirt";
switch(color){
case "Blue": 			
shirt="Blue" + shirt;
//break;
case "red": 
shirt="red" + shirt;
//break;
default:
shirt="white" + shirt;
}
System.out.println("shirtt type:" + shirt);
}
}