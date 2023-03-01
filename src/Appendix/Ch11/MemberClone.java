package Appendix.Ch11;

public class MemberClone implements Cloneable { // Cloneable : 복제할 수 있다는 표시!

    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public MemberClone(String id, String name, String password, int age, boolean adult){
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }

    public MemberClone getMember(){
        MemberClone cloned = null;
        try{
            cloned = (MemberClone) clone(); // clone() 메소드의 리턴 타입은 Object 이므로 Member 타입으로 캐스팅해야함
        }catch (CloneNotSupportedException e){

        }
        return cloned;
    }
}
