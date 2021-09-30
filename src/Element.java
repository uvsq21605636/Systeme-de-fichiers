public abstract class Element {
        //VARIABLE D'INSTANCE
        protected String name;

        public String getName(){
            return this.name;
        }

        public Element(String name){
            this.name = name;
        }

        public abstract int getSize();
}
