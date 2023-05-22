package org.example;

public class User01{
    protected class User02{
        public void sOut(){
            System.out.println("I'm user01");
        }
    }

    private class User03 extends User02{
        @Override
        public void sOut(){
            System.out.println("I'm user02");
        }
    }

    public class User04 extends User03{
        @Override
        public void sOut(){
            System.out.println("I'm user03");
        }
    }


}
