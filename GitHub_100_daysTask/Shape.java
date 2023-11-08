package GitHub_100_daysTask;

public class Shape {
    public void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setBreadth(10);
        r1.setLength(20);
        System.out.println(r1.getArea());

    }
}
     class Rectangle{
        int length;
        int breadth;

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

        public int getArea(){
            return length * breadth;
        }
    }


