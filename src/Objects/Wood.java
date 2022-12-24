package Objects;

import util.Wather;

public class Wood extends PhisicalObject{
    public Wood(String name, Size size){
        super(name, size);
    }


    public class Branch{
        private String name;
        private Size size;

        public Branch(String name, Size size){
            this.setName(name);
            this.setSize(size);
        }

        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        public Size getSize(){
            return this.size;
        }
        public String getSizeDescription(){
            return this.size.getSizeDescription();
        }
        public void setSize(Size size){
            this.size = size;
        }


        public void stickOut(Wather wather) {
            System.out.println(this.getName() + " высоко-высоко торчит из " + wather.getName());
        }
    }


}
