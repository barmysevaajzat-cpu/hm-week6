public static int area1(int side){
        return side * side;}
public static int area2( int w , int h){
    return w * h;}
public static int area3( int a , int b, int c){
    return a * b * c ;}
public static double area(double radius){
    return radius * 2;}
void main() {
    int result = area1(6);
    System.out.println(" Area of square : "+result);
    int res = area2(5,8);
    System.out.println(" Area of a rectangle: "+ res);
    int re = area3(7,9,2);
    System.out.println(" Area of a :"+re);
    double resu = area(8);
    System.out.println(" Area of a circle : "+ resu);
            }
