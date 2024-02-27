//Liskov Substitution Principle (LSP)
 interface Heigth{
     void setHeight();
}
interface Width{
    void setWidth();
}

    class Square implements Width,Heigth{
        @Override
        public void setHeight() {

        }

        @Override
        public void setWidth() {

        }
    }
    class Circle implements Width,Heigth{

        @Override
        public void setHeight() {

        }

        @Override
        public void setWidth() {

        }
    }
