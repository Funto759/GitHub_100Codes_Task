public class Shape {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(10);
        r1.setBreadth(20);
        System.out.println(r1.getArea());

        Rectangle r2 = new Rectangle(20 , 20);
        System.out.println(r2.getArea());
    }
}

         class Rectangle {
            int length;
            int breadth;

            public Rectangle(){

            }

            public Rectangle(int l, int b){
                this.length = l;
                this.breadth = b;

            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public int getBreadth() {
                return breadth;
            }

            public void setBreadth(int breadth) {
                this.breadth = breadth;
            }

            public int getArea() {
                return length * breadth;
            }
        }




