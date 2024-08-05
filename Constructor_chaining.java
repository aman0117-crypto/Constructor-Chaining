package constructor;

public class Constructor_chaining {

    String name;
    int roll_no;

    Constructor_chaining(){
        System.out.println("Account is created: ");
    }

    Constructor_chaining(String name){
        this();
        this.name=name;
        //System.out.println(name);
    }
    
    Constructor_chaining(String name,int roll_no){
        this(name);
        this.roll_no=roll_no;
        System.out.println(name+" "+roll_no);
    }

    public static void main(String[] args) {
        Constructor_chaining obj=new Constructor_chaining("aman",23);
    }
}
