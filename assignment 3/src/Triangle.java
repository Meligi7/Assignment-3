public class Triangle extends GeometricObject{
        private int side1;
        private int side2;
        private int side3;
        private String color;
        private String filled;
        public Triangle(int side1,int side2,int side3,String color,String filled){
                this.side1=side1;
                this.side2=side2;
                this.side3 = side3;
                this.color=color;
                this.filled = filled;
        }
        public double area(){
                return this.side1*this.side2*this.side3; // it's not the actual area of a real triangle this is just for simplicity
        }
        public double perimeter(){
                return this.side1+this.side2+this.side3;
        }
        public String color(){
                return this.color;
        }
        public boolean filled(){
                if(this.filled == "filled"){
                        return true;
                }
                return false;
        }

        public int getSide1() {
                return side1;
        }

        public int getSide2() {
                return side2;
        }

        public int getSide3() {
                return side3;
        }

        public String getColor() {
                return color;
        }

        public String getFilled() {
                return filled;
        }

        public void setSide1(int side1) {
                this.side1 = side1;
        }

        public void setSide2(int side2) {
                this.side2 = side2;
        }

        public void setSide3(int side3) {
                this.side3 = side3;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public void setFilled(String filled) {
                this.filled = filled;
        }
}
