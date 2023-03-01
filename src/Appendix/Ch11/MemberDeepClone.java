package Appendix.Ch11;

import java.util.Arrays;

public class MemberDeepClone implements Cloneable{
    public String name;
    public int age;

    // 아래 scores, car 필드는 모두 참조 타입이므로 깊은 복제 대상
    public int[] scores;
    public Car car;

    public MemberDeepClone(String name, int age, int[] scores, Car car){
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{ // clone() 메소드 재정의
        // 먼저 얕은 복사를 해서 name, age를 복제
        MemberDeepClone cloned = (MemberDeepClone) super.clone(); // Object의 clone() 호출
        // scores를 깊은 복제
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        // car를 깊은 복제
        cloned.car = new Car(this.car.model);
        // 깊은 복제된 Member 객체를 리턴
        return cloned;
    }

    public MemberDeepClone getMember(){
        MemberDeepClone cloned = null;
        try{
            cloned = (MemberDeepClone) clone(); // 재정의된 clone() 메소드 호출
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
